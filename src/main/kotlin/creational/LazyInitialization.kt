package creational


/*
* Design Pattern Lazy Initialization: Este design pattern é uma técnica relacionada ao gerenciamento de memória. Essa técnica
*                                   se trata de criar a instância da variável somente quando ela for ser usada, para evitar
*                                   que armazene memória demais durante a exeução da aplicação(tela aberta). Com muitas "variáveis
*                                   grandes"(que armazenam muita memória) isso pode se tornar um grande problema.
*
* Design Pattern Lazy Initialization: This design pattern is a technique related to memory management. this technique
*                                   this is about creating an instance of the variable only when it is used, to avoid
*                                   that stores too much memory during application execution (open screen). With many "variables
*                                   large" (which store a lot of memory) this can become a big problem.
* */

class AlertBox {
    var message: String? = null
    fun show() {
        println("AlertBox $this: $message")
    }
}

class Window {
    val box by lazy { AlertBox() }

    fun showMessage(message: String) {
        box.message = message
        box.show()
    }
}

class Window2 {
    lateinit var box: AlertBox

    fun showMessage(message: String) {
        box = AlertBox()
        box.message = message
        box.show()
    }
}