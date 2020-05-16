package unit5.nullsafety.exception


/**
 * Description: Null characteristics/ Nullable/ Null check/ Elvis Operator/ Safe Call Operator/ Other
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main() {


    /**
     * Null characteristics
     */
    //val a: Int = null                //Error - cannot initialize null
    var temp: String = "Hello"
    //temp = null                      //Error - cannot initialize null

    /**
     *  The question is how to declare 'null'
     *  ============ Using Null Safety =================
     *  keyword is '?' --> Use it at the end of type as below:
     *  var [name]:[type]?
     */
    val a: Int?
    val b: Double? = null                    //Can declare 'null' because of 'null safety'
    val str: String? = null                  //Can declare 'null' because of 'null safety'
    var c: Any? = null
    c = 770
    c = "Hi"
    c = true

    //val message: String? = readLine()        //Message can be 'null' from a user input
    var i: Int? = "123".toIntOrNull()        //Transform to integer or null if not - 123
    var i2: Int? = "123.45".toIntOrNull()    //Transform to integer or null if not - null because of the value
    val d: Double? = "43.79MB".toDoubleOrNull() //Transform to double or null if not - null because of the value
    val s: Short? = "".toShortOrNull()       //Transform to short or null if not - null because of the value

    /**
     * Nullable
     */
    var sd = null
    //sd = 10                               //Error - variable type haven't been declared

    var num: Int? = null
    //num += 1                              //Error - first value of the variable is 'null' --> 'null' cannot calculate

    /**
     * The question is hot to analyze, safe, and  check 'null'
     * ================== Analysis, Safe and Checking 'Null' ==========================
     * • Using 'if'                             | Check value is null or not
     * • Elvis Operator (?:)                    | Declaration default in case that a value is null
     * • Not Null Assertion Operator (!!)       | Using it when you are sure that value is not always 'null'
     * • Call Safety (?)                        | Using it when call a method or a property of an object that may return 'null'
     * • ?.let{ }                               | Using it with Call safety to operate some statements, if the statements are done, it may return 'null'
     */
    /**
     * ================= Using 'if' ===========================
     */
    val x: Int? = 10
    if (x != null) {
        println("x = $x")
    } else {
        println("x = null")
    }

    println()
    print("Enter number 1 :")
    val input: String? = readLine()
    if (input != null) {
        val n = input.toDoubleOrNull()
        if (n != null) {
            println("Number is $n")
        } else {
            println("Error! can't convert to a number")
        }
    } else {
        println("Error")
    }


    /**
     * ==================  Elvis Operator ========================
     * ============== Setting default solution ===================
     * If variable is null, it will be a value of default
     * NullableVar ?: Default
     */
    print("Enter input 1 :")
    val t: String? = readLine() //Nothing change when enter
    val y = t ?: "Default"
    println(y) //Don't use default value when enter

    print("Enter input 2 :")
    val mes: String? = readLine() //Nothing change when enter
    println(mes ?: "Error") //Don't use default value when enter

    val double1: Double? = 123.0
    val double2 = double1 ?: 12.34
    println(double2)

    val num1: Int? = 0
    val num2: Int? = null
    println((num1 ?: 2) + (num2 ?: 4))

    val m = ("123".toIntOrNull() ?: 0) * 10


    /**
     * =============== Safe Call Operator (?.) =====================
     * ========== Use variable, property, and method with null =====
     * if we declare Nullable to an instance
     * if method or property are called directly, they will show error as example below:
     */
    //val str2:String? = readLine()
    //val n = str2.toDouble() //Error because str may be null

    //val d2:Double? = 20.3
    //val i2:Int = d2.toInt() //Error because double2 may be null

    //Safe  Call Operator (?.)
    print("Enter number :")
    val nInput = readLine()
    val number: Double? = nInput?.toDoubleOrNull() //Meaning: variable is null, method won't be called
    println(number)

    val dou: Double? = 10.5
    val integer: Int? = dou?.toInt()

    //Use multi (?.)
    print("Enter 4 space before after your name  :")
    val text: String? = null
    val strOutput =
        text?.trim()?.substring(0, 2)?.toUpperCase() ?: "Default" //Meaning: variable is null, method won't be called
    println(strOutput)

    //Use (?.) with Elvis Operator (?:)
    var len = (text?.length ?: 0) //If text is not null, text will be called 'length' method -> If not -> value = 0


    /**
     * ========== Function ?.let{} ================
     * If you don't want to declare 'if' condition to check 'null'
     * You can use ?.let{} as same as (if ... != null)
     */
    val str3: String? = null
    str3?.let { println("Value : $str3") }


    //.let{} is a Lambda function
    val messageUrl = "www.google.com"
    val url = messageUrl?.let {
        "https://$messageUrl"
    }
    println("URL : $url")


    /**
     * ============== Not Null Assertion Operator (!!) ============
     * If you are confident that value will not be null
     * you can use (!!) to handle
     */
    val aa: Int? = 10
    val bb: Int? = 20
    val cc: Int? = aa!! + bb!!

    val oneTwo: String? = "12"
    val x22 = oneTwo!!.toInt()
}
