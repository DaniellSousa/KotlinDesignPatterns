package creational

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrototypeTest {
    @Test
    fun testPrototype() {
        ShapeCache.loadCache()
        val clonedShape1 = ShapeCache.getShape("1")
        val clonedShape2 = ShapeCache.getShape("2")
        val clonedShape3 = ShapeCache.getShape("3")

        clonedShape1.draw()
        clonedShape2.draw()
        clonedShape3.draw()

        Assertions.assertEquals("Circle", clonedShape1.type)
        Assertions.assertEquals("Square", clonedShape2.type)
        Assertions.assertEquals("Rectangle", clonedShape3.type)
    }
}