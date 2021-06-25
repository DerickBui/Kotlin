fun main() {
    // first way
    print("Enter a text: ")
    var text = readLine() ?: ""
    println("Your text length: ${text.length}")

    // second way
    print("Enter a text2: ")
    var text2 = readLine()
    println("Your text2 length: ${text2?.length}")

    // integer or double input
    print("Enter an integer or double: ")
    var numText = readLine() ?: ""
    val convertedNum = numText.toIntOrNull() ?: numText.toDoubleOrNull() ?: 0
    println("This number you entered is $convertedNum")

}

fun scanner() {

}