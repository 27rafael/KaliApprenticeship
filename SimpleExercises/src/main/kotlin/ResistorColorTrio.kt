import kotlin.math.pow

fun ResistorColorTrio(color1: String, color2: String, color3: String): String {
    var first = 0
    var second = 0
    var third = 0


    when (color1) {
        "Black" -> first = 0
        "Brown" -> first = 1
        "Red" -> first = 2
        "Orange" -> first = 3
        "Yellow" -> first = 4
        "Green" -> first = 5
        "BLue" -> first = 6
        "Violet" -> first = 7
        "Grey" -> first = 8
        "White" -> first = 9
    }
    when (color2) {
        "Black" -> second = 0
        "Brown" -> second = 1
        "Red" -> second = 2
        "Orange" -> second = 3
        "Yellow" -> second = 4
        "Green" -> second = 5
        "BLue" -> second = 6
        "Violet" -> second = 7
        "Grey" -> second = 8
        "White" -> second = 9
    }
    when (color3) {
        "Black" -> third = 0
        "Brown" -> third = 1
        "Red" -> third = 2
        "Orange" -> third = 3
        "Yellow" -> third = 4
        "Green" -> third = 5
        "BLue" -> third = 6
        "Violet" -> third = 7
        "Grey" -> third = 8
        "White" -> third = 9
    }



    first *= 100
    second *= 10
    val final: Double = (first.toDouble() + second.toDouble()) + 10.0.pow(third)

    return if (final == 1000.0) {
        val x = final - (10.0.pow(3))
        "${x.toInt()} kiloohms"
    } else "${final.toInt()} ohms"

}