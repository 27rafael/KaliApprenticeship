import org.junit.Test
import kotlin.test.assertEquals

class SpaceAgeTest {

    @Test
    fun ageOnEarth() {
        val age = SpaceAge(1000000000)

        assertEquals(31.69, age.onEarth())
    }

    @Test
    fun ageOnMercury() {
            val age = SpaceAge(2134835688)

        assertEquals(280.88, age.onMercury())
    }

    @Test
    fun ageOnVenus() {
        val age = SpaceAge(189839836)
    }
}