package unit7.inheritance.`interface`

import java.time.LocalDate

/**
 * Description: Inheritance
 * Inherit ability/ Behavior/ property/ functions from 'base class' or 'superclass'
 *      • Use 'open' when you want to use inheritance concept
 *      • If you don't use 'open' and you will inherit the class, the system will show error
 * New class which inherit from 'superclass' calls 'Subclass' or 'Derived Class'
 * ================================================================================
 * • Superclass
 * open class [Name1]{
 *      ....
 * }
 *
 * class [Name2] : [Name1]{
 *      .....
 * }
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
open class A
open class B : A()
class C : B()
//class D: C(){}          //Error because class C does not declare 'open'


/**
 * Why Inheritance is useful?
 * Example below: Person and Programmer class have the same properties and method [name, yearBorn, getAge()]
 * We can combine these to be inheritance at next green point
 */
open class Person {
    var name = "Peter"
    var yearBorn:Int = 2020

    fun getAge() = LocalDate.now().year - yearBorn
}

class ProgrammerTemp {
    var name = "Jame"
    var yearBorn:Int = 200
    var salary = 0
    var expertLanguage = ""

    fun getAge() = LocalDate.now().year - yearBorn
}

/**
 * ========  Inheritance  ==============
 */
class Programmer : Person() {
    var salary = 0
    var expertLanguage = ""
}

fun main(){
    val pro = Programmer()
    pro.yearBorn = 1990
    pro.salary = 100000
    println(pro.getAge())

    val per =Person()
    per.name = "Honey"
    //per.salary = 200000               //Error because superclass does not have salary property
    //per.expertLanguage = "Thai"       //Error because superclass does not have salary property
}

