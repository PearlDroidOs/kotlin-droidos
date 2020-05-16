package unit6.`class`.`object`

/**
 * ======== Enum class ==========
 * is a type of information choice to specific in a thing such as Day/ Month/ Kind of Car etc.
 * ==============================
 * enum class [name]{
 *      member1
 *      member2
 * }
 */
enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

enum class DayOfWeek{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum class MobileOS{
    IOS, ANDROID
}

enum class Storage{
    GB16, GB32, GB64, GB128, GB256, GB512
}

//Property is val: Cannot change a value
//Property is ver: Can change a value
enum class Gender(var gender: String){
    MALE("Male"),
    FEMALE("Female"),
    SHEMALE("She male")
}

enum class Result(val value: Byte){
    WON(3), DRAWN(1), LOST(0)
}

/**
 * ===== Calling enum class ==========
 */
class Device{
    private var OS:MobileOS = MobileOS.IOS
    var storage:Storage = Storage.GB256

    fun setOS(os: MobileOS){
        this.OS = os
    }

    fun getOS(): MobileOS = this.OS
}

/**
 * ===== Calling enum class ==========
 */
fun main(){
    var dw: DayOfWeek
    dw = DayOfWeek.FRIDAY
    dw = DayOfWeek.TUESDAY

    val birthday = DayOfWeek.MONDAY
    //val hol = DayOfWeek.HOLIDAY           //Error: HOLIDAY is not a member of 'DayOfWeek'

    val today = DayOfWeek.SATURDAY
    if(today == DayOfWeek.SUNDAY){
        val tomorrow = DayOfWeek.MONDAY
    }

    println(today.name)

    val dv = Device()
    println("1 Storage : ${dv.storage}  |  OS : ${dv.getOS()}")
    dv.storage = Storage.GB512
    dv.setOS(MobileOS.ANDROID)
    println("2 Storage : ${dv.storage}  |  OS : ${dv.getOS()}")

    var gen = Gender.FEMALE.gender
    Gender.SHEMALE.gender = "None"

    println("Your Point ${Result.DRAWN.value}")
    var score = 0
    val r:Result = Result.DRAWN
    score += r.value
    println("Your score: $score")
}