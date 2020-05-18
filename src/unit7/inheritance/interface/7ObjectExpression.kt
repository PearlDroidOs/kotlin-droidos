package unit7.inheritance.`interface`

import unit4.function.lambda.c

/**
 * Description - Understand on how to use object expression
 * It is called 'Anonymous Object' or 'Anonymous (Inner) class'
 * Normally, when we want to use interface classes, we need to create a class and inherit them
 * This make lots of class if we want to use
 * So, 'object' expression is an answer to be able to use immediately without creating a new class
 * ==========================================================
 * Keywords
 * --------------------------
 * object: interface_name{
 *      Override members of the interface as an abstract
 * }
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */

/**
 * Example 1
 */
interface Math{
    fun add(a:Int, b:Int):Int
    fun subtract(a:Int, b:Int):Int
}

/**
 * Example 2
 */
interface MouseClick{
    fun onClick()
}

class Button{
    fun onMouseClick(m: MouseClick){
        m.onClick()
    }
}

fun main(){
    /**
     * Example 1
     */
    //Solution 1
    val cal = object : Math{
        override fun add(a: Int, b: Int): Int {
            return a+b
        }

        override fun subtract(a: Int, b: Int): Int = a - b
    }
    val x = cal.add(7,2)
    val y = cal.add(19,22)

    //Solution 2
    calculate(2,12, cal)

    //Solution 3
    calculate(71,12, object : Math{
        override fun add(a: Int, b: Int): Int {
            return a+b
        }

        override fun subtract(a: Int, b: Int): Int = a - b
    })


    /**
     * Example 2
     */
    val bt = Button()
    bt.onMouseClick(object : MouseClick{
        override fun onClick() {
            println("Mouse Click")
        }
    })
}

//Solution 2 & 3
fun calculate(x: Int, y: Int, math:Math){
    println("$x + $y = ${math.add(x,y)}")
    println("$x - $y = ${math.subtract(x,y)}")
}