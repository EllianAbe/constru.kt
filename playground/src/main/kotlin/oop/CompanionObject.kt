package oop

class Location(){
    companion object {
        const val COUNTRY = "BRAZIL"
        fun getCountry() = "BRAZIL"
    }
}

fun main(){
    println(Location.getCountry())
    println(Location.COUNTRY)
}