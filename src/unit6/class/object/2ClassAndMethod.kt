package unit6.`class`.`object`

/**
 * Description on Class with declaring methods
 */
class Calculator {
    //Solution 1
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    //Solution 2
    fun subtract(num1: Int, num2: Int) = num1 - num2
    fun subtract(num1: Double, num2: Double) = num1 - num2 //Overload

    //Solution 3
    fun calculate(num1: Double, num2: Double, action: (Double, Double) -> Double) = action(num1, num2)

    //Solution 4
    fun calculate2(num1: Double, num2: Double, action: (Double, Double) -> Double): Double {
        return action(num1, num2)
    }
}

/**
 * ========== Calling class - Using Method =========
 */
fun main() {
    val c = Calculator()
    val total = c.add(5, 2)
    val total2 = c.subtract(7, -9)
    val total3 = c.subtract(4.5, 1.2)

    println("Total add: $total  | Total subtract(Int) : $total2  |  Total subtract(Double) : $total3")

    val cal = c.calculate(6.0, 3.0) { num1, num2 -> num1 / num2 }
    val cal2 = c.calculate(6.0, 3.0, action = { num1, num2 -> num1 * num2 })
    val cal3 = c.calculate2(6.0, 3.0) { num1, num2 -> num1 + num2 }
    val cal4 = c.calculate2(6.0, 3.0, action = { num1, num2 -> num1 - num2 })

    println("Cal1 : $cal    | Cal2 : $cal2               |  Cal3 : $cal3             | Cal4 : $cal4")
}

