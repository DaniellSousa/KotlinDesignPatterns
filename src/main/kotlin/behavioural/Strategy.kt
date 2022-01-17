package behavioural

/*
* Design Pattern Strategy: Consiste em separar a lógica dos negócios em várias partes, cujo essas partes seriam as estratégias.
*                       Isso ajuda a poder alterar várias partes do programa sem mudar a estrutura do projeto como um todo.
*
* Design Pattern Strategy: It consists of separating the business logic into several parts, whose parts would be the strategies.
*                       It helps to be able to change various parts of the program without changing the structure of the project as a whole.
*
* */

class Printer(private val stringFormatterStrategy: (String) -> String) {
    private var stringPrintted: String = ""
    fun printString(message: String) {
        println(stringFormatterStrategy(message))
        stringPrintted = stringFormatterStrategy(message)
    }

    fun getStringFormatted(): String = stringPrintted
}

val lowercaseFormatter = {it: String -> it.toLowerCase()}
val uppercaseFormatter = {it: String -> it.toUpperCase()}
