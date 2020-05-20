package unit8.generic.collection

/**
 * Description - Understand on how to implement generic function as same as generic class
 * We define a function or method to be generic as the same way of generic class
 * Type is different from generic class. It uses by itself in the method
 */

/**
 * Generic methods or functions
 */
fun <T> typeOf(value: T): String? {
    val v = value as Any
    return v::class.simpleName
}

fun <T> typeOf2(value: T) = (value as Any)::class.simpleName

/**
 * Generic class with generic methods
 */
class Data2<T>(value: T) {
    private var v = value as Any

    fun type() = v::class.simpleName

    fun value(): T = v as T

    //Use generic type of the class
    fun setValue(value: T) {
        this.v = value as Any
    }

    //Generic method
    fun <U> typeOf(value: U) = (value as Any)::class.simpleName
}


fun main(){

    //General calling of generic methods
    val t1 = typeOf("Hello")
    val t2 = typeOf(123)
    val t3 = typeOf2(true)
    val t4 = typeOf2(12.23)


    //Calling of generic class
    val data = Data2(123)
    val t5 = data.typeOf(true)
    val t6 = data.typeOf("Hello")

    println("Type 6: $t6  | Type 5: $t5")           //Type 6: String  | Type 5: Boolean

}

