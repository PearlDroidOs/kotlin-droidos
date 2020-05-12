package unit4.function.lambda


/**
 * Single Expression Function
 * Normally, all statements are declared in a function
 * But, if the function has only one statement, it can use single expression as example below:
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    /**
     * Calling single expression function for an example
     */
    val num = numberDaysOfMonth(2, true)
    println(num)

}

fun write(str: String) = println(str)                               //Not return value
fun incrementOne(num: Int) = num + 1                                //return value n+1
fun add(x: Int, y: Int) = x + y                                     //return value x+y
fun oddOrEven(n: Int) = if(n%2 == 0) "Even" else "Odd"              //return value "Even" or "Odd"

//Return value: use when condition
fun winner(score1:Int, score2:Int) = when{
    score1 > score2 -> "Player 1"
    score2 > score1 -> "Player 2"
    else -> "Player 1 draw Player 2"
}

fun numberDaysOfMonth(mouth: Int, isLeapYear: Boolean) = when (mouth){
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if(isLeapYear) 29 else 28
        else -> 0
    }

