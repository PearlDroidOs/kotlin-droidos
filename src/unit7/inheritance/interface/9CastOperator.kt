package unit7.inheritance.`interface`

/**
 * Description - Cast operator which is divided into 3 part:
 * Transform data to be a specific type by 'as' and 'as?'
 * • Unsafe Cast Operator
 * • Safe Cast Operator
 * • Smart Cast
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */

fun main() {

    /**
     * Safe Cast Operator
     */
    var t = Tea()
    var it: IceTea? = t as? IceTea       //null
}

/**
 * Unsafe Cast Operator
 */
fun unsafeCastOperator() {
    val a: Int = 10
    val b: Double = a as Double         //Runtime Error

    val c = "123"
    val d = c as Int                //Runtime Error

    var x: Any = 12.34
    //x++                               //Error type 'Any'
    var y = x as Double
    y++                                 //Ok
    val z = x as Int                //Runtime Error

    println("============ As Tea ==========")
    val it = IceTea()
    val t = it as Tea             //Ok --> Subclass to Superclass
    val t2 = Tea()
    val it2 = t2 as IceTea      //Runtime Error
}

/**
 * Safe Cast Operator
 */
fun safeCastOperator() {
    val a: Int = 10
    val b: Double? = a as? Double         //null
    val c = "123"
    val d: Int? = (c as? Int) ?: 0         //0

    fun test(x: Any) {
        var y: Double? = x as? Double
        val z: Int? = x as? Int
    }
}

/**
 * Smart Cast
 */
fun increment(x: Any): Int? {
    var n: Int
    return if (x is Int) {
        n = x as Int
        n++
    } else null
}