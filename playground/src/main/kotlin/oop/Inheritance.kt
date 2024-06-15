package oop

open class User(val name: String) {
    open var isLoggedIn : Boolean = true;
    fun printName() {
        println("Name = $name")
    }

    open fun login(){
        println("Inside user login")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false
    override fun login(){
        println("Inside student login")
        super.login()
    }
}

class Instructor(name: String) : User(name) {
}

fun main(){

    val student = Student("student")
    val instructor = Instructor("instructor")

    student.printName()
    println("isLoggedIn = ${student.isLoggedIn}")
    instructor.printName()

    student.login()
    instructor.login()


}