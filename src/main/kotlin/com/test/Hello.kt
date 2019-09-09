package com.test

fun main() {
//    println("Hello World")
    var h = Human()
    h.hello()

    var age = 19
    age = 20
    var weight = 66.5
    val name: String
    name = "Tom"
}

class Human {
    fun hello() {
        println("Hello Kotlin")
    }
}