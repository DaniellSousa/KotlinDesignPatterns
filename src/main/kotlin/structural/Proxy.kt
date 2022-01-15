package structural

/*
* Design Pattern Proxy: Permite criar alguma funcionalidade antes e/ou depois de chamar o objeto referente a uma classe.
*
* Design Pattern Proxy: Allows you to create some functionality before and/or after calling the object referring to a class.
*
* */

interface Image {
    fun display()
}

class RealImage(private val filename: String): Image {
    override fun display() {
        println("RealImage: Display $filename")
    }

    private fun loadFromDisk(filename: String) {
        println("RealImage: Loading $filename")
    }

    init {
        loadFromDisk(filename)
    }
}

class ProxyImage(private val filename: String): Image {
    private var realImage: RealImage? = null

    override fun display() {
        println("ProxyImage: Displaying $filename") // doing something after instantiate...
        if (realImage == null) {
            realImage = RealImage(filename)
        }
        realImage!!.display()
    }
}