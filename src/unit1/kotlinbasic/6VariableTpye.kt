package unit1.kotlinbasic

/**
 * This session will talk on variable which is divided into 2 types:
 * - Mutable variable   (var) : can change value
 * - Immutable variable (val) : cannot change value
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    /**
     * ========== Mutable variable ===================
     * var [name]:[type]
     */
    var x: Int
    var result: Double
    var str: String

    /**
     * Error case
     */
    //var w, y, z :Int
    //var a, b, c :String
    //var x: Double
    //var t: Short = 10E8

    /**
     * Initialize values for a correct way
     */
    var valueOfByte: Byte
    valueOfByte = 100
    var valueOfInt: Int = 456
    var valueOfDouble: Double = 456.789
    var valueOfUInt: UInt = 123u
    var valueOfUShort: UShort = 9999U
    var valueOfULong: ULong = 1234567UL

    /**
     * Error case
     */
    //var i1: Int = 123.45
    //var i2: Int = _1234
    //var i3:Int = 1234_

    //var d1:Double = 123

    //var f1: Float = 1.99
    //var f2: Float = 4

    //var b1: Boolean = "true"

    //var c1:Char = "M"

    //var str1:String = 'Kotlin for Android'

    /**
     * Initialize values for a correct way
     */
    var i4: Int = 1_234
    var i5: Int = 1_234_567
    var i6: Int = 1_2_3_4_5

    var d2: Double = 123.0
    var d3: Double = 1_23.45_6

    var f3: Float = 123.45F
    var f4: Float = 678f

    var b2: Boolean = true
    var b3: Boolean = false

    var c2: Char = 'A'
    var c3: Char = 'M'
    var c4: Char = '\u0061' //a

    var str2: String = "Kotlin for Android"
    var str3: String = "1234"
    str3 = "5678"       //Result of 'str3' is 5678

    var a1: Any = 123   //Result of 'a1' is 123 (Integer)
    a1 = 4.56           //Result of 'a1' is 4.56 (Double)
    a1 = "Kotlin"       //Result of 'a1' is Kotlin (String)
    a1 = true           //Result of 'a1' is true (Boolean)


    /**
     * ========== Immutable variable ===================
     * var [name]:[type] = [value]
     */
    val pi: Float = 3.141f
    //pi = 2.345f //Error case because of immutable variable

    val princePerUnit: Short = 1000
    val lat: Double
    val lon: Double
    lat = 100.12345     //Not error case because it does not have any value before
    lon = 475.43        //Not error case because it does not have any value before
    // lon = 87.34      //Error case because it have value already


    /**
     * ================= Type Interface ======================
     * val [name] = [value]
     * var [name] = [value]
     */
    val strValue = "Hello Kotlin"
    val intValue = 123
    val doubleValue = 23.56
    val floatValue = 12.45f
    val booleanValue = true

    var intImmutableValue = 10
    intImmutableValue = 20
    intImmutableValue = 30
    //intImmutableValue = "Hello"  //Error case
    var strImmutableValue = "Hi Pearl"
    strImmutableValue = "Hi Peter"


    /**
     * ================= Change type ======================
     * If values are not sure to transform --> Use .toIntOrNull()/ .toDoubleOrNull()/ .toFloatOrNull()/ .toXxxOrNull()
     *
     */

    val cByte: Byte = 100
    val cInt: Int = cByte.toInt()

    val cShort: Short = 9999
    val cLong: Long = cShort.toLong()

    val cInt2: Int = 249                    //249
    val cDouble: Double = cInt2.toDouble()  //249.0

    val cInt3 = "1234".toInt()

    //val cInt4 = "1234.5".toInt() //Error case when you run because of '.'
    val cInt5 = "1234.5".toDouble().toInt() //1234 - not error case

    val cStr = 123.toString()

    val cBoolean1: Boolean = "true".toBoolean()     //true
    val cBoolean2: Boolean = "True".toBoolean()     //true
    val cBoolean3: Boolean = "tRuE".toBoolean()     //true
    val cBoolean4: Boolean = "false".toBoolean()    //false
    val cBoolean5: Boolean = "fAlSe".toBoolean()    //false

    // Every worlds which is not "true" will be initialized by false value
    val cBoolean6: Boolean = "Yes".toBoolean()      //false
    val cBoolean7: Boolean = "Hello".toBoolean()    //false

    var cLong2:Long = 1234
    var cShort2: Short = cLong2.toShort() // s = 1234
    cLong2 = 1234567 //cLong2 have a value which maximizes much of Short value
    cShort2 = cLong2.toShort() //s = -10617


    /**
     * String Appearance
     */
    val vStr = "IntelliJ" +" "+ "IDEA"
    val vStr2 = "108" + 1009 //1081009 (String)

    val day = 25
    val month = "May"
    val year = 2020
    val date = "Date: " +day +" " +month + " " + year    //Date: 25 May 2020
    val date2 = "Date: $day $month $year"                       //Date: 25 May 2020

    /* //Error case
    val vStr3 ="Hello"
                world"

     */

    //Result: Hello World
    val vStr4 = "Hello"+
            " World"

    //Support multi line by triple quotes (""")
    /* Result will be:
         Hello World
            This is my space
            Do you want to come in?
     */
    val vStr5 = """Hello World
    This is my space
    Do you want to come in?"""

    //Solve spaces before text in second and third lines by using '|' and '.trimMargin' function as example below:
    /* Result will be:
         Hello World
         This is my space
         Do you want to come in?
     */
    val vStr6 = """Hello World
    |This is my space
    |Do you want to come in?""".trimMargin()


    /**
     * Inserting value in String
     */
    val w = 100
    val h = 200
    val title = "Calculating Area"
    val area = "$title ----> Width: $w  | Height: $h | Area is ${w*h}"
    println(area)

    /**
     * String Options
     *      \n means a new line
     *      \t means one tap space
     *      \\ means write '\' in the string
     *      \$ means write '$' in the string
     *      \" means write " in the string
     *      \' means write ' in the string
     *
     */
    println("Press \"Enter\" to continue") //Press "Enter" to continue

    //A new line
    //new 	a tap space 'YouTube' can make $
    println("A new line \nnew \ta tap space \'YouTube\' can make \$")

}