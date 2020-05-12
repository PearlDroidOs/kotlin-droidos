package unit4.function.lambda


/**
 * This class presents about fundamental functions
 * ========== Fundamental 1 =============
 * key function_name(parameter1:Parameter1_Type, parameter2:Parameter2_Type, ..){
 *          Statement 1
 *          Statement 2
 * }
 *
 * ========== Example ================
 * fun main(args:Array<String>){
 *          Statements
 * }
 *
 * ========== Fundamental 2 =============
 * key function_name(parameter1:Parameter1_Type, parameter2:Parameter2_Type, ..): Return_Type{
 *          Statement 1
 *          Statement 2
 *    return Value of Return_Type
 * }
 *
 * ========== Example ================
 * fun sumCalculator(num1:Int, num2:Int):Int{
 *     return num1 + num2
 * }
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    /**
     * Calling function methods
     */
    printOneToThree()

    /**
     * Calling function methods with parameter
     */
    oddEven(5)
    repeatingString("Hello Peter! How are you?", 6, "  ")
    thaiLongDate(25, 7, 2020)

    /**
     * Calling function methods with parameter for returning type of integer
     */
    sum(5, 2)                                                //7
    val total = minus(7, 4)                             //3
    val dayOfBirth = thaiDayName(2)                    //Monday
    val sevenIncrement = increment(7)                            //8
    val maxNum = findMaxNumber(2,9)                     //9
    val numberOfMonth = numDaysOfMonth(2, true)    //29



}


fun printOneToThree() {
    for (i in 1..3)
        println(i)
}

fun oddEven(num: Int) {
    if (num % 2 == 0)
        println("Even")
    else
        println("Odd")
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}


/**
 * Another example with Formal Parameter or Parameter
 */
fun repeatingString(str: String, times: Int, separator: String) {
    if (str != "" && times > 0) {
        var text = ""
        for (i in 1..times) {
            if (i > 1) {
                text += separator
            }
            text += str
        }
        println(text)
    }
}

fun thaiLongDate(day: Int, month: Int, yearCE: Int) {
    var m = arrayOf(
        "January", "February", "March",
        "April", "May", "June", "July", "August", "September", "October", "November", "December"
    )
    //yearCE += 543 //Error because of it is not local variable, it is just a parameter which the value cannot be changed
    var yearBE = yearCE
    yearBE += 543
    println("$day  ${m[month - 1]}  $yearBE")
}


/**
 * Another example with Formal Parameter or Parameter and return type
 */
fun minus(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun thaiDayName(dayOfWeek: Byte): String {
    val dayNames = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    if (dayOfWeek in 1..7) {
        return dayNames[dayOfWeek - 1]
    } else {
        return ""
    }
}

fun increment(n: Int): Int {
    return n + 1
}

fun findMaxNumber(num1: Int, num2: Int):Int{
    if(num2 > num1)
        return num2
    return num1
}

fun numDaysOfMonth(mouth: Int, isLeapYear: Boolean):Int{
    return when (mouth){
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if(isLeapYear) 29 else 28
        else -> 0
    }
}

