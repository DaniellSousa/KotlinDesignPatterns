package behavioural

import org.junit.jupiter.api.Test

class MediatorTest {
    @Test
    fun testMediator() {
        val mediator = Mediator()
        val daniel = ChatUser(mediator, "Daniel")
        val uncleBob = ChatUser(mediator, "Uncle Bob")
        val ingrid = ChatUser(mediator, "Ingrid")

        mediator.addUser(daniel).addUser(uncleBob).addUser(ingrid)
        uncleBob.send("Hi Everyone!")
    }
}