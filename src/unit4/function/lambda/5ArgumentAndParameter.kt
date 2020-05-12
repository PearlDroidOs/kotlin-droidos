package unit4.function.lambda


/**
 * Arguments and Parameters
 * ====== Keyword =====
 * [parameter_name] = [argument]
 * ====== Example =====
 * setPersonal(name="Peter, age="27", married=true)
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main() {

    /**
     * OK Case
     */
    setPersonal("Peter", "Jonson", 29, false, false)               //Input value by instruction
    setPersonal(firstName = "Jane", lastName =  "GorgeSmith", age = 34, married = false, isWorking = false) //Using parameter_name
    setPersonal(married = true, isWorking = false, lastName =  "Burger", age= 25, firstName = "Richard")    //Swap position but using parameter_name


    /**
     * Error Case
     */
    //setPersonal(true, false, "Jame", "Wika",26)
    //setPersonal("Jame", "Wika",26)
}


fun setPersonal(firstName: String, lastName: String, age: Int, married: Boolean, isWorking: Boolean) {
    println("Hello, $firstName $lastName")
    if(age in 20..30 && !isWorking){
        println("We are looking a person like you")
    }else if(age in 20..30 && !married && !isWorking){
        println("We are looking a person like you")
    }else{
        println("We are so sorry. We will contact you later")
    }
}


