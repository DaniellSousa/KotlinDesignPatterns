package structural

/*
* Design Pattern Facade: Técnica usada para simplficar problemas complexos utilizando "interfaces de simplificação".
*
* Design Pattern Facade: Technique used to simplify complex problems using "simplification interfaces".
*
* */

// Pequeno exemplo de classe/problema complexo:
class ComplexSystemStore(private val filePath: String) {
    private val cache: HashMap<String, String>

    init {
        println("Reading data from the file: $filePath")
        cache = HashMap()
    }

    fun store(key: String, value: String) {
        cache[key] = value
    }

    fun read(key: String) = cache[key] ?: ""

    fun commit() = println("Storing cached data to file $filePath")
}
//

data class User(val login: String)

// Facade:
class UserRepository {
    private val systemPreferences = ComplexSystemStore("/data/default.prefs")

    fun save(user: User) {
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("USER_KEY"))
}
//