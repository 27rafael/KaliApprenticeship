fun RNATranscription(DNA:Char):Char{
    return when(DNA){
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else -> ' '
    }
}