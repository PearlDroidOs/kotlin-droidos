package unit6.`class`.`object`

import java.time.LocalDate

/**
 * ======== Apply ============
 * Reduce to use repeat instance when call variables and methods in a class
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
class Spy{
    var name = ""
    var code = ""
    var yearBorn = 0
    fun getAge() = LocalDate.now().year - yearBorn
}

fun main() {
    val spy = Spy()
    //Original call
    spy.name = "Jame Bond"
    spy.code = "007"
    spy.yearBorn = 1980
    println(spy.name)
    println(spy.code)
    println(spy.getAge())

    //When use 'apply'
    spy.apply {
        name = "Jame Bond"
        code = "007"
        yearBorn = 1980
        println(name)
        println(code)
        println(getAge())
    }
}