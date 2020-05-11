package unit2.operator.controlflow

/**
 * This class will represent on Condition with operators
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {

    /**
     * If condition
     */
    val code = "abcde"
    if (code == "abcde") {
        //statements
        println("YES")
    }

    val num = 200
    val num2 = 250
    val num3 = 100
    var max: Int = num
    if (num2 > max)
        max = num2

    if (num3 > max)
        max = num3

    println("Max number is $max")

    /**
     * If - Else condition
     */
    val numInStock = 1
    if (numInStock > 0) {
        //True - statements
        println("Have products")
    } else {
        //False - statements
        println("Don't have products")
    }
    val dateRange = 1..31
    val day = 44
    if (day in dateRange) {
        println("Today is $day")
    } else {
        println("Day should in between 1 and 31")
    }


    /**
     * Else - If Condition
     */
    val balance = 30_000
    val withdraw = 7_500
    if (balance < withdraw) {
        println("Your balance is not enough")
    } else if (withdraw > 20_000) {
        println("Maximum for withdraw is 20,000")
    } else if (withdraw % 100 != 0) {
        println("Withdraw Amount should be integer hundred")
    } else {
        println("Success Withdraw : $withdraw - Total balance : ${balance - withdraw}")
    }


    /**
     * Complex If - Condition
     */
    val login = "admin"
    val password = "1234"
    if (login == "admin") {
        if (password == "1234") {
            println("Login success ! ! !")
        } else {
            println("Password is incorrect")
        }
    } else {
        println("Username is incorrect")
    }

    val gender = "female"
    val age = 28
    val isSingle = true
    var isOk = false

    if (gender == "female") {
        if (age in 23..30) {
            if (isSingle)
                isOk = true
        }
    }

    if (isOk) {
        println("We are looking a person like you for this job")
    } else {
        println("Sorry. We need to change your profile later")
    }

    /**
     * If - Condition with Logic Operator
     */
    if (login == "admin" && password == "1234") {
        println("Login success")
    } else {
        println("Login failed")
    }

    /**
     * If - Conditional Expression
     */
    val remain = 1
    val r = if (remain > 0) "Have a stock" else "Out stock"
    println("Result: $r")

    val ext = ".kt"
    println(if (ext == ".java") "Java File" else "Kotlin File")

    val manUGoals = 2
    val liverGoals = 3
    val result = if (manUGoals > liverGoals) {
        "Man United Win ! ! !"
    } else if (manUGoals < liverGoals) {
        "Liverpool Win ! ! !"
    } else {
        "Equal"
    }
    println(result)

    /**
     * When - condition as switch in JAVA
     */
    when (ext) {
        ".kt" -> println("Kotlin File")
        ".java" -> println("Java File")
        else -> println("Unknown")
    }

    val country = "Mexico".toUpperCase()
    println("This $country country")
    when (country) {
        "UK", "USA", "CANADA", "Nz" -> println("Speak: English")
        "SPAIN", "MEXICO", "CUBA", "ARGENTINA" -> println("Speak: Spanish")
        "CHINA", "TAIWAN", "HONG KONG" -> println("Speak: Chinese")
    }


    val date = 1
    val month = 10
    when {
        date == 1 && month == 1 -> println("New year day")
        date == 14 && month == 2 -> println("Valentine day")
        date >= 13 && date <= 15 && month == 3 -> println("Songkran day")
        date == 1 || date == 16 -> println("Rich day")
        else -> ("Normal day")
    }


    val score = 75
    var grade = 'F'
    when (score){
        in 80..100 -> grade = 'A'
        in 79 downTo 60 -> grade = 'B' //79..60
        in 0 until 60 -> grade = 'F' //0..59
        !in 0..100 -> {
            grade = ' '
            println("Score Error")
        }
    }
    println("Score : $score   | Grade : $grade")


    var a:Any = "123.45F"
    var result2:Int
    when (a){
        is String -> result2 = a.toDouble().toInt()
        is Double -> result2 = a.toInt()
        is Float -> result2 = a.toInt()
        else -> result2 = 0
    }
    println(result2)

    val device = "Oppo"
    val os = when (device) {
        "Oppo", "Vivo", "Samsung", "Sony" -> "Android"
        "iPhone" -> "iOS"
        "iPad" -> "iPadOs"
        else -> "Unknown"
    }
    println("Device - $device ---> Operation System - $os")




}

private fun conditionIfFromUDEMY(){
    println()
    println()
    println("========== Udemy course ==========")
    //If expression
    val isMarried = true
    val GPA = 3.8

    val isQualified = if(isMarried && GPA >= 3.8) 1 else 0
    println(isQualified)

    //When expression
    val isGood = when(GPA) {
        4.0 -> true
        else -> false
    }
    println(isGood)
}