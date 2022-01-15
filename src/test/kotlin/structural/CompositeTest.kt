package structural

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CompositeTest {
    @Test
    fun testComposite() {
        val memory = Memory()
                .add(ROM())
                .add(RAM())
        val pc = Computer()
                .add(memory)
                .add(Processor())
                .add(HardDrive())

        println("PC price: ${pc.price}")

        Assertions.assertEquals("PC", pc.name)
        Assertions.assertEquals(1425, pc.price)
    }
}