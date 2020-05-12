package unit4.function.lambda



var a = 10  //Global variable
/**
 * Function Extent
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(){
    println("aOut = $a") //use 'a' in outside function only
    val a = 15 //local variable
    val b = 20 //local variable

    println("aIn = $a") // can use 'a' in this function only
    println(b)          // can use 'b' in this function
    println(c)          // can use 'c' in this function below
    //println(d)          // Error: cannot use 'd' in this function

    exampleExtentFunction()
}

var c = 25
fun exampleExtentFunction(){
    val d = 30 //local variable

    println(a) // can use 'a' in outside function above
    println(d) // can use 'b' in this function
    println(c) // can use 'c' in this function
    //println(b) // Error: cannot use 'b' in this function
}