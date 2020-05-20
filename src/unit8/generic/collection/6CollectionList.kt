package unit8.generic.collection

/**
 * Description - Understand on how to implement collection list
 * Collection list comes to effective make a list even a value of the list will be removed but the list size will still be same
 * =====================================
 * Collection list includes 2 part:
 *      • Mutable List      - A list which can change any time is set by generic type [ MutableList<T> ]
 *      • Immutable List    -
 */
fun main() {

    /**
     * ===================================================================================================
     *                                          MutableList
     * ===================================================================================================
     * get(index)               | read data at index
     * set(index, data)         | set data at index
     * add(data)                | add a new data at a new index which is after the previous last index
     * add(index, data)         | add a new data at specific index which mean the previous index will be move down
     * addAll(list)             | add another all data list into the list
     * clear()                  | Remove all data from the list
     * contains(data)           | Check data in the list or not --> then return boolean type
     * isEmpty()                | Check the list is empty or not --> then return boolean type
     * remove(data)             | remove specific data
     * removeAt(index)          | remove data at specific index
     * size()                   | get a list size
     * toXxxArray()             | transform to that type array e.g. toStringArray() etc.
     * toTypeArray()            | transform to be array as Array<T>
     *
     */
    val oddNums = mutableListOf<Int>(1, 3, 5, 7)
    val colors = mutableListOf("Red", "Green")
    val vowels = mutableListOf<Char>('a', 'e', 'i', 'o', 'u')
    val list = mutableListOf("Zero", "One", "Two", "Three")

    list[0] = "Ten"
    //list[9] = "Eleven"              //IndexOutOfBoundsException: Index 9 out of bounds for length 4
    list.add(2, "Zero")
    println(list.joinToString(", "))

    oddNums.add(9)
    oddNums.add(0, 0)
    println(oddNums.joinToString(", "))

    val list1 = mutableListOf(1, 3, 5)
    val list2 = mutableListOf(2, 4, 6)
    list1.addAll(list2)
    println("Add all: $list1")

    list1.removeAt(0)
    println("Remove at index 0: $list1")

    list1.remove(4)
    println("Remove element 4: $list1")

    if (list1.contains(6)) {
        println("List1 contains a value of 6 ! ! !")
    }

    if (list2.isEmpty()) {
        println("List2 is empty")
    } else {
        println("List2 is not empty")
    }

    val arr1 = list1.toIntArray()
    val arr2 = list1.toTypedArray()
    println(arr1.toList())
    println(arr2.toList())


    /**
     * ===================================================================================================
     *                                          ImmutableList
     * ===================================================================================================
     * Read Only - listOf()
     *
     */
    val oddNums2 = listOf(1, 3, 5, 7)
    //oddNums2[0] = 1                       //Error - cannot change and add a value

    val vowels2: List<Char> = listOf('a', 'e', 'i', 'o', 'u')
    val colors2 = listOf("Red", "Green", "Blue")
    val mobiles = listOf<String>("Sumsung", "Oppo", "Vivo", "Sony")
    //Conclusion: add(), remove() cannot use with an immutable list


    /**
     * ===================================================================================================
     *                                         Iterator with List
     * ===================================================================================================
     * iterator()           | return instance of Iterator to access data of the list by move forward
     * listiterator()       | return instance of Iterator to access data of the list by move forward and backward
     */
    val listCodingLanguage = mutableListOf<String>("Kotlin", "Java", "Android")
    val iter = listCodingLanguage.iterator()
    while(iter.hasNext()) {             //If the list has next data ---> return boolean type
        print(iter.next() + " ")        //Print data which has next
    }

    println()


    // Forward and Backward
    val iter2 = listCodingLanguage.listIterator()
    while(iter2.hasNext()) {                //If the list has next data (Forward) ---> return boolean type
        print(iter2.next() + " ")           //Print data which has next
    }
    println()
    while(iter2.hasPrevious()) {             //If the list has previous data (Backward) ---> return boolean type
        print(iter2.previous() + " ")       //Print data which has previous
    }
}











