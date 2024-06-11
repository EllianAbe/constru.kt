package oop

import java.time.LocalDate

class Person(var name: String = "", var age: Int = 0) {

    var email: String = ""
    var nameLength: Int = 0
    constructor(_email: String, _name: String = "", _age: Int = 0) :this(_name, _age) {
        email = _email
    }

    init{
        nameLength = name.length
    }

    fun walk(){
        println("$name isWalking")
    }
    fun showDetails() {
        println("Name = $name, age = $age, email = $email, nameLength = $nameLength")
    }
}



fun main(){

    val person = Person("Ellian", 23)
    person.walk()
    person.showDetails()

    val person2  = Person(_email = "l5yJt@example.com")
    person2.showDetails()
}