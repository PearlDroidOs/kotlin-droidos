package unit8.generic.collection


/**
 * Description - Understand on how to implement lambda with a collection
 */
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val set = mutableSetOf(1.5, 4.3, 7.5, 92.3, 44.34)
    val map = mutableMapOf(22 to "Thailand", 92 to "Singapore", 99 to "USA")

    /**
     * Using lambda with collection
     */
    list.forEach {
        if (it % 2 == 0) print("$it ")
    }

    println()
    set.forEach { print("${it * 4}  ") }

    println()
    map.forEach { if (it.key > 90) print("${it.key}: ${it.value}  ") }

    println()
    val c1 = list.count()
    val c2 = set.count { it < 10 }
    println("Count < 10:  $c2")

    val c3 = map.count{it.key < 30}
    println("Count key < 30:  $c3")

    val fList = list.filter { it%2 == 1}
    println(fList.toList())

    val fnList = list.filterNot{it%2 == 1}
    println(fnList.toList())

    val fMap = map.filter { it.key > 90 }
    println(fMap.toList())

}