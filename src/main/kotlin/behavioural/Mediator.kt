package behavioural

/*
* Design Pattern Mediator: Propõe um objeto que serve como cominicação entre outros objetos. Reduz as dependências entre
*                       classes.
*
* Design Pattern Mediator: It proposes an object that serves as communication between other objects. Reduce dependencies between
*                       classes.
*
* */

class ChatUser(private val mediator: Mediator, private val name: String) {
    fun send(msg: String) {
        println("$name: Sending message $msg")
        mediator.sendMessage(msg, this)
    }

    fun receive(msg: String) {
        println("$name: Received message: $msg")
    }
}

class Mediator {
    private val users = arrayListOf<ChatUser>()

    fun sendMessage(msg: String, user: ChatUser) {
        users.filter { it != user }.forEach { it.receive(msg) }
    }

    fun addUser(user: ChatUser): Mediator = apply { users.add(user) }
}
