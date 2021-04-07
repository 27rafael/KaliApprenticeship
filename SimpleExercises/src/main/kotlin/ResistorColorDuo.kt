fun ResistorColorDuo(color1:String, color2:String):Int{
var first = 0
    var second = 0
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
    first*=10

    return first + second
}