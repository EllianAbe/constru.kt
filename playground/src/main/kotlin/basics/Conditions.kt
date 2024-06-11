package com.playground.basics

fun main() {
    var name = "Ellian";
    //name = "John"

    val result = if (name.length == 6) {
        println("Name is 6 characters")
        name.length
    } else {
        println("Name is not 6 characters")
        name.length
    }

    println("result = $result")

    var position = 1;
    position = 2

    var medal = if(position == 1) {
        "GOLD"
    } else if(position == 2) {
        "SILVER"
    } else if(position==3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    medal = when (position) {
        1 -> {
            "GOLD"
        }
        2 -> {
            "SILVER"
        }
        3 -> {
            "BRONZE"
        }
        else -> {
            "NO MEDAL"
        }
    }

}