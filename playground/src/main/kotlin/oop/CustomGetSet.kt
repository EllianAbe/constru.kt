package oop

class Item {
    var name = ""
    var price = 0.0
    get(){
        println("getting price")
        return field
    }
    set(value) {

        if (value <= 0) {
            throw IllegalArgumentException("price cannot be negative")
        } else {
            println("setting price $value")
            field = value
        }

    }
    constructor(_name: String){
        name = _name
    }

}

fun main() {
    val item = Item(_name="Item 1")
    item.price = 10.0
    println(item.price)
    item.price = 0.00
}