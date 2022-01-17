package behavioural

/*
* Design Pattern State: Para tratar a mudança de comportamento de uma classe quando seu estado também muda. Esta técnica
*                   faz com que um objeto mude sua ação de acordo com um estado interno da classe.
*
* Design Pattern State: To handle changing a class's behavior when its state also changes. this technique
*                   causes an object to change its action according to an internal state of the class.
*
* */

sealed class AuthorizationState

object Unauthorized : AuthorizationState()

class Authorized(val username: String) : AuthorizationState()

class AuthorizationPresenter {
    private var state: AuthorizationState = Unauthorized

    val isAuthorized: Boolean
        get() = when (state) {
            is Authorized -> true
            is Unauthorized -> false
        }

    val username: String
        get() {
            return when (val state = this.state) {
                is Authorized -> state.username
                is Unauthorized -> "Unknown"
            }
        }

    fun loginUser(username: String) {
        state = Authorized(username)
    }

    fun logoutUser() {
        state = Unauthorized
    }

    override fun toString() = "User $username is logged in: $isAuthorized"
}
