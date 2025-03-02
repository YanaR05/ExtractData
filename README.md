
## Prerequisites

- [Kotlin](https://kotlinlang.org/docs/command-line.html) (Kotlin compiler)
- Java Development Kit (JDK 8 or higher)
- [Gson library](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.12.1/)

## To Compile

 1. run 'kotlinc extract.kt -classpath gson-2.12.1.jar -include-runtime -d result.jar'
 2. run 'java -cp "result.jar;.\gson-2.12.1.jar" ExtractKt'

 You may need to change '\gson-2.12.1.jar' based on your directory or version

## The result should print out the dataset based on the following requirements:
 1. Display all the items grouped by "listId"
 2. Sort the results first by "listId" then by "name" when displaying.
 3. Filter out any items where "name" is blank or null.
