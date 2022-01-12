package structural

/*
* Design Pattern Adapter: Esse design patterns está relacionado à conversão de dados entre classes dieferentes. Utiliza-se
*                       uma interface que servirá para criar a classe Adapter que será a classe conversora de dados.
*
* Design Pattern Adapter: These design patterns are related to converting data between different classes. is used
*                       an interface that will be used to create the Adapter class that will be the data converter class.
*
* */

data class DisplayDataType(val index: Float, val data: String)

class DataDisplay {
    fun displayData(data: DisplayDataType) {
        println("Data is displayed: ${data.index} - ${data.data}")
    }
}

data class DatabaseData(val position: Int, val amount: Int)

class DatabaseDataGenerator {
    fun generateData(): List<DatabaseData> {
        val list = arrayListOf<DatabaseData>()
        list.add(DatabaseData(2, 2))
        list.add(DatabaseData(3, 7))
        list.add(DatabaseData(4, 23))
        return list
    }
}

interface DatabaseDataConverter {
    fun convertData(data: List<DatabaseData>): List<DisplayDataType>
}

class DataDisplayAdapter(val display: DataDisplay): DatabaseDataConverter {
    override fun convertData(data: List<DatabaseData>): List<DisplayDataType> {
        val returnList = arrayListOf<DisplayDataType>()
        for (datum in data) {
            val ddt = DisplayDataType(datum.position.toFloat(), datum.amount.toString())
            display.displayData(ddt)
            returnList.add(ddt)
        }
        return returnList
    }
}
