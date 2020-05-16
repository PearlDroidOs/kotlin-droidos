package unit6.`class`.`object`


/**
 * Description: Constructor of a class
 * It is the first process to prepare data of a class that is divided into 3 type
 * • Primary Constructor with property
 * • Primary Constructor with parameter
 * • Secondary Constructor
 */


/**
 * ===========   Primary Constructor with property ===============
 * Coding shortly
 */
class Circle1(var radius: Int) {

}

class Circle2(var radius: Int, val PI: Double = 3.14159) {
    fun getArea() = PI * radius * radius
    fun getPerimeter() = 2 * PI * radius
}


/**
 * ===========   Primary Constructor with parameter ===============
 * Use parameters to keep in properties
 * parameters: do not use 'var' and 'val'
 * properties: use 'var' or 'val'
 */
class Triangle1(base: Int, height: Int) {
    //Property name can be same or different from parameter name
    var base = base
    var height = height

    fun getArea() = 0.5 * this.base * this.height       //Clearly calling to properties in a class
}


/**
 * ========== Secondary Constructor ================
 * Class Header don't need to be declared
 * Create method name 'constructor' and receive data via parameters
 * Create properties to receive parameters' values
 *
 * 'constructor' method always work automatically
 */
class Rectangle1 {
    var width: Int          //Do not need to give a value
    var height: Int         //Do not need to give a value

    constructor(width: Int, height: Int) {
        //Save value from parameter to property
        //If property and parameter name are same, you need to use 'this' to call the properties as below:
        this.width = width
        this.height = height
    }

    fun getArea(): Int = this.width * this.height
}

class Rectangle2 {
    var width: Int          //Do not need to give a value
    var height: Int         //Do not need to give a value

    /**
     * Overload methods
     */
    constructor(width: Int, height: Int) {
        //Save value from parameter to property by condition
        //If property and parameter name are same, you need to use 'this' to call the properties as below:
        this.width = if (width > 0) width else 0
        this.height = if (height > 0) height else 0
    }

    constructor(width: Int) {
        this.width = if (width > 0) width else 0
        this.height = if (width > 0) width else 0
    }

    fun getArea(): Int = this.width * this.height
}


/**
 * ================= Extra tips - Init Block ======================
 */
class Circle3(var radius: Int, val PI: Double = 3.14159) {

    //First step before doing constructor if have
    init {
        //Checking Statement
        radius = if (radius > 0) radius else 0
    }
}

fun main() {
    /**
     * ========= Calling - Primary Constructor with property ============
     */
    val c1 = Circle1(10)
    val c2 = Circle2(20)
    println("Area : ${c2.getArea()}")
    println("Perimeter : ${c2.getPerimeter()}")


    /**
     * ========= Calling - Primary Constructor with parameter ============
     */
    val t = Triangle1(10, 4)
    println("Triangle Area :  ${t.getArea()}")


    /**
     * ========= Calling - Secondary Constructor ============
     */
    val r1 = Rectangle1(2, 8)
    println("1 Rectangle Area : ${r1.getArea()}")

    val r2 = Rectangle2(20, 5)
    println("2 Rectangle Area : ${r2.getArea()}")
    val r22 = Rectangle2(-20, 5)
    println("2.2 Rectangle Area : ${r22.getArea()}")
    val r23 = Rectangle2(20)
    println("2.3 Rectangle Area : ${r23.getArea()}")
}