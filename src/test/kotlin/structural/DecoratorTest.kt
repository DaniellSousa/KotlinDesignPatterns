package structural

import org.junit.jupiter.api.Test

class DecoratorTest {
    @Test
    fun testDecorator() {
        val normalMachine = NormalCoffeeMachine()
        val enhacedMachine = EnhacedCoffeeMachine(normalMachine)

        enhacedMachine.makeSmallCoffee()
        println("---------------")
        enhacedMachine.makeLargeCoffee()
        println("---------------")
        enhacedMachine.makeMilkCoffee()
    }
}