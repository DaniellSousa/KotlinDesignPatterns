package behavioural

/*
* Design Pattern Command: Essa técnica permite criar um objeto que guarda todas as informações de um determinada solicitação.
*                       O objeto de comando é passado para o manipulador correto, e então os comandos são executados.
*
* Design Pattern Command: This technique allows you to create an object that holds all the information for a given request.
*                       The command object is passed to the correct handler.
*
* */

interface Command {
    fun execute()
}

class OrderAddCommand(val id: Long): Command {
    override fun execute() {
        println("Adding order with id $id")
    }
}

class OrderPayCommand(val id: Long): Command {
    override fun execute() {
        println("Paying for order with id $id")
    }
}

class CommandProcessor {
    private val queue = arrayListOf<Command>()

    fun addToQueue(command: Command): CommandProcessor = apply { queue.add(command) }

    fun processCommands(): CommandProcessor = apply {
        queue.forEach { command -> command.execute() }
        queue.clear()
    }
}
