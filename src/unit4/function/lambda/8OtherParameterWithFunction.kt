package unit4.function.lambda


/**
 * ===== Other Parameters and functions ===========
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(){
    /**
     * Array parameter
     */
    val i = intArrayOf(1,2,3)
    val sum = sumValueByArray(i)

    /**
     * Return array
     */
    val numArray = oneToFiveNumber()
    val vowels = getVowels()

    /**
     * Vararg with Pair and Triple
     */
    val result = sumValueByVararg(10,5,79,46)
    val result2 = sumValueByVararg2(87,93,12,2,5)
}

/**
 * Array parameter
 */
fun sumValueByArray(data:IntArray): Int{
    var sum: Int = 0
    for (d in data){
        sum += d
    }
    return sum
}

/**
 * Return array
 */
fun oneToFiveNumber(): IntArray{
    return intArrayOf(1,2,3,4,5)
}

fun getVowels(): CharArray {
    return charArrayOf('a','e','i','o','u')
}

/**
 * Vararg with Pair
 */
fun sumValueByVararg(vararg  data:Int): Pair<Int, Double>{
    var sum: Int = 0
    for (d in data){
        sum += d
    }
    val avg = sum.toDouble()/ data.count().toDouble()
    return Pair(sum, avg)
}

/**
 * Vararg with Triple
 */
fun sumValueByVararg2(vararg  data:Int): Triple<Int, Double, String>{
    var sum: Int = 0
    for (d in data){
        sum += d
    }
    val avg = sum.toDouble()/ data.count().toDouble()
    return Triple(sum, avg, "Discount 10&")
}