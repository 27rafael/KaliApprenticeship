fun ResistorColor(num: Int): String {

    return when (num) {
        0 -> "Black"
        1 -> "Brown"
        2 -> "Red"
        3 -> "Orange"
        4 -> "Yellow"
        5 -> "Green"
        6 -> "BLue"
        7 -> "Violet"
        8 -> "Grey"
        9 -> "White"
        else -> "Not a color"
    }
}