package unit7.inheritance.`interface`

/**
 * Description - Understand on how to use 'is' and '!is'
 * Using for check type of value
 * =====================================
 * Keywords
 * ---------------------
 * [object for comparison] is [type]
 * [object for comparison] !is [type]
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main() {

    /**
     * Example 4
     */
    println("========= Example 4 ===========")
    val t2 = Tea()
    val it2 = IceTea()
    drink(t2)       //Tea
    drink(it2)      //Tea

    drink2(t2)      //Tea
    drink2(it2)     //Tea
    //As an example 3, IceTea is a subclass of Tea which is a superclass
    //Above example, it is always 'true' because the process only check in tea type even checking IceTea as well
    //Solving a problem, to change order in a condition !

    drink3(t2)      //Tea
    drink3(it2)     //IceTea

    /**
     * Example 3
     */
    println("========= Example 3 ===========")
    val t = Tea()
    println(t is Tea)           //true
    println(t is IceTea)        //false

    val it = IceTea()
    println(it is Tea)           //true
    println(it is IceTea)        //true

    val cff = Coffee()
    //println(cff is Tea)          //Error - cannot compare

    /**
     * Example 2
     */
    println("========= Example 2 ===========")
    val a = One()
    val b = Two()

    val x = a is One        //true
    if (b is Two) {                   //true
        //Do something
        println("Yes!")
    }

    /**
     * Example 1
     */
    println("========= Example 1 ===========")
    isAnyType()


}

/**
 * Example 4
 */
fun drink(a :Any){
    println(when(a){
        is Tea -> "Tea"
        is IceTea -> "IceTea"
        else -> ""
    })
}

fun drink2(a :Tea){
    println(when(a){
        is Tea -> "Tea"
        is IceTea -> "IceTea"
        else -> ""
    })
}

fun drink3(a :Any){
    println(when(a){
        is IceTea -> "IceTea"
        is Tea -> "Tea"
        else -> ""
    })
}


/**
 * Example 3
 */
open class Tea
class IceTea : Tea()
class Coffee


/**
 * Example 2
 */
class One
class Two


/**
 * Example 1
 */
fun isAnyType() {
    val a: Int = 10
    var bool = a is Int             //true
    //bool = a is Double                    //Error (Cannot compare)
    //bool = a !is Long                     //Error (Cannot compare)

    val b = 1.23
    bool = b is Double                      //true
    //bool = b is Float                     //Error (Cannot compare)

    var x: Any = 10                          //Can compare any type
    bool = x is Double                      //false can compare

    println(x is Int)                       //true
    println(x is Double)                    //false
    println(x !is String)                   //true

    x = "Hi"
    println(x is Any)                       //true
    println(x is Double)                    //false
    println(x is String)                    //true ***


    //An Example
    fun test(a: Any) {
        if (a is Int) {

        } else if (a is Double) {

        }

        when (a) {
            is Int -> {
            }
            is Boolean -> {
            }
            is String -> {
            }
        }
    }
}