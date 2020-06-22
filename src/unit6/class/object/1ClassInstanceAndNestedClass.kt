package unit6.`class`.`object`

/**
 * =========== Class ==============
 * Is a structure to declare elements, behavior, methods, and others into a class
 * As a blueprint
 * ================================
 * class [Name]{
 *     (Methods and Property)
 * }
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
class Person2{
    //...
}

class BankAccount2{
    //...
}

class Car{
    //..
}

/**
 * Nested Class
 */
class Outer{
    var a: Int = 0

    class Nested{
        fun functionInNested(){

        }
    }
}

/**
 * Inner Class
 * be able to access Outer2's variable
 */
class Outer2{
    var a: Int = 0

    inner class Inner{
        var b:Int = a
        fun functionInNested(){

        }
    }
}

/**
 * Calling a class to create instance
 */
fun main(){
    //Solution 1
    val person = Person2()

    //Solution 2
    val bankAccount:BankAccount2
    bankAccount = BankAccount2()

    //Solution 3
    val car:Car = Car()


    //Nested Class - calling
    Outer.Nested().functionInNested()
}