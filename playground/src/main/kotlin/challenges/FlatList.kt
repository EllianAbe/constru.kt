package challenges

fun deflat(list: List<Any>): List<Any> {
    var output = mutableListOf<Any>()

    for(i in list){
        if(i is List<*>){
            output.addAll(deflat(i as List<Any>))
        } else{
            output.add(i)
        }
    }
    return output
}

fun main(){
    val list = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, listOf(1,2,3, listOf(4,5,6))),
        listOf(7, listOf(8, 8, 8), 9)
    )

    var plainList = deflat(list)

    println("list = $list")
    println("plainList = $plainList")
}