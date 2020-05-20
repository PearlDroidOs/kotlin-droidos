package unit8.generic.collection

/**
 * Description - Understand on how to implement Map
 * Map is one of collection types which have 'key' and 'value' to define
 * =====================================================================================
 * Key      | Refer each member as a word of dictionary
 * Value    | a value as a meaning of the word of the dictionary
 * =====================================================================================
 * • MutableMapOf
 * • ImmutableMapOf
 * =====================================================================================
 *
 * put(key, value)          | add a new member by key with value
 * get(key)                 | get a value by key
 * set(key, value)          | set a new key and a value
 * clear()                  | Remove all value and key from the map list
 * containsKey(key)         | Is key in the map list? ---> return boolean type
 * containsValue(value)     | Is value in the map list? ---> return boolean type
 * isEmpty()                | Is the map list empty? ---> return boolean type
 * remove(key)              | Remove data by key
 * replace(key, value)      | Replace new value by existing key
 * size()                   | Get size of the map list
 * keys                     | Get all keys of the map list
 * values()                 | Get all values of the map list
 */
fun main(){

    /**
     * Mutable Map
     */
    val country = mutableMapOf<String, String>("th" to "Thailand",
        "jp" to "Japan", "au" to "Australia")

    val num = mutableMapOf<Int,String>(1 to "One", 2 to "Two", 3 to "Three")

    println("${num.keys} ${num.values}")


    /**
     * Immutable Map
     */
    val fruit = mapOf<Int, String>(1 to "Orange", 2 to "Apple", 3 to "Banana")
    println("Fruit :  ${fruit.toList()}")


    /**
     * Using functions
     */
    val c = mutableMapOf("th" to "Thailand")
    c["jp"] = "Japan"
    println(c.toList())
    c.put("au", "Australia")
    println(c.toList())
    c.set("uk", "United Kingdom")
    println(c.toList())
    if(c.containsKey("jp")){
        println("Map list has 'jp' key ")
    }

    if(c.contains("au")){
        println("Map list has 'au' key ")
    }

    if(c.containsValue("Thailand")){
        c.remove("th")
        println("Remove Thailand : ${c.toList()}")
    }

    println("============ Value of Country =========")
    for(k in c.keys){
        print("$k ")
    }

    println()
    println("============ Kays and Values of Country =========")
    val iter = c.iterator()
    while (iter.hasNext()){
        val value = iter.next()
        print("$value ")
        print(" [${value.key}: ")
        print("${value.value}]  ")
    }


}