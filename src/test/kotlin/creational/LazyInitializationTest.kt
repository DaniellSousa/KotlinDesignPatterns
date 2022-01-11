package creational

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WindowTest {

    @Test
    fun windowTest() {
        val window = Window()
        window.showMessage("Hello window")
        Assertions.assertNotNull(window.box)

        val window2 = Window2()
        window2.showMessage("Hello Window2")
        Assertions.assertNotNull(window2.box)
    }
}