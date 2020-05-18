package unit7.inheritance.`interface`

/**
 * Description - Understand how to implement abstract class
 * Abstract is a type of class that we may not define perfect values or behavior method all
 * It will be used to set values and behavior method later after calling
 * =======================================================================================
 * Keywords
 * ------------------
 * abstract class [Class_Name]{
 *
 * }
 *
 * ------------------
 * • Do not need to implement 'open' because 'abstract is as same as 'open about inheritance
 *
 * • On the other hands, if you want to inherit values and method, you also need to declare 'abstract' in front of them
 * as same as 'open'
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
abstract class Shape3D {
    abstract val PI: Double                  //Abstract property
    private var color: String? = null

    abstract fun surfaceArea(): Int         //Abstract method
    abstract fun volume(): Int              //Abstract method

    fun shapeName(): String = this.javaClass.name
}

abstract class AbTest
open class AbTest2

//Only once to inherit abstract, more than one interface
class Box(var w: Int, var l: Int, var h: Int, override val PI: Double = 3.14) : Shape3D() {

    override fun surfaceArea(): Int {
        return (w * l * 2) + (w * h * 2) + (h * l * 2)
    }

    override fun volume(): Int = w * l * h
}

fun main(){
    val b = Box(10,20,30)
    println(b.surfaceArea())
    println(b.volume())

    //val shape = Shape3D()           //Error - We can implement Shape3D class directly because it is an abstract class
}