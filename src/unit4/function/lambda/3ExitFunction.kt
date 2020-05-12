package unit4.function.lambda

import kotlin.math.PI

/**
 * Exit Function
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(){

    //Statement for calling functions below

}

/**
 * Use 'return' for exiting function
 */
fun showReactArea(width: Int, height: Int){
    if(width <= 0 || height <= 0){
        return //
    }else{
        println(width*height)
    }
}

/**
 * Declaration unused value to return
 */
fun circleArea(radius: Double) = if(radius < 0) 0.0 else PI * radius * radius

