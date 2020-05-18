package unit6.`class`.`object`

import java.time.LocalDate
import kotlin.math.PI

/**
 * Description - Modifier and lateinit
 * Modifier is to control a property or an object level to access
 *      • private is to only use in a class
 *      • protected is to only use in a package
 *      • public is to use worldwide in a project
 * Note: In this learning, it will only show 'private'
 *
 * lateinit or Late-initialized property
 * Initialize value later but cannot set in Primitive Type such as Int/ Double/ Float/ Long/ Boolean/ Char etc.
 * 'String' can be used by lateinit in a property
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */

/**
 * ========== Private Modifier ==============
 */
//Solution 1
class Triangle2 {
    //Property name can be same or different from parameter name
    private var base: Int
    private var height: Int

    constructor(base: Int, height: Int) {
        this.base = if (base > 0) base else 0
        this.height = if (height > 0) height else 0
    }

    fun getArea() = 0.5 * this.base * this.height       //Clearly calling to properties in a class
}

//Solution 2
class Circle4(private var radius: Int) {
    init {
        radius = if (radius > 0) radius else 0
    }

    fun getArea() = PI * radius * radius
    fun getPerimeter() = 2 * PI * radius
}

//Solution 3
class ThaiDate(private var day: Int, private var month: Int, private var year: Int) {
    init {
        if (!validDate(day, month, year)) {
            day = 0
            month = 0
            year = 0
        }
    }


    private val m = arrayOf(
        "January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November", "December"
    )

    fun getMonthName(): String? {
        return if (month in 1..12) m[month - 1] else null
    }

    private fun validDate(d: Int, m: Int, y: Int): Boolean {
        return try {
            //Check (year, month, day)
            LocalDate.of(y, m, d)
            true
        } catch (ex: Exception) {
            false
        }
    }
}

/**
 * ============== lateinit ==================
 * initialized later
 * Benefits: We will create instance and set an initialization when we want to do. This will reduce system resource
 */
class Shape {
    private lateinit var circle: Circle4
    private lateinit var triangle: Triangle2

    fun circlePerimeter(radius: Int): Double {
        circle = Circle4(radius)
        return circle.getPerimeter()
    }

    fun triangleArea(base: Int, height: Int): Double {
        triangle = Triangle2(base, height)
        return triangle.getArea()
    }
}


fun main() {
    /**
     * Learning - Private Modifier
     */
    //Testing Solution 1
    var t = Triangle2(10, 3)

    //t.base = 9            //Cannot set new value of the property because of 'private' modifier even it is declared 'var'
    //t.height = 3          //Cannot set new value of the property because of 'private' modifier even it is declared 'var'
    println("Triangle Area : ${t.getArea()}")

    //Testing Solution 2
    val c = Circle4(40)
    println("Circle Area: ${c.getArea()}")
    println("Circle Perimeter: ${c.getPerimeter()}")

    //Testing Solution 3
    val thDate = ThaiDate(31, 13, 2020)       //Try out of exist month
    println("1 Month : ${thDate.getMonthName() ?: "Error"}")   //Show 'Month : Error'
    //thDate.validDate(21, 23,2020)                          //Cannot call the method because of 'private modifier'

    val thDate2 = ThaiDate(3, 12, 2020)
    println("2 Month : ${thDate2.getMonthName() ?: "Error"}")

    /**
     * ============== lateinit ==================
     */
     val shape =  Shape()
    println("Circle Perimeter: ${shape.circlePerimeter(12)}")
    println("Triangle Area: ${shape.triangleArea(7, 12)}")

}
