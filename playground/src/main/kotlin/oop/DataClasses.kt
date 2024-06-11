package oop

data class Course(
    val id: Int,
    val name: String,
    val duration: Int = 0,
    val instructor: String)

fun main(){

    val course1 = Course(1, "Kotlin", 6, "Ellian")
    val course2 = Course(1, "Kotlin", 6, "Ellian")

    println(course1)

    println("Checking equality: ${course1 == course2}")
}