package functions

import java.time.LocalDate

fun main() {
//    printName("Ellian")
//
//    var result = add(1, 2)
//    println("result = $result")
//
//    var result2 = addAproach(1, 2)
//    println("result2 = $result2")
    printPearsonDetails(age = 10)
}

fun printName(name: String) {
    println("Name is $name")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun addAproach(a: Int, b: Int) = a + b

fun printPearsonDetails(name: String = "", age: Int, dob: LocalDate = LocalDate.now()){

    println("Name = $name, age = $age, dob = $dob")
}