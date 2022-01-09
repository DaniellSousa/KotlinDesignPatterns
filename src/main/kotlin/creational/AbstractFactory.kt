package creational

import java.lang.IllegalArgumentException

/*
*
* Design Pattern Abstract Factory: Para facilitar o acesso a classes com diferentes relações sem se preocupar com a implementação.
*                               Por exemplo: a classe Display acessar o pacote DataSource, o qual no pacote data source
*                               prover várias outras classes de acesso a banco de dados local ou buscar os dados de um
*                               servidor. Uma classe abstrata("factory") é imbutida no meio dessa comunicação entre classes.
*
* Design Pattern Abstract Factory: To facilitate accessing classes with different relationships without worrying about implementation.
*                               For example, the Display class accesses the DataSource package, which is not the data source package
*                               provide several other classes to access a local database or fetch data from a
*                               server. An abstract class ("factory") is embedded in the middle of this communication between classes.
*
* */

interface  DataSource

class DatabaseDataSource: DataSource
class NetworkDataSource: DataSource

abstract class DataSourceFactory {
    abstract fun makeDataSource(): DataSource

    companion object {
        inline fun <reified T: DataSource> createFactory(): DataSourceFactory =
            when (T::class) {
                DatabaseDataSource::class -> DatabaseFactory()
                NetworkDataSource::class -> NetworkFactory()
                else -> throw IllegalArgumentException()
            }
    }
}

class NetworkFactory: DataSourceFactory() {
    override fun makeDataSource(): DataSource {
        return NetworkDataSource()
    }
}

class DatabaseFactory: DataSourceFactory() {
    override fun makeDataSource(): DataSource {
        return DatabaseDataSource()
    }
}
