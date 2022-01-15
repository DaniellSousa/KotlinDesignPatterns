package structural

/*
* Design Patter Composite: Técnica que permite criar objetos no sentido de árvore, considerando as dependências entre as
*                           classes relacionadas. Ajuda a manipular vários objetoss representados por um único.
*
* Design Pattern Composite: Technique that allows creating objects in the sense of a tree, considering the dependencies between the
*                           related classes. It helps to manipulate multiple objects represented by a single one.
* */

open class Equipment(
        open val price: Int,
        val name: String
)

open class Composite(name: String): Equipment(0, name) {
    private val equipments = ArrayList<Equipment>()

    override val price: Int
        get() = equipments.map { it.price }.sum()

    fun add(equipament: Equipment) = apply { equipments.add(equipament) }
}

class Computer: Composite("PC")
class Processor: Equipment(1000, "Processor")
class HardDrive: Equipment(250, "Hard Drive")
class Memory: Composite("Memory")
class ROM: Equipment(100, "Read Only Memory")
class RAM: Equipment(75, "Random Access Memory")