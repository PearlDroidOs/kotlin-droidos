package unit6.`class`.`object`


/**
 * Description about Class with declaring properties
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
class Person{
    //These are a property of Person class
    val firstName: String = "Peter"
    val lastName: String = "Jason"
    val phone: String? = "089234xxxx"
    val birthday = Triple(31, 1, 2011)
    var spouseName: String? = null
    var occupation: String? = null
}


/**
 * Calling properties in a class
 */
fun main(){
    /**
     * ======== Calling firstName and lastName properties to show on 'println' function =========
     */

    val person = Person()
    println("First name is ${person.firstName}  -  Last name is ${person.lastName}")

    /**
     * ===== Access rights ===========
     */
    //person.firstName = "Pearl"            //Error - Property of firstName is declared to be an immutable variable (val)
    //person.lastName = "DroidOs"           //Error - Property of lastName is declared to be an immutable variable (val)

    //Not Error - Property of occupation is declared to be an mutable variable (var)
    person.occupation = "Marketing"
    println("Job : ${person.occupation}")

    /**
     * ========= Calling a property with Null safety ==================
     */
    val phone = person.phone ?: ""
    println("Phone : $phone")

    //Does not show anything because spouse is null
    person.spouseName?.let{
        println("Spouse : $it")
    }


}