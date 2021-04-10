fun transcribeToRna(dna : String) : String{
    return dna.toCharArray().joinToString("") { transcribeLetter(it.toString()) }
}

fun transcribeLetter(dnaLetter : String) : String{
    return when(dnaLetter){
        "G" -> "C"
        "C" -> "G"
        "T" -> "A"
        "A" -> "U"
        else -> " "
    }
}