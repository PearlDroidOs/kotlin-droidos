package unit7.inheritance.`interface`

/**
 * Description: Understand on how to create and use private and protected modifier
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
open class Demo {
    protected var p1: Int = 0
    protected open var p2: Double = 0.0
    //private open var p3:String = "" //Error - cannot have private and open to work together

    private fun m1() {}
    protected open fun m2() {}
    //private open fun m3(){}     //Error - cannot have private and open to work together
}

class Dummy : Demo() {
    override var p2: Double = p1 + 0.3  //OK - p2 have protect modifier and 'open' from Demo but Dummy can inherit and override it

    fun m1() {}                         //OK - can use name as same as m1 of Demo. So, this is a new function. no override

    override fun m2() {                 //OK - m2 have protect modifier and 'open' from Demo but Dummy can inherit and override it
        super.m2()
    }
}

fun main(){
    fun m(){
        val d = Dummy()
        d.m1()

        // Error - test class is not in order inheritance, so it can only call m1() method.
        // m2() and p2 already have a protected modifier then they cannot access to Test class
        //d.m2()
        //print(d.p2)
    }

    val d2= Dummy()
    d2.m1()

    // Error - test class is not in order inheritance, so it can only call m1() method.
    // m2() and p2 already have a protected modifier then they cannot access to Test class
    //d2.m2()
    //print(d2.p2)
}


