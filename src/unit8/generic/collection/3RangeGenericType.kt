package unit8.generic.collection

/**
 * Range of generic type  --- See more on 1GenericClass at superclass and subclass
 */
class Data3<T: Number>(var value: T)

fun <T: Number> sum(vararg data:T) : T{
    var total = 0.0
    for (x in data){
        when (x) {
            is Int -> {
                total += x.toDouble()
            }
            is Double -> {
                total += x
            }
            is Float -> {
                total += x
            }
        }
    }
    return total as T
}