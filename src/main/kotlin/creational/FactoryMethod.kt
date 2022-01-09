package creational

/*
* Design Pattern Factory Method: Para prover o uso e a chamada de métodos para algo específico, que não pode ser acessado
*                               diretamente de um único lugar(ou única classe).
*                               Exemplo: Classe País que tem uma Moeda específica e a implementação da classe moeda
*                               depende do tipo de país, mesmo sem uma classe extender da outra. Uma classe é criada
*                               "no meio" dessa duas classes para haver a ligação entre as mesmas.
*
* Design Pattern Factory Method: To provide the use and call methods for something specific that cannot be accessed
*                               directly from a single place(or single class).
*                               Example: Country Class which has a specific Currency and the implementation of the Currency class
*                               depends on the type of country, even without an extender class of the other. A class is created
*                               "in the middle" of these two classes so that there is a connection between them.
*
* */

sealed class Country {
    object Canada: Country()
}

object Spain: Country()
class Greece: Country()
class USA: Country()

class Currency(val code: String)

object CurrencyFactory {
    fun currencyForFactory(country: Country): Currency =
        when (country) {
            is Spain -> Currency("EURO")
            is Greece -> Currency("EURO")
            is USA -> Currency("DOLAR")
            is Country.Canada -> Currency("DOLAR CANADA")
        }
}