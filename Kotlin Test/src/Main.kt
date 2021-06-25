fun main(args: Array<String>) {
    val int: Int = 7
    val float: Float = 7.6F
    val long: Long = 9123456789L
    val char: Char = 'a'
    var string: String = "Hello World!"
    var longString: String = """
        This is practice code.
        Please be patient.
        Thank you.
    """.trimIndent()

    var age = 18

    when (age) {
        in 0..18 -> println("Kid")
        in 19..35 -> println("Young adult")
        in 35..60 -> println("Mid-age")
        else -> println("Senior")
    }

    val opvar = '+'

    fun calcFunct(expression: Char, num1: Int, num2: Int): Int? {
        when (expression) {
            '+' -> return num1 + num2
            '-' -> return num1 - num2
            '*' -> return  num1 * num2
            '/' -> return num1 / num2
            else -> return null
        }
    }

    var students = listOf<String>("Sarah", "John", "McCleece")

    var randNum: Int = 0
    var check = if (randNum == 0) true else false

    var myMap = mutableMapOf(1 to "John", 2 to "Sarah", 3 to "McCleese", 4 to "Ysdra")

    var dupList = mutableListOf(1,2,2,2,2,2,3,4,5,6,6,6)

    println(int)
    println(float)
    println(long)
    println(char)
    println(string)
    println(longString)
    println(int.toFloat())
    println("Test string printing $int and $long")
    println(calcFunct('+', 6, 5))

    for ((index, student) in students.withIndex()) {
        println("${index + 1}. $student")
    }

    println("${students.size}")
    println(check)

    println(myMap.getOrDefault(5, "Not here"))
    println(myMap)
    println(myMap[1])

    myMap[1] = "Johnny"

    println(myMap)
    println(dupList.toMutableSet())

    if (args.any()) {
        for (arg in args) {
            println(arg)
        }
    }

    var derick = Human("Derick", 22, "Male")
    var default = Human()

    println(derick)
    println(default.toString())
    println(Human.showInstances())
}