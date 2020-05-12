package unit4.function.lambda


/**
 * Default Value
 * Sometimes developer don't want to put some value into a parameter, but developer would also like to use this parameter
 * The solution is to declare default value with the parameter
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {
    val a = total(10, 100)              //Use default value
    val b = total(5, 500, 5.5)     //Don't use default value

    println("$a   $b")

}

//Default value in vat
fun total(q: Int, p: Int, vat: Double = 7.0) = q * p * (1 + (vat / 100))