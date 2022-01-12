package structural

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AdapterTest {

    @Test
    fun adapterTest() {
        val generator = DatabaseDataGenerator()
        val generatedData = generator.generateData()
        val adapter = DataDisplayAdapter(DataDisplay())
        val convertData = adapter.convertData(generatedData)

        Assertions.assertEquals(3, convertData.size)
        Assertions.assertEquals(3f, convertData[1].index)
        Assertions.assertEquals("7", convertData[1].data)
    }
}