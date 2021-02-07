package com.example.patterns_dunets_l23.behavioral

fun main() {

    val context = UserContext().apply {
        setStrategy(StrategyMultiply())
    }

    println(context.executeStrategy(4, 10))
}

interface Strategy {

    fun execute(a: Int, b: Int) : Int
}

class StrategyAdd: Strategy{

    override fun execute(a: Int, b: Int): Int {
        return a + b
    }
}

class StrategySubstact: Strategy {

    override fun execute(a: Int, b: Int): Int {
       return a - b
    }
}

class StrategyMultiply: Strategy {

    override fun execute(a: Int, b: Int): Int {
       return a * b
    }
}

class UserContext {

    private var strategy: Strategy? = null

    fun setStrategy(newStrategy: Strategy) {
        strategy = newStrategy
    }

    fun executeStrategy(a: Int, b: Int) {
        strategy?.execute(a, b)
    }
}