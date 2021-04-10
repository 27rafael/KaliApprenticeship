class SpaceAge(val age: Int) {

    private fun ageFor(planet: String): Double {
        return age.toDouble().let {
            when (planet) {
                "Earth" -> it / secondsOnEarth
                "Mercury" -> it / secondsOnMercury
                "Venus" -> it / secondsOnVenus
                "Mars" -> it / secondsOnMars
                "Jupiter" -> it / secondsOnJupiter
                "Saturn" -> it / secondsOnSaturn
                "Uranus" -> it / secondsOnUranus
                "Neptune" -> it / secondsOnNeptune
                else -> 0.0
            }
        }

    }

    fun onEarth(): Double = ageFor("Earth")

    fun onMercury(): Double = ageFor("Mercury")


    companion object {
        const val secondsOnEarth = 31557600
        const val secondsOnMercury = 7595341.5312
        const val secondsOnVenus = 19400860.79136
        const val secondsOnMars = 59313407.0688
        const val secondsOnJupiter = 374099426.64
        const val secondsOnSaturn = 928656296.928
        const val secondsOnUranus = 2649555255.46
        const val secondsOnNeptune = 5196859067.52
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