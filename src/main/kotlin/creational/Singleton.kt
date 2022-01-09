package creational

/*
Design Pattern Singleton: Evitar que várias intâncias sejam criadas e não ocorrer excesso de uso de memória. Em casos
                        que a classe seja usada no projeto em vários lugares(classes) dieferentes.

Design Pattern Singleton: Prevent multiple instances from being created and excess memory usage does not occur. in cases
                        that the class is used in the project in several different places (classes).

* Look the test of this file (Singleton)

 */

object NetworkDriver {
    init {
        println("Initialization $this")
    }
    fun log(): NetworkDriver = apply { println("Network driver: $this") }
}