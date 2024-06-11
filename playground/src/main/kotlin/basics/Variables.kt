package com.playground.basics
fun main(){

    val name = "Ellian"
    var age = 23

    println(name)

    age = 24
    println(age)

    val salary = 10000L;
    val course = "Kotlin Spring"

    print("course = $course, length = ${course.length}")

    var multiline = """
        abc
        def
        geh
    """.trimIndent()

    println(multiline)


}