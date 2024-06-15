package oop

object Authentication {
    fun authenticateUser(userName: String, password: String) {
        println("User logged in: $userName")
    }
}

fun main(){
    Authentication.authenticateUser("Ellian", "password")
}