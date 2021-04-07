fun SpaceAge(age: Int, planet:String): Double {

    return when(planet){
        "Earth" -> age/31557600.0
        "Mercury" -> age/7595341.5312
        "Venus" -> age/19400860.79136
        "Mars" -> age/59313407.0688
        "Jupiter" -> age/374099426.64
        "Saturn" -> age/928656296.928
        "Uranus" -> age/2649555255.46
        "Neptune" -> age/5196859067.52
        else -> 0.0
    }
//    val secondsOnEarth = 31557600
//    val secondsOnMercury = 7595341.5312
//    val secondsOnVenus = 19400860.79136
//    val secondsOnMars = 59313407.0688
//    val secondsOnJupiter = 374099426.64
//    val secondsOnSaturn = 928656296.928
//    val secondsOnUranus = 2649555255.46
//    val secondsOnNeptune = 5196859067.52
}