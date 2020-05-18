package unit7.inheritance.`interface`

/**
 * Description - Understand on how to build Interface class and use it
 * Interface class is a set of properties and methods without defining any values and processes of the methods
 * It uses for inheritance to any class to do more processes
 * Therefore, Interface class is as similar as 'abstract' class but it is different to use in the depth details
 * Generally, we use 'interface class' more than 'abstract' class
 * =====================================================================
 * keywords
 * ------------------------------
 * interface [Name_Class]{
 *      properties - without values
 *      methods - without behaviors
 * }
 *
 * ------------------------------
 * • Must not set a value and an behavior to them
 * • Be Only public modifier
 * • May be able to define 'abstract before functions and properties: No necessary No declare
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
interface Shape3D2 {
    val PI: Double                  //Abstract property

    fun getName(): String           //Abstract method
    fun surfaceArea(): Int          //Abstract method
    fun volume(): Int               //Abstract method
}

/**
 * ========= Calling interface class =================
 */
class Box2(var w: Int, var l: Int, var h: Int) : Shape3D2 {
    override val PI: Double = 3.14

    override fun getName(): String = this.javaClass.name

    override fun surfaceArea(): Int = (w * l * 2) + (w * h * 2) + (h * l * 2)

    override fun volume(): Int = w * l * h
}

/**
 * Example: Behavior implementation of interface and inheritance
 */
interface Login {
    var email: String
    var password: String
}

//Can override and Can unused override as well
interface User : Login {
    var fistName: String
    var lastName: String
    fun name() = "$fistName $lastName"
}

class Customer2 : User {
    override var email: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var password: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var fistName: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var lastName: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun name(): String {
        return super.name()
    }
}

/**
 * Example2: Behavior implementation of interface and inheritance
 */
interface OS
interface Camera
interface Display
open class Device9

//More than one interface - only one class
class Mobile : OS, Camera, Device9()
class Smartphone9 : OS, Camera, Display, Device9()


/**
 * The implement way is as similar as 'abstract' learning before
 */
fun main() {
    val b = Box2(5, 10, 15)
    println(b.getName())
    println(b.surfaceArea())
    println(b.volume())
}


