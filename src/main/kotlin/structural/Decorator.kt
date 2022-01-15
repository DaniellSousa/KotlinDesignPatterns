package structural

/*
* Design Pattern Decorator: É a ideia de adicionar um novo comportamento ao objeto, seja por meio de uma sobrescrita ou adicionando
*                       novos métodos além dos sobrescritos das interfaces ou classes superiores.
*
* Design Pattern Decorator: It's the idea of ​​adding new behavior to the object, either by overwriting it or by adding
*                       new methods in addition to overriding interfaces or higher classes.
* */

interface CoffeeMachine {
    fun makeSmallCoffee()
    fun makeLargeCoffee()
}

class NormalCoffeeMachine(): CoffeeMachine {
    override fun makeSmallCoffee() {
        println("Normal coffee machine: Making small coffee")
    }

    override fun makeLargeCoffee() {
        println("Normal coffee machine: Making large coffee")
    }
}

// Decorator:
class EnhacedCoffeeMachine(private val coffeeMachine: CoffeeMachine): CoffeeMachine by coffeeMachine {
    override fun makeLargeCoffee() {
        println("Enhanced coffee machine: Making large coffee")
    }

    // Extending behaviour
    fun makeMilkCoffee() {
        println("Enhanced coffee machine: Making milk coffee")
        coffeeMachine.makeSmallCoffee()
        println("Enhanced coffee machine: Adding milk")
    }
}
