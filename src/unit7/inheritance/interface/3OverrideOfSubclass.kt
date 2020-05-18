package unit7.inheritance.`interface`

/**
 * Description: Override of Subclass
 * 'open' and 'override' are a modifier
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */

/**
 * Override property
 */
open class Java {
    open val version: Double = 15.0
    open val compiler = "Java Compiler"
    val fileExtension = ".java"
    val owner = "Oracle"
}

class Kotlin : Java() {
    override val version: Double = 2.0
    override val compiler: String = "Kotlin Compiler"
    //override val fileExtension = ".kt"  //Error because the 'fileExtension' property of superclass does not set 'open'
    //val owner = "JetBrains"             //Error because of using the same property name
}

open class Device5(open var os: String)

class Smartphone5(override var os: String) : Device5(os)

/**
 * Override Methods
 */
open class Shape {
    open fun area() = 0.0
    fun name() = "Shape"
}

class Circle(var radius: Int) : Shape() {
    override fun area() = 3.141 * radius * radius

    fun area(pi: Double = 3.14) = pi * radius * radius  //Overload method as using same name
    //override fun name() = "Circle"        //Error because the 'name' method of superclass does not set 'open'
}

/**
 * Refer to properties and methods of superclass
 */
open class Circle2(open var radius: Int) {
    open val PI = 3.14159
    open fun area() = PI * radius * radius
    open fun perimeter() = 2 * PI * radius
}

class Cylinder(override var radius: Int, var height: Int) : Circle2(radius) {
    //Set new PI property
    override val PI: Double = 3.14

    //Use PI of superclass by calling 'super.PI'
    override fun area(): Double = (super.PI * radius * radius) * 2 + (2 * PI * radius * height)

    //Use original area function of superclass even it is already called and set the new value or new behavior
    //Use perimeter function of superclass --> perimeter() OR super.perimeter() <-- both same
    fun surfaceArea() = super.area() * 2 + perimeter() * height
    fun volume() = super.area() * height
}


fun main() {
    val language = Java()
    //Result: Version : 15.0  |  Compiler : Java Compiler  | FileExtension : .java
    println("Version : ${language.version}  |  Compiler : ${language.compiler}  | FileExtension : ${language.fileExtension}")

    var lan = Kotlin()
    //Result: Version : 2.0  |  Compiler : Kotlin Compiler  | FileExtension : .java
    println("Version : ${lan.version}  |  Compiler : ${lan.compiler}  | FileExtension : ${lan.fileExtension}")

    //Check value of language after create Kotlin subclass
    //Result: same - Version : 15.0  |  Compiler : Java Compiler  | FileExtension : .java
    println("Version : ${language.version}  |  Compiler : ${language.compiler}  | FileExtension : ${language.fileExtension}")

}