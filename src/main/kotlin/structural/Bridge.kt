package structural

/*
* Design Patern Bridge: Essa técnica serve para separar abstração de implementação. Principalmente qando existe muitas
*                   abstrações em uma funcionalidade de negócio. Uma interface bridge é criada como ponte de ligação entre
*                   a abstração e as implementações.
*
* Design Patern Bridge: This technique serves to separate abstraction from implementation. Especially when there are many
*                   abstractions in a business functionality. A bridge interface is created as a bridge between
*                   abstraction and implementations.
*
* */

interface Device {
    var volume: Int
    fun getName(): String
}

class Radio: Device {
    override var volume = 0
    override fun getName() = "Radio $this"
}

class TV: Device {
    override var volume = 0
    override fun getName() = "TV $this"
}

interface Remote {
    fun volumeUp()
    fun volumeDown()
}

class BasicRemote(val device: Device): Remote {
    override fun volumeUp() {
        device.volume++
        println("${device.getName()} volume up: ${device.volume}")
    }

    override fun volumeDown() {
        device.volume--
        println("${device.getName()} volume up: ${device.volume}")
    }
}
