package unit4.function.lambda

import kotlin.math.PI
import kotlin.math.pow


/**
 * Lambda Expression
 * [Variable]:[     Type      ] = {[Parameters] -> [Body]}
 * val add: (Int, Int) -> Int = { a:Int, b:Int -> a+b}
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main() {

    /**
     * ================================================================================
     * Lambda styles
     * ================================================================================
     */
    val inc: (Int) -> Int = { n: Int -> n + 1 }
    val minus: (Int, Int) -> Int = { a: Int, b: Int -> a - b }
    val plus: (Int, Int) -> Int = { a, b -> a + b }

    /**
     * ================================================================================
     * Type Inference
     * ================================================================================
     */
    val dec = { n: Int -> n - 1 }
    val divide = { a: Double, b: Double -> a / b }

    /**
     * How to call lambda above
     */
    val num1 = inc(4)
    val num2 = dec(3)

    val total = minus(5, 7)
    val total2 = plus(5, 7)
    val total3 = divide(5.0, 2.5)


    /**
     * ================================================================================
     * Receive value to do something, not return
     * ================================================================================
     */
    val echo = { str: String -> println(str) }
    echo("Hello")

    /**
     * ================================================================================
     * Do something without value input, not return
     * ================================================================================
     */
    val echo2 = { println("Nice a day") }
    echo2()

    /**
     * ================================================================================
     * Receive value to do something in condition and return
     * ================================================================================
     */
    val oddEven: (Int) -> String = { n: Int -> if (n % 2 == 0) "Even" else "Odd" }
    println(oddEven(4))


    /**
     * ================================================================================
     * Lambda with 'it' parameter
     * ================================================================================
     */
    val increment: (Int) -> Int = { it + 1 }
    val oddEven2: (Int) -> String = { if (it % 2 == 0) "Even" else "Odd" }
    val echo3: (String) -> Unit = { println(it) }

    /**
     * ================================================================================
     * Function Type
     * ================================================================================
     */
    var calculator: (Double, Double) -> Double
    calculator = { a, b -> a + b }
    val add = calculator(1.2, 4.3)

    calculator = { a, b -> a - b }
    val minus2 = calculator(10.0, 3.0)

    calculator = { a, b -> a * b }
    val multi = calculator(4.0, 7.0)


    /**
     * ================================================================================
     * Calling Higher Order Function
     * ================================================================================
     */
    fx(a = 2, calculation = { it + 1 })
    fx(5, calculation = { 2 * it })
    fx(5, calculation = { it * it })

    //========= OR ============//
    fx(a = 9) { it * it }
    fx(7) { 5 * it }

    val rectArea = shape(10, 20) { w, h -> (w * h).toDouble() }
    //*** '_' is interesting -> you can use it when you have only one value
    val circleArea = shape(5, 3) { r, _ -> PI * r.toDouble().pow(2) }
    val triangleArea = shape(2, 3) { b, h -> 0.5 * b * h }
    println("Rect area: $rectArea  |  Circle area: $circleArea  | Triangle area: $triangleArea")
    testUnit { println("Eve and Boy") }


    /**
     * ================================================================================
     * Lambda with array method
     * ================================================================================
     */
    //forEach(action: (T) -> Unit)
    val numberOfArray = intArrayOf(49, 2, 10, 39, 79)
    println("========  Even number in array ======")
    numberOfArray.forEach { if (it % 2 == 0) print("$it ") }
    println()

    val strArray = arrayOf("Pearl", "Peter", "John")
    println("========  string in array ======")
    strArray.forEach { println(it) }

    //forEachIndexed(action: (index: i, T) -> Unit)
    val stringNumArray = arrayOf("Zero", "One", "Two", "Three")
    println("Index       Value")
    println("-----------------")
    stringNumArray.forEachIndexed { i, v -> println("$i           $v") }

    //count(predicate: (T) -> Boolean)
    val nums = intArrayOf(19, 93, 2, 5, 14, 44, 69, 59,48)
    val c = nums.count(){it % 2 == 0}
    println("Count mod 2: $c")

    val c2 = stringNumArray.count(){it.startsWith("t", ignoreCase = true)}
    println("Count string of number in array: $c2")

    //filter(predicate: (T) -> Boolean)
    val fNum50 = nums.filter { it > 50 }
    val fStrNumT = stringNumArray.filter { it.startsWith("t", ignoreCase = true) }
    println(fNum50.joinToString(","))
    println(fStrNumT.joinToString(","))

    val fNotNum50 = nums.filterNot { it > 50 }
    val fNotStrNumT = stringNumArray.filterNot { it.startsWith("t", ignoreCase = true) }
    println(fNotNum50.joinToString(","))
    println(fNotStrNumT.joinToString(","))

}

/**
 * ================================================================================
 * Higher Order Function
 * ================================================================================
 */
fun fx(a: Int, calculation: (Int) -> Int) {
    val r = calculation(a)
    println("Result: $r")
}

fun shape(width: Int, height: Int, action: (Int, Int) -> Double): Double {
    return action(width, height)
}

fun testUnit(action: () -> Unit) {
    action()
}
