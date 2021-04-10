import org.junit.jupiter.api.Test
import org.testng.AssertJUnit.assertEquals


class ResistorColorTest {

    @Test
    fun `Given the color name black, it returns a 0`() = assertEquals(0, ResistorColor.colorCode("black"))

    @Test
    fun `Given the color name white, it returns a 9`() = assertEquals(9, ResistorColor.colorCode("white"))

    @Test
    fun `Given the color name orange, it returns a 3`() = assertEquals(3, ResistorColor.colorCode("orange"))

    @Test
    fun testColors() {
        val expected = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
        assertEquals(expected, ResistorColor.colors())
    }
}