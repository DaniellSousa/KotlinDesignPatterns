package structural

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FacadeTest {
    @Test
    fun testFacade() {
        val userRepository = UserRepository()
        val user = User("daniel")
        userRepository.save(user)

        val retrievedUser = userRepository.findFirst()

        Assertions.assertEquals("daniel", retrievedUser.login)
    }
}