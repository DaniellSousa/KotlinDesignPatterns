package structural

import org.junit.jupiter.api.Test

class ProxyTest {

    @Test
    fun testProxy() {
        val image = ProxyImage("test.jpg")

        // load image from disk
        image.display()
        println("----------------------")

        // load image from "cache"
        image.display()
    }
}