package unit5.nullsafety.exception

/**
 * Description - Understand on how to use Nullable in function or method
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main() {

    println(month(0))
    println(month(12))
    println(month(13))


    println(month(13) ?: "Default")
    val temp = month(15)?.let { "Error" } //null because month is more than 12 than ?. won't allow to do 'let'
    println(temp)

}

fun month(month: Int): String? {
    val listOfMonth = arrayOf(
        "January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November", "December"
    )

    if (month in 1..12) {
        return listOfMonth[month - 1]
    } else {
        return null
    }
}
