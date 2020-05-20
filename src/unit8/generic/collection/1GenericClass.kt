package unit8.generic.collection

/**
 * Description - Understand Generic Class
 */

/**
 * Normally, to declare a class
 */
class DataInt(var value: Int) {
    fun type() = value::class.simpleName
}

class DataDouble(var value: Double) {
    fun type() = value::class.simpleName
}

class DataString(var value: String) {
    fun type() = value::class.simpleName
}

class DataBoolean(var value: Boolean) {
    fun type() = value::class.simpleName
}


/**
 * Generic class
 * Java default type is 'Object'
 * Kotlin default type is 'Any'
 * ==============================
 * Nullable in some case, we need to transform Generic type to Any before doing something.
 * On the other hands, we have to convert Any to Generic type as well before getting a value
 *
 */
class Data<T>(value: T) {
    private var v = value as Any

    fun type() = v::class.simpleName

    fun value(): T = v as T

    fun setValue(value: T) {
        v = value as Any
    }
}

class Test()

/**
 * Generic type more than one type
 */
class Info<T, U, V>(val x: T, val y: U, val z: V) {

}

/**
 * Superclass can be generic
 * Then, Subclass can be generic as well
 */
open class First<T>                         //Super Class is generic
class Second<T> : First<T>()                //Sub Class must be generic

open class Third                            //If Super Class is not generic
class Fourth<T> : Third()                   //Sub Class can be generic

open class Fifth<T : Number>                //T: Number is in Type Constraint
class Sixth<T : Number> : Fifth<T>()

fun main() {

    /**
     * Generic type calling
     */
    var data1 = Data<Int>(100)
    val data2 = Data<Double>(20.33)
    val data3 = Data<String>("Tom")
    val data4 = Data<Boolean>(true)
    print(data1.type() + " ")
    println(data1.value())
    print(data2.type() + " ")
    println(data2.value())
    print(data3.type() + " ")
    println(data3.value())
    print(data4.type() + " ")
    println(data4.value())

    //Change data value
    data1.setValue(122)
    println(data1.value())

    //Error case on Generic class
    //It can be only used in one type --> cannot change a new type
    //data1 = Data<String>(value = "Kotlin")      //Error
    //data1 = Data<Boolean>(value = false)        //Error

    //Generic type to be class
    val dataTest = Data<Test>(Test())
    println(dataTest.type())


    /**
     * Generic type more than once
     */
    val error = Pair<Int, String>(404, "Not Found")
    val rgb = Triple<Int, Int, Int>(100, 200, 250)


    /**
     * Superclass can be generic
     * Then, Subclass can be generic as well
     * ========================================================================================================================
     * Type constraint -- Look example below carefully because you can imagine that you can create supper class and subclass
     * You use sub-sub class which is a child of superclass to declare generic 'Superclass' type
     * ========================================================================================================================
     *                                                     Superclass
     *                                                         |
     *     |--------------------------|------------------------|-------------------------|--------------------------|
     * Subclass1                 Subclass2                 Subclass3                 Subclass4                 Subclass5
     *     |--------------------------------------------------------------------------------------------------------|
     * Sub-subclass1<T: Superclass>                          ....                            Sub-subclass5<T: Superclass>
     *
     * ========================================================================================================================
     */
    val test = Fifth<Int>()
    val test2 = Fifth<Double>()
    val test3 = Fifth<Float>()
    val test4 = Fifth<Long>()

}