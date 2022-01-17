package behavioural

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StateTest {

    @Test
    fun testState() {
        val authorizationPresenter = AuthorizationPresenter()

        authorizationPresenter.loginUser("admin")
        println(authorizationPresenter)
        Assertions.assertEquals(true, authorizationPresenter.isAuthorized)
        Assertions.assertEquals("admin", authorizationPresenter.username)

        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        Assertions.assertEquals(false, authorizationPresenter.isAuthorized)
        Assertions.assertEquals("Unknown", authorizationPresenter.username)
    }
}