package unit7.inheritance.`interface`

/**
 * Inheritance and Constructor
 *      • Superclass no Constructor
 *      • Superclass with Primary Constructor only
 *      • Superclass with Secondary Constructor only
 *      • Superclass with Primary and Secondary Constructors
 *      • Adding constructor to subclass
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */

/**
 * Superclass no Constructor
 */
open class Person2 {
    //Not define 'Secondary Constructor'
    //Only default
}

class Programmer2 : Person2() //Call default from Person which is superclass

class Customer : Person {  //Don't have () which is fine to set
    constructor() : super() { //Call default from Person which is superclass

    }
}

class Guest : Person {
    //Don't need to use {} with the constructor
    constructor() : super() //Call default from Person which is superclass
}

/**
 * Superclass with Primary Constructor
 */
open class Device(var os: String)

//Send osName property to a constructor of Device
//Need to define property name that is different from property name of Device
class Tablet(var osName: String) : Device(osName)

//Send osName property to a constructor of Device
//Can declare more property as 'brandName'
class Smartphone(osName: String, brandName: String) : Device(osName)

class Phablet : Device {
    //Can create constructor inside and send the value via super to a constructor of superclass
    constructor(osName: String) : super(osName)
}

/**
 * Superclass with Secondary Constructor only
 */
open class Device2 {
    constructor(os: String)
}

class Tablet2(var osName: String) : Device2(osName)


/**
 * Superclass with Primary and Secondary Constructors
 * In this example: Superclass has overload methods
 */
open class Device3(var os: String) {
    constructor(os: String, brandName: String) : this(os)
}

//Send osName property to a Primary constructor of Device
class Tablet3(var osName: String) : Device3(osName)

//Send osName property to a Secondary constructor of Device
class SmartPhone(var osName: String, brandName: String) : Device3(osName, brandName)

class Phablet3 : Device3 {
    //Send osName property to a Primary constructor of Device as
    constructor(osName: String, brandName: String) : super(osName)
}

class Watch : Device3 {
    //Send osName property to a Secondary constructor of Device
    constructor(osName: String, brandName: String) : super(osName, brandName)
}


/**
 * Adding constructor to subclass
 */
//Solution1
open class Device4(var os: String)

class Tablet4(var osName: String) : Device(osName) {
    //this(os) means declare value of the parameter to the 'osName' property
    constructor(os: String, brandName: String) : this(os) {
    }
}

class Smartphone4(var osName: String) : Device4(osName) {
    constructor(osName: String, brandName: String) : this(osName)

    constructor(osName: String, osVersion: Double, brandName: String): this(osName)
}

//Solution 2
open class Computer

class NoteBook(var brand:String):Computer(){
    private var model = ""

    constructor(brand:String, model:String, processor:String, memory:Int, display:Double): this(brand){
        this.model = model
    }
}