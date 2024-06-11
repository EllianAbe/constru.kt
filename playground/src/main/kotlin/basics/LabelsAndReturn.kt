package com.playground.basics

fun main() {

//    for (i in 1..10) {
//        println("i = $i")
//
//        if (i == 5) break
//
//    }
//    exploreLabels()
    var result = labeleach()

    print("result = $result")
}

fun exploreLabels() {
    loop@ for (i in 1..10) {
        innerloop@ for (j in 1..10) {
            if (j == 5) continue@loop
            println("i = $i, j = $j")
        }
    }
}

fun labeleach() {
    listOf(1, 2, 3, 4).forEach each@{
        if(it == 3) return@each
        println(it)
    }

}