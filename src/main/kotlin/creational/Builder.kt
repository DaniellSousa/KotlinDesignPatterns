package creational

/*
* Design Pattern Builder: Para ajudar na criação de objetos que tenham muitos parâmetros nos contrutores. Isso é uma má
*                       prática(vários parâmetros em uma função) e no caso de alguns desses construtores serem opcionais
*                       será necessário a criação de outros construtores que se comportam de maneira deiferente(sobrescrita de métodos).
*
* Deisgn Pattern Builder: To help with creating objects that have many parameters in the constructors. that's a bad
*                       practical(multiple parameters in one function) and in case some of these constructors are optional
*                       it will be necessary to create other constructors that behave differently (method override).
* */

class Component private constructor(builder: Builder) {
    var param1: String? = null
    var param2: Int? = null
    var param3: Boolean? = null

    class Builder {
        private var param1: String? = null
        private var param2: Int? = null
        private var param3: Boolean? = null

        fun setParam1(param1: String) = apply { this.param1 = param1 }
        fun setParam2(param2: Int) = apply { this.param2 = param2 }
        fun setParam3(param3: Boolean) = apply { this.param3 = param3 }

        fun build() = Component(this)

        fun getParam1() = param1
        fun getParam2() = param2
        fun getParam3() = param3
    }

    init {
        param1 = builder.getParam1()
        param2 = builder.getParam2()
        param3 = builder.getParam3()
    }
}
