import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

data class Item(
    val id: Int,
    val listId: Int,
    val name: String?
)

fun getSecondPart(name: String): String {
    val parts = name.split(" ")
    return if (parts.size > 1) parts[1] else name
}

fun main() {
    val filePath = "data.json"
    val jsonString = File(filePath).readText()
    val gson = Gson()
    val itemType = object : TypeToken<List<Item>>() {}.type
    val items: List<Item> = gson.fromJson(jsonString, itemType)

    // Filter Null
    val filteredItems = items.filter { !it.name.isNullOrBlank() }

    // Group and Sort
    val groupedItems = filteredItems.groupBy { it.listId }
    val sortedGroupedItems = groupedItems.toSortedMap().mapValues { (_, itemList) ->
        itemList.sortedWith(compareBy({ it.id }, {
            getSecondPart(it.name!!)
        }))
    }

    // Print Result
    for ((listId, items) in sortedGroupedItems) {
        println("List ID: $listId")
        items.forEach { println(it) }
        println()
    }
}
