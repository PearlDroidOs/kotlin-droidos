package unit3.array.string.number

/**
 * Description: String and related methods
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    /**
     * =======  Length, Uppercase, Lowercase, Capitalize, Decapitalize ========
     * • length                 | Get size of string
     * • toUpperCase()          | Change all value of string to be capital text
     * • toLowerCase()          | Change all value of string to be lower case
     * • capitalize()           | Change the first character of string to be uppercase
     * • decapitalize()         | Change the first character of string to be lowercase
     */
    val str: String = "Kotlin"
    val steLength = str.length //6
    val strUpper = str.toUpperCase() //KOTLIN
    val strLower = str.toLowerCase() //kotlin

    val hello = "Hello".length
    val helloUpper = "Hello".toUpperCase()
    val androidStudio = "Android Studio".count() //Count 14
    val strCapitalize = "android studio".capitalize() //Android studio
    val strDecapitalize = "Android Studio".decapitalize() //android Studio

    /**
     * =======  Cutting space  ===========
     * • trim()         | cut all space of string
     * • trimStart()    | cut all space of string before string
     * • trimEnd()      | cut all space of string after string
     */
    val text = "  Android Studio    "
    println("Trim() :::${text.trim()}::::")             //Trim() :::Android Studio::::
    println("TrimStart() :::${text.trimStart()}:::")    //TrimStart() :::Android Studio    :::
    println("TrimEnd() :::${text.trimEnd()}:::")        //TrimEnd() :::  Android Studio:::


    /**
     * =======  Checking empty, null, blank of String =========
     * • isEmpty()          | Is the string empty? ("" means empty) --> then result will be true, if not false
     * • isNotEmpty()       | Is not the string empty? ("ab" means not empty) --> then result will be true, of mot false
     * • isNullOrEmpty()    | Is the string null or empty? (meanings: "" or null) ---> true if not false
     * • isBlank()          | Is the string blank? ("" means blank) --> then result will be true, if mot false
     * • isNotBlank()       | Is not the string blank? (" " mean not blank) --> then result true, if mot false
     * • isNullOrBlank()    | Is the string null or empty? ("" or null) ---> then result true, if not false
     */
    val str1 = ""
    val a = str1.isEmpty() //true
    val b = str1.isBlank() //true
    println("Empty: $a  - Blank: $b")

    val str2 = "  "
    val c = str2.isEmpty() //false
    val d = str2.isBlank() //true
    println("Empty: $c  - Blank: $d")

    val str3 = "\n"
    val e = str3.isEmpty() //false
    val f = str3.isBlank() //true
    val g = "  \n  ".isBlank() //true
    val h = " _ ".isBlank() //false
    println("e: $e,  f: $f,  g: $g,  h: $h")

    /**
     * ====================== Start with and End with ========================
     * • startWith(value) or startWith(value, ignoreCase = true/false)      | Checking start with value
     * • endsWith(value) or endWith(value, ignoreCase = true/false)         | Checking end with value
     */
    val url = "https://www.google.com"
    if (url.startsWith("https://") || url.startsWith("http://")) {
        //statements
    } else if (url.endsWith(".com")) {
        //statements
    }

    val img = "logo.png"
    //Just check last value of image as same as condition with ignore case
    if (img.endsWith("PnG", ignoreCase = true))
        println("Yes !!!")

    /**
     * ======== Cutting string by condition ============
     * • take(number)               | Cut value from start by number "Kotlin" -> "Kot"
     * • take(number)               | Cut value from end by number  "Kotlin" -> "lin"
     * • drop(number)               | Cut value by starting position after the number "Kotlin" -> "lin"
     * • dropLast(number)           | Cut value by starting position from end to number index and keep others "Kot"
     * • substring(start index)             | Get value from start index to end of value "Kotlin".substring(3) -> "lin"
     * • substring(start index, end index)  | Get value from start index to end index "kotlin".substring(0,3) -> "Kot"
     * • substring(start index..end index)  | Get value from start index to end index "kotlin".substring(0,3) -> "Kot"
     * • substringAfter(text)               | Get value after text        ("No")    "No Pain No Gain" -> " Pain No Gain"
     * • substringAfterLast(text)           | Get value after last text   ("No")    "No Pain No Gain" -> " Gain"
     * • substringBefore(text)              | Get value before text       ("Gain")  "No Pain No Gain" -> "No Pain No "
     * • substringBeforeLast(text)          |Get value before last text   ("No")    "No Pain No Gain" -> "No Pain "
     */
    var mainString = "Kotlin"
    var s = mainString.take(3)              //Kot
    s = mainString.takeLast(3)                     //lin
    s = mainString.drop(3)                         //lin
    s = mainString.dropLast(3)                     //Kot
    s = mainString.substring(3)             //lin
    s = mainString.substring(0, 3)                     //Kot

    mainString = "No Pain No Gain"
    s = mainString.substringAfter("No")      //" Pain No Gain"
    s = mainString.substringAfterLast("No")  //" Gain"
    s = mainString.substringBefore("Gain")   //"No Pain No"
    s = mainString.substringBeforeLast("No")   //"No Pain"


    /**
     * ========= Finding position or index =============
     * • indexOf(text)                          | Find index by text -> if it cannot find then return -1
     * • indexOf(text, start from index)        | Find index by text with start from index (Default: start from index = 0)
     * • lastIndexOf(text)                      | Find last index of text
     * • lastIndexOf(text, start from index)    | Find last index of text with start from index (Default: start from index = 0)
     */
    var idx = mainString.indexOf("No")          //idx = 0
    idx = mainString.indexOf("No", 5)      //idx = 8
    idx = mainString.lastIndexOf("No")               //idx = 8
    idx = mainString.indexOf("PAIN")                 //idx = -1


    /**
     * ========== Replacing String =================
     * • replace(old text, new text)            | Replace new value from every old value
     * • replaceFirst(old text, new text)       | Replace new value from first old value that it have
     */
    val message = "I love you as you love I"
    val s1 = message.replace("love", "hate")        //I hate you as you hate I
    val s2 = message.replace("Love", "hate")        //I love you as you love I
    val s3 = message.replaceFirst("love", "like")   //I like you as you love I


    /**
     * ======== Split String and Join String =============
     * • split(Delimiter)               | Split string by delimiter
     * • joinToString(Delimiter)       | Join string by delimiter
     */
    val date = "14/02/2020"
    val paramsOfDate = date.split("/")    //[14, 02, 2020] - paramsOfDate = arrayOf("14","02","2020")

    val link = "www.google.com"
    val paramsOfLink = link.split(".")    //[www, google, com] - paramsOfLink = arrayOf("www","google","com)

    val dataByJoinString = paramsOfDate.joinToString("-")       //14-02-2020

}