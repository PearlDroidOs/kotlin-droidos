package unit3.array.string.number


/**
 * This class will indicate about array, string and number
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args:Array<String>){

    /**
     * Pair:   Store duo values (Only 2 value)
     * Pair(value1, value2)
     */
    val size = Pair(50, 100)
    val width = size.first
    val height = size.second

    val name = Pair("James", "Bond")
    val msg = "Hi ${name.first} ${name.second}" //Hi James Bond


    val error = Pair(404, "Not Found")
    println("Error: ${error.first} - ${error.second}") //Error: 404 - Not Found


    /**
     * Triple:      Store triple value (Only 3 values)
     * Triple(value1, value2, value3)
     */
    val boxSize = Triple(10,20,30)
    val volume = boxSize.first * boxSize.second * boxSize.third
    println(volume)

    val (date, month, year) = Triple(1, "January", 2020)
    println("Today is $date $month $year")

    val (hour, minute, _) = Triple(12,30,0)
    println("Time: $hour:$minute")


}