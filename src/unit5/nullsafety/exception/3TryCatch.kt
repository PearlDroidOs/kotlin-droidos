package unit5.nullsafety.exception

import java.lang.Exception
import java.time.LocalDate
import kotlin.random.Random

/**
 * Try - Catch : Checking error on statements
 * try{
 *      //Statements that may get error
 * }catch(ex:exception){
 *      //An error Action
 *      //Handle exception
 * }
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    /**
     * ========== Simple try-catch ==========
     */
    print("1 Enter integer :")
    try {
        val str: String? = readLine()
        val n = str?.toInt() //If this line get error, 'println' will not be worked
        println("1 Number : $n")
    } catch (ex: Exception) {
        println("1 Error")
    }

    /**
     * ========== Recursion style ==========
     */
    val num = getInt()
    println("2 Number: $num")

    /**
     * ========== Do-while with function ==========
     */
    val num2 = getDouble()
    println("3 Number: $num2")

    /**
     * ========== STEP to use Try - Catch effectively ==========
     * try{
     *      ...
     * }catch(ex:Exception){
     *      println(ex.message)             //Error message
     *      println(ex.toString)            //Message with a package of a class that is an error
     *      println(ex.printStackTrace())   //Print text that relates about all error
     * }
     */

    // ================================================ //

    /**
     * ========== Using Try - Catch with Expression ==========
     */
    print("4 Enter integer :")
    var str4: String? = readLine()
    var n4 = try {
        str4?.toInt()
    } catch (ex: Exception) {
        0
    }
    println("4 Number: $n4")

    /**
     * ========== Using - Finally ==========
     * Finally - cannot use with expression concept because the result will be same (Value in finally)
     * try{
     *          ...
     * }catch(ex:Exception){
     *          ...
     * }finally{
     *        //Always doing actions even having an error
     * }
     */
    val bytes = Random.nextBytes(1)
    val b = bytes[0]
    try{
        //If random num is negative --> catch error and finally
        //If random num is positive --> do the next statement and finally
        val array = IntArray(b.toInt())
        println("5.1 Number is : ${array[0]}")
    }catch (ex:Exception){
        println(ex.printStackTrace())
    }finally {
        println("5.2 Number is : $b")
    }


    /**
     * ========= Using - Throw ============
     */
    try {
        val y: Int = 0
        if (y == 0) {
            throw Exception("The divisor can't be zero.")
        }
    }catch (ex:Exception){
        println(ex.message)
    }

    try {
        val y2: Int = 0
        divisorCheck(y2)
    }catch (ex:Exception){
        println(ex.message)
    }

}

/**
 * Recursion way
 */
fun getInt(): Int {
    val str: String?
    var n: Int = 0

    print("2 Enter integer :")
    try {
        str = readLine()
        n = str!!.toInt()
    } catch (ex: Exception) {
        n = getInt()    //Call itself again as Recursion style
    }
    return n
}

/**
 * Do-while with function
 */
fun getDouble(): Double {
    var str: String?
    var n: Double //If put "?" at the last, you need to initialize a value to it

    do {
        try {
            print("3 Enter integer :")
            str = readLine()
            n = str!!.toDouble() //If this line get error, 'break' will not be worked
            break
        } catch (ex: Exception) {
        }
    } while (true)
    return n
}


fun isValidDate(day: Int, month:Int, year:Int): Boolean{
    return try {
        LocalDate.of(year, month, day)
        true
    }catch (ex:Exception){
        false
    }
}


/**
 * ========= Using - Throw ============
 */
fun divisorCheck(int:Int){
    if(int == 0){
        throw Exception("2 The divisor can't be zero. ")
    }
}