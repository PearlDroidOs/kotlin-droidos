package unit2.operator.controlflow


/**
 * Operators
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {
    /**
     * Assignment Operator
     */
    val a = 100
    val b = a
    val x = "Hello"
    val y = x

    /**
     * Arithmetic Operator
     */
    val num1 = 4 + 2
    val num2 = 4 - 2
    val num3 = 4 * 2
    val num4 = 4 / 2

    //Check Odd and Even number
    val mod1 = 9 % 2 //1 Odd number
    val mod2 = 12 % 2 //0 Even number

    //Get a crumb decimal value
    val mod3 = 19 % 5 //5

    /**
     * Arithmetic Assignment Operator
     */
    var aNum1 = 10
    aNum1 += 5 //aNum1 = 15
    var aNum2 = 10
    aNum2 -= 5 //aNum2 = 5
    var aNum3 = 10
    aNum3 *= 5 //aNum3 = 50
    var aNum4 = 10
    aNum4 /= 5 //aNum4 = 2
    var aNum5 = 10
    aNum5 %= 5 //aNum5 = 0

    /**
     * Increment & Decrement Operator
     */
    var idNum1 = 12
    idNum1++ //idNum1 = 13
    ++idNum1 //idNum1 = 14
    idNum1-- //idNum1 = 13
    --idNum1 //idNum1 = 12

    var idNum2 = 10
    var idNum3 = 20
    //Add idNum3 before idNum2 = idNum2 + idNum3
    idNum2 += ++idNum3 //idNum2 = 31   |  idNum3 = 21

    var idNum4 = 10
    var idNum5 = 20
    //Add idNum5 after idNum4 = idNum4 + idNum5
    idNum4 += idNum5++ //idNum4 = 30   |  idNum5 = 21

    /**
     * Comparison Operators
     */

    val coNum1 = (2 == 1)   //false
    val coNum2 = (2 != 1)   //true
    val coNum3 = (2 > 1)    //true
    val coNum4 = (2 < 1)    //false
    val coNum5 = (2 <= 1)   //false
    val coStr1 = "kotlin" == "kotlin"   //true
    val coStr2 = "Kotlin" == "kotlIn"   //false

    /**
     * ===========  Logic Operator  ==============
     * • And operator
     * true && true     = true
     * true && false    = false
     * false && true    = false
     * false && false   = false
     *
     * • Or operator
     * true || true     = true
     * true || false    = true
     * false || true    = true
     * false || false   = false
     *
     * • Not operator
     * !true            = false
     * !false           = true
     */
    var loBoolean: Boolean
    loBoolean = (1 < 2) && (3 < 4)           //(true && true) = true
    loBoolean = (1 < 2) && (3 == 4)          //(true && false) = false
    loBoolean = (1 > 2) && (3 > 4)           //(false && false) = false

    loBoolean = (1 > 2) || (3 < 4)           //(false && false) = false
    loBoolean = (1 < 2) || (3 == 4)          //(true && false) = true
    loBoolean = (1 < 2) || (3 < 4)           //(true && true) = true

    loBoolean = !(1 < 2)                     //!(true) = false
    loBoolean = !(1 > 2)                     //!(false) = true
    loBoolean = !((1 < 2) || (3 > 4))        //!(true || false) = !(true) = false

    /**
     * ========  Range Operator  ==========
     * [First Value]..[Last Value]
     * Example 1-10 or a-f etc.
     */
    val range1 = 1..10
    val range2 = 'a'..'z' // a to z
    val range3 = 0..100 step 2 //0,2,4,..,98,100
    val range4 = 10..20 step 3 //10,13, 16, 19
    println("Range2 first : ${range2.first}") //Print first value: a
    println("Range4 last : ${range4.last}") //Print last value: 19
    println("Range4 step : ${range4.step}") //Print last value: 3
    println("Range4 empty? : ${range4.isEmpty()}") //false

    val unit1 = 1 until 10 //1..9
    val unit2 = 0 until 100 step 2 //0,2,4,..,98
    val unit3 = 10 until 20 step 3 //10,13,16,19
    println("until1 first : ${unit1.first}") //1
    println("until1 last : ${unit1.last}")  //9


    val downTo1 = 10 downTo 1 //10...1
    println("DownTo1 first : ${downTo1.first}") //10
    println("DownTo1 last : ${downTo1.last}")  //1

    val c = 20
    val downTo2 = c downTo  10 step 3 //20, 17, 14, 11
    println("DownTo2 first : ${downTo2.first}") //20
    println("DownTo2 last : ${downTo2.last}")  //11

    var value = 2 in range1 //true
    value = 10 in range1    //true
    value = 5 !in range1    //false
    value = 20 !in range1   //true
    value = 11 in 10..12    //true

    var value2 = 'a' in range2      //true
    value2 = 'k' in 'l'..'o'                //false
    value2 = "he" in "ha".."hl"             //true
    value2 = "hello" in "he".."hi"          //true : chack on index 0 and 1 which are "he"
    value2 = "abd" in "aab".."abc"          //false

}