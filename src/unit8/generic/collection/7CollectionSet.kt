package unit8.generic.collection

/**
 * Description - Understand on how to use Set collection
 * ====================================================
 * Set collection will not collect the same value in it
 */
fun main() {

    /**
     * Mutable Set - use mutableSetOf()
     */
    val rgb: Set<String> = mutableSetOf<String>("Red", "Green")
    val num: Set<Int?> = mutableSetOf(7, 11, null, 109, 1009)
    val char = mutableSetOf('a', 'b', 'c')
    val lang = mutableSetOf("Java", "C", "Kotlin", "Swift", "Kotlin")
    println(lang.toList())              //[Java, C, Kotlin, Swift]


    /**
     * Immutable Set - use setOf()
     */
    val evenNum: Set<Int> = setOf(1, 2, 3, 4, 2)
    val doubleName: Set<Double> = setOf(1.2, 2.4, 4.3, 2.40)
    println(evenNum.toList())           //[1, 2, 3, 4]
    println(doubleName.toList())        //[1.2, 2.4, 4.3]

    val fruit = setOf<String>("Orange", "Apple", "Grape", "Banana", "Coconut")
    val flower = setOf("Rose", "Orchid", "Jasmine")


    /**
     * Mutable Set Methods is similar as mutable method
     * We can use it with the same pattern
     */
    val color = mutableSetOf("Red", "Green", "Blue")
    color.add("Black")
    println("Color list: ${color.toList()}")
    if (color.contains("Green")) {
        color.remove("Green")
        println("Color list after remove 'Green': ${color.toList()}")
    }
    println()
    println("========= Print list by for looop =========")
    for (c in color) {
        print("$c ")
    }

    println()
    println("========= Print list by iterator =========")
    val iter = color.iterator()
    while (iter.hasNext())
        print(iter.next()+ " ")
}













