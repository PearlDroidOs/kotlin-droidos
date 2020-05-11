package unit3.array.string.number


/**
 * This class will show about Array
 * Store same or different data set into an array variable
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    val oddNumbers = arrayOf(1, 3, 5, 7, 9)
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    val data = arrayOf(1, true, "three")
    //val emptyArray = arrayOf() //Error because it should be initialized
    println("Index 0: ${data[0]}  | Index 1: ${data[1]}")
    data[0] = 0
    data[1] = "two"
    println("Index 0: ${data[0]}  | Index 1: ${data[1]}") //Conclusion: Each value can be changed in different types

    /**
     * XxxArray(): ByteArray, IntArray, LongArray, UIntArray, UShortArray, DoubleArray, CharArray
     */
    val oddNums: IntArray = IntArray(3)
    oddNums[0] = 1
    oddNums[1] = 2
    //oddNums[2] = 3.5    //Error because initialized value should be an integer
    //oddNums[3] = 4      //Error because oddNums can only store 3 values

    val vowels2 = CharArray(5)

    /**
     * xxxArrayOf():
     * byteArrayOf(), intArrayOf(), shortArrayOf(), longArrayOf(), doubleArrayOf(), floatArrayOf()
     * ubyteArrayOf(), uintArrayOf(), ushortArrayOf(), ulongArrayOf(), charArrayOf(), booleanArrayOf()
     */
    val evenNum: IntArray = intArrayOf(2, 4, 6, 8, 10)
    val doubleNum: DoubleArray = doubleArrayOf(2.34, 5.23, 5.78, 9.85)
    val vowels3 = charArrayOf('a', 'e', 'i', 'o', 'u')
    val floatNum: FloatArray = floatArrayOf(74.244f, 11.12f, 777f)

    /**
     * Using Array with looping
     */
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (n in nums)
        print("$n ")
    println()

    var sum = 0
    for (n in nums)
        sum += n
    println("Total : $sum")

    val cars = arrayOf("Benz", "BMW", "Jaguar", "Ford")
    cars.forEach { println(it) }

    /**
     * ================== Interesting Method of array ======================
     * • count() or size            | counting number in an array
     * • contain(value)             | Is the value in an array? - true and false
     * • joinToString(Delimiter)    | Make values of an array to join in string by delimiter
     * • indexOf(value)             | Find index or position of the value of an array --> if it is not found (return -1)
     * • last()                     | Get the last value of an array
     * • reversedArray()            | In order an array from back to front e.g 1,3,2,4 ---> 4,2,3,1
     * • sortedArray()              | Sort values of an array from minimum to maximum
     * • sortedArrayDescending()    | Sort values of an array from maximum to minimum
     * • sum()                      | Summaries values of an array (Only an array of integer or number type)
     */
    val number = intArrayOf(9, 7, 46, 192, 78, 2, 102)

    println("Size: ${number.size}  |  Count:  ${number.count()}  |  Contain 3:  ${number.contains(3)} ")

    if (!number.contains(77)) {
        println("Number does not have a value of 77")
    }

    println("JoinToString :  ${number.joinToString("•")}")
    println("indexOf(78) :  ${number.indexOf(78)}")
    println("last :  ${number.last()}")

    val num_rever = number.reversedArray()
    println("======= reversedArray() =======")
    num_rever.forEach { print("$it ") } //102 2 78 192 46 7 9
    println()

    val num_sort = number.sortedArray()
    println("=======  sortedArray  =======")
    num_sort.forEach { print("$it ") } // 2 7 9 46 78 102 192
    println()

    val num_sortedArrayDescending = number.sortedArrayDescending()
    println("sortedArrayDescending: ${num_sortedArrayDescending.joinToString(",")} ") //192,102,78,46,9,7,2
    println()

    println("Sum :  ${number.sum()}")
}