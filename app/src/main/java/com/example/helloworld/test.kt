package com.example.helloworld

class Person(val name: String, val age: Int = 20)


    fun main() {

        val p = Person("Jhon")
        print(p.name)
    }
