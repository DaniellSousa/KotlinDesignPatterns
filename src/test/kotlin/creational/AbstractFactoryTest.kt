package creational

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AbstractFactoryTest {
    @Test
    fun abstractFactoryTest() {
        val dataSourceFactory = DataSourceFactory.createFactory<NetworkDataSource>() // if change to DatabaseDataSource will return a instance of it
        val dataSource = dataSourceFactory.makeDataSource()
        println("Created datasource $dataSource")

        Assertions.assertInstanceOf(NetworkDataSource::class.java, dataSource) // if you changed to DatabaseDataSource, change expectedType class to itself
        //Assertions.assertInstanceOf(DatabaseDataSource::class.java, dataSource)
    }
}