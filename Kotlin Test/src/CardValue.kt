fun main() {
    var cardValue: Int = 3000

    var cardLevel: String? = null
    when (cardValue) {
        in 0..999 -> cardLevel = "pearl"
        in 1000..4999 -> cardLevel = "silver"
        in 5000..9999 -> cardLevel = "gold"
        else -> cardLevel = "platinum"
    }

    println(cardValue)
    println(cardLevel)
}