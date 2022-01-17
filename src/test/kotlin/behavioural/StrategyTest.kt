package behavioural

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StrategyTest {
    @Test
    fun testStrategy() {
        val inputString = "Daniel Monteiro"

        val lowerCasePrinter = Printer(lowercaseFormatter)
        lowerCasePrinter.printString(inputString)

        val uppercasePrinter = Printer(uppercaseFormatter)
        uppercasePrinter.printString(inputString)

        Assertions.assertEquals("daniel monteiro", lowerCasePrinter.getStringFormatted())
        Assertions.assertEquals("DANIEL MONTEIRO", uppercasePrinter.getStringFormatted())
    }
}

