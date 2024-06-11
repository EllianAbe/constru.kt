package com.playground.basics



fun main() {
//    var range = 1..10
//
//    for (i in range){
//        println("i = $i")
//    }
//
//    var reverseRange = 10 downTo 1
//
//    for (i in reverseRange){
//        println("reversed range i = $i")
//    }
//
//    var stepedRange = 1..10 step 2
//    for (i in stepedRange){
//        println("skipped range i = $i")
//    }
    exploreWhile()
}

fun exploreWhile(){

    var i = 0
    while (i < 10){
        println("while i = $i")
        i++
    }

    i = 0
    do {
        println("do while i = $i")
        i++
    } while (i < 10)
}