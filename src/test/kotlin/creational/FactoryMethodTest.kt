package creational

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FactoryMethodTest {

    @Test
    fun currencyTest() {
        val greekCurrency = CurrencyFactory.currencyForFactory(Greece()).code
        println("Greek currency: $greekCurrency")

        val usaCurrenncy = CurrencyFactory.currencyForFactory(USA()).code
        println("USA currency: $usaCurrenncy")

        val canadaCurrency = CurrencyFactory.currencyForFactory(Country.Canada).code
        println("Canada currency: $canadaCurrency")

        Assertions.assertEquals("EURO", greekCurrency)
        Assertions.assertEquals("DOLAR", usaCurrenncy)
        Assertions.assertEquals("DOLAR CANADA", canadaCurrency)
    }
}