package unit1.kotlinbasic

/**
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(){

    /**
     * =======  Fundamental Print function ==========
     * Print with text
     * ======= Result ===========
     * Hi! How are you?I am fine, and you?
     */
    print("Hi! How are you?")
    print("I am fine, and you?")



    /*
     * Print enter 2 lines
     */
    println()
    println()


    /**
     * =======  Fundamental Println function ==========
     * Print with text
     * ======= Result ===========
     * Hi! How are you?
     * I am fine, and you?
     */
    println("Hi! How are you?")
    println("I am fine, and you?")

    /*
     * Print enter a line
     */
    println()

    /**
     * =======  Fundamental Println function ==========
     * Print character
     * ======= Result ===========
     * P
     * d
     */
    println('P')
    println('d')


    /*
     * Print enter a line
     */
    println()

    /**
     * =======  Fundamental Println function ==========
     * Print Integer, Double, Long, Float, respectively
     */
    println(123)
    println(123.456)
    println(1234567890987)
    println(123f)


    /*
     * Print enter a line
     */
    println()

    /**
     * =======  Fundamental Println function ==========
     * Print Operators: +  -  *  /  % , respectively
     */
    println(29+9)           // 38
    println(30-70)          // -40
    println(21*3)           // 63
    println(8/3)            // 2
    println(10%3)           // 1

    /*
    * Print enter a line
    */
    println()

    /**
     * Writing Complex Expression which has a priority by in order as follows:
     * • Parentheses ()
     * • Unary (plus and minus)
     * • Multiple |  Divide | modulus  ( * , / and % )
     * • Plus and Minus ( + and - )
     */
    println(1+3*4-2)        // 11
    println((1+3)*(4-2))    // 8
    println(+5)             // 5 as Unary operator
    println(-8)             // -8 as Unary operator
    println(-(100+4))       // -104
    println(10/(2+2)+4*8)   // 34
    println((3+4)*(5/2))    // 14
    println(2+4*5-10/(2+1)) // 19


}