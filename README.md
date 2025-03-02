
## Prerequisites

- [Kotlin](https://kotlinlang.org/docs/command-line.html) (Kotlin compiler)
- Java Development Kit (JDK 8 or higher)
- [Gson library](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.12.1/)

## To Compile

 1. run 'kotlinc extract.kt -classpath gson-2.12.1.jar -include-runtime -d result.jar'
 2. run 'java -cp "result.jar;.\gson-2.12.1.jar" ExtractKt'

 ## You may need to replace '.\gson-2-12.1.jar' with your specific verion and path
