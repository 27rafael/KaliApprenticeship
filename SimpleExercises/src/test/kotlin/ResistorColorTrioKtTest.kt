
import kotlin.test.assertEquals
import Color.*
import org.junit.Test

class ResistorColorTrioTest {

    @Test
    fun `orange orange black`() = assertEquals("33 ohms", ResistorColor.text(ORANGE, ORANGE, BLACK))

    @Test
    fun `blue grey brown`() = assertEquals("680 ohms", ResistorColor.text(BLUE, GREY, BROWN))

    @Test
    fun `red black red`() = assertEquals("2 kiloohms", ResistorColor.text(RED, BLACK, RED))

    @Test
    fun `green brown orange`() = assertEquals("51 kiloohms", ResistorColor.text(GREEN, BROWN, ORANGE))

    @Test
    fun `yellow violet yellow`() = assertEquals("470 kiloohms", ResistorColor.text(YELLOW, VIOLET, YELLOW))

    @Test
    fun `yellow violet violet`() = assertEquals("470 megaohms", ResistorColor.text(YELLOW, VIOLET, VIOLET))
}