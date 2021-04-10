import kotlin.math.pow

object ResistorColor {


    fun value(color: Color, color2: Color, vararg others: Color): Int {
        return (color.valor * 10) + color2.valor
    }

    fun colorCode(colorName: String): Int {
        return Color.values().find { it.name.equals(colorName, ignoreCase = true) }?.valor ?: -1
    }

    fun colors(): List<String> {
        return Color.values().map { it.name.toLowerCase() }
    }

    fun text(color: Color, color2: Color, color3: Color):String {


        val colorValue1 = color.valor * 100
        val colorValue2 = color2.valor * 10
        val colorValue3 = color3.valor
        val final: Double = (colorValue1.toDouble() + colorValue2.toDouble()) + 10.0.pow(colorValue3)

        return if (final == 1000.0) {
            val x = final - (10.0.pow(3))
            "${x.toInt()} kiloohms"
        } else "${final.toInt()} ohms"
    }
}

enum class Color(val valor: Int) {
    BLACK(0),
    BROWN(1),
    RED(2),
    ORANGE(3),
    YELLOW(4),
    GREEN(5),
    BLUE(6),
    VIOLET(7),
    GREY(8),
    WHITE(9)
}