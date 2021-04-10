import org.junit.Test

import kotlin.test.assertEquals

class ResistorColorDuoTest {

    @Test
    fun `brown and black`() = assertEquals(10, ResistorColor.value(Color.BROWN, Color.BLACK))

    @Test
    fun `blue and grey`() = assertEquals(68, ResistorColor.value(Color.BLUE, Color.GREY))

    @Test
    fun `yellow and violet`() = assertEquals(47, ResistorColor.value(Color.YELLOW, Color.VIOLET))

    @Test
    fun `orange and orange`() = assertEquals(33, ResistorColor.value(Color.ORANGE, Color.ORANGE))

    @Test
    fun `ignore additional colors`() {
        assertEquals(51, ResistorColor.value(Color.GREEN, Color.BROWN, Color.ORANGE))
        assertEquals(51, ResistorColor.value(Color.GREEN, Color.BROWN, Color.ORANGE, Color.YELLOW, Color.GREY))
    }

}