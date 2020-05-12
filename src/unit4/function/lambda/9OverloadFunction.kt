package unit4.function.lambda


/**
 * Overload function
 * Create multiple function with only one function name
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(){

    println(max(1,3))
    println(max(3,1))
    println(max(3,2,1))
    println(max(2,3,1))
    println(max(1,3,2))
    println(max(2.45,2.44))
    println(max(2.45,2.46))

}


fun max(n1:Int, n2:Int) = if(n1>n2) n1 else n2
fun max(n1:Int, n2:Int, n3:Int):Int {
    var max = n1
    if(n2>max)
        max = n2

    if(n3>max)
        max = n3
    return max
}

fun max(n1:Double, n2:Double) = if(n1>=n2) n1 else n2