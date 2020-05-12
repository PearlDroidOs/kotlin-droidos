package unit3.array.string.number

import java.lang.Math.*
import java.text.DecimalFormat
import java.text.NumberFormat
import kotlin.math.pow
import kotlin.random.Random

/**
 * The class describes om Number and it environment
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    /**
     * ========== Some interesting functions and properties ================
     * These functions below need to import library of 'kotlin.math.*'
     * • abs(number)                | Absolute value of number e.g. (-10) --> 10
     * • ceil(decimal number)       | Find next higher integer e.g.
     *                              | ceil(0.01)  => 1.0 ... ceil(-0.01)  =>  0.0
     *                              | ceil(0.91)  => 1.0 ... ceil(-0.90)  =>  0.0
     *                              | ceil(1.01)  => 2.0 ... ceil(-1.01)  => -1.0
     *                              | ceil(1.95)  => 2.0 ... ceil(-1.95)  => -1.0
     * • floor(decimal number)      | Find next lower integer e.g.
     *                              | floor(2.99) => 2.0 ... floor(-2.99) => -3.0
     *                              | floor(2.01) => 2.0 ... floor(-2.01) => -3.0
     *                              | floor(1.99) => 1.0 ... floor(-1.99) => -2.0
     *                              | floor(1.01) => 1.0 ... floor(-1.02) => -2.0
     * • round(decimal number)      | Find similar next integer e.g. ( <= 0.5 : down integer | >0.5 : high integer)
     *                              | round(4.1)  => 4   ... round(-4.1)  => -4
     *                              | round(4.5)  => 4   ... round(-4.5)  => -4
     *                              | round(4.51) => 5   ... round(-4.51) => -5
     *                              | round(4.92) => 5   ... round(-4.92) => -5
     * • base_double.pow(exponent)     | Find a value of exponent of base_double_number e.g. 2.0.pow(3) => 8
     * • sqrt(number)               | Square root of number e.g. sqrt(9) => 3 | sqrt(100) => 10
     * • max(num1, num2)            | Find maximum number from both e.g  max(100,20) => 100
     * • min(num1, num2)            | Find minimum number from both e.g. min(100,20) => 20
     * • PI                         | Static Pi value
     * • truncate(decimal number)   | Change decimal value to be zero e.g truncate(14.78) => 14.0 | truncate(-34.23) => -34.0
     */
    val radius = 10.0
    val circleArea = PI * radius.pow(2.0)
    println(circleArea)

    /**
     * =========================== Random Number =============================
     * These functions below need to import library of 'kotlin.random.*'
     * • nextInt()                                  | random integer number
     * ª nextInt(Upper boundary)                    | random integer number that is less than upper boundary e.g. nextInt(1000) => 0 < result < 1000
     * • nextInt(Lower boundary, Upper boundary)    | random integer number between lower boundary and upper boundary
     * • nextLong()                                 | random long number
     *   nextLong(Upper boundary)                   | random long number that is less than upper boundary
     *   nextLong(Lower boundary, Upper boundary)   | random long number between lower boundary and upper boundary
     * • nextDouble()                               | random double number which result will be between 0 and 1
     * • nextBoolean()                              | random true or false
     * • nextFloat()                                | random float number which result will be between 0 and 1
     * • nextBytes(amount)                          | random byte number which result will be between -128 and 127 by amount
     *   nextBytes(Byte_array)                      | random byte number which result will be between -128 and 127 by Byte_array
     */
    val a = Random.nextInt()                       //Can be -1649614734 or 1649614734 whatever in type of integer
    val b =Random.nextInt(10)                 //Can be a number between 0 and 9
    val c = Random.nextInt(10,20)       //Can be a number between 10 and 19
    val d = Random.nextDouble()                 //Can be a double number between 0.000.. and 1.000...
    val e = Random.nextBoolean()                //Can be a boolean value: true and false
    val f = Random.nextBytes(3)
    //f.joinToString("|") => Can be value between -128 and 127 that have 3 amount in array e.g. -68|112|-127

    val byteArray = ByteArray(5)
    val h = Random.nextBytes(byteArray)
    //h.joinToString("|") => Can be value between -128 and 127 that have 5 amount of byte array e.g. -107|65|10|0|72
    //Result as same as byteArrayOf(-107, 65 ,10 ,0 ,72)
    println(h.joinToString("|"))


    /**
     * ====================== NumberFormat =====================
     * Kotlin does not have a class to provide number format as Java
     * In this case, we are going to use NumberFormat of Java package
     * The result from format will always be string type
     * • getInstance()              | Handle number format to input ',' in suitable position that only have 3 decimal number
     * • getCurrencyInstance()      | Handle type of money currency as $ £ ---> number format to input ',' and have 2 decimal number only
     * • getIntegerInstance()       | Handle integer number format to input ',' and don't have any decimal number
     * • getPercentInstance()       | Handle percent number format by multi a hundred to a number, only 2 decimal number, have ',' in a thousand
     */
    val numFormat = NumberFormat.getInstance()
    val num1 = numFormat.format(1234567.43567) //1,234,567.436

    val numFormat2 = NumberFormat.getCurrencyInstance()
    val num2 = numFormat2.format(24900) //THB24,900.00

    val numFormat3 = NumberFormat.getIntegerInstance()
    val num3 = numFormat3.format(123456.435)//123,456

    val numFormat4 = NumberFormat.getPercentInstance()
    val num4 = numFormat4.format(1234567.4567) //123,456,746%
    val num5 = numFormat4.format(0.4567) //46%


    /**
     * ======== Setting minimum and maximum integer digits, and Setting minimum and maximum fraction digits =========
     * • setMaximumIntegerDigits(amount of number)            | Show only a part of max integer number by amount of number
     * • setMinimumIntegerDigits(amount of number)            | Show only a part of min integer number by amount of number
     * • setMaximumFractionDigits(amount of number)           | Show only a part of max decimal number by amount of number
     * • setMinimumFractionDigits(amount of number)           | Show only a part of min decimal number by amount of number
     * • parse(strNum_formatted)                              | Transform number of string type to integer number
     */
    val numberFormat = NumberFormat.getInstance()
    numberFormat.minimumIntegerDigits = 7
    numberFormat.minimumFractionDigits = 5
    val number = numberFormat.format(245683.324567) //0,245,683.32457
    val number2 = numberFormat.format(123456789.12) //123,456,789.12000

    val numberFormat2 = NumberFormat.getInstance()
    numberFormat2.maximumIntegerDigits = 7
    numberFormat2.maximumFractionDigits = 5
    val number3 = numberFormat2.format(245683.324567) //245,683.32457
    val number4 = numberFormat2.format(123456789.12) //3,456,789.12

    val numberFormat3 = NumberFormat.getInstance()
    val strNum = "9876543.12345" //Be careful on limit number - please check before use it
    val num = numberFormat3.parse(strNum) //9876543.12345


    /**
     * ==================== DecimalFormat =======================
     * • ,              | means comma
     * • .              | means dot
     * • #              | means instead of number at that position
     * • %              | means transformation to percentage
     * • 0              | means instead of number position if it empty, it will add zero on that position
     * ==================== Example =============================
     * Pattern example      |       data        |      result
     *      #####           |       123         |       123
     *      00000           |       123         |       00123
     *      0.00            |       1.2         |       1.20
     *      00.00           |       1.2         |       01.20
     *      #,###           |   1234567890      |   1,234,567,890
     *      #.##%           |       0.076       |       8.6%
     */
    val pattern = "#,#"
    val decimalFormat = DecimalFormat(pattern)
    //Original format pattern - 1,234,567
    //After add pattern into DecimalFormat(pattern) - 1,2,3,4,5,6,7
    val str = decimalFormat.format(1234567)

    decimalFormat.applyPattern("000000")
    val str2 = decimalFormat.format(123)        //000123

    decimalFormat.applyPattern("#.##%")
    val str3 = decimalFormat.format(0.03479)    //3.48%  if 0.034 -> 3.4%

    decimalFormat.applyPattern("#,###")
    val str4 = decimalFormat.format(1234567)    //1,234,567
    val str5 = decimalFormat.format(123)        //123

    decimalFormat.applyPattern("000.000")
    val str6 = decimalFormat.format(12.12)      //012.120

}
