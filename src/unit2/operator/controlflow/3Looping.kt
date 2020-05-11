package unit2.operator.controlflow

/**
 * This class will show on how to use looping
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args: Array<String>) {
    /**
     * For - in
     */
    for (x in 1..5) {
        println(x)
    }


    println()
    println("=====================")
    val min = 1
    val max = 100
    var count = 0
    for (num in min..max) {
        if (num % 3 == 0)
            count++
    }
    println("Max is $max and Min is $min  ---> Have a amount total of num that modularize 3 : $count")

    println()
    println("=====================")
    for (a in 0 until 50 step 12)
        println(a)


    println()
    println("=====================")
    for (i in 5 downTo 1)
        println(i)


    println()
    println("=====================")
    /**
     * Repeating
     */
    repeat(3) {
        println("Kotlin")
    }


    println()
    println("=====================")
    val base = 10
    val power = 3
    if (power >= 0) {
        var result = 1
        repeat(power) {
            result *= base
        }
        println("$base ^ $power --> Result is $result")
    } else {
        println("Power should be more than zero")
    }


    println()
    println("=====================")
    /**
     * While looping
     */
    var n = 1
    while ((n * n) < 100) {
        n += 1
    }
    println("n = $n") //n = 10

    println()
    println("=====================")
    var validCode = false
    while (validCode == false) {
        print("Please enter your password: ")
        val code = readLine()
        if (code == "1234")
            validCode = true
    }
    println("Login success")


    println()
    println("=====================")
    /**
     * Do - while looping
     */
    do {
        print("Please enter your password: ")
        val code = readLine()
    } while (code != "1234")
    println("Login success")


    println()
    println("=====================")
    /**
     * Complex looping
     */
    var str = ""
    for (i in 1..4) {
        str = ""
        for (j in 1..i) {
            str += "$j "
        }
        println(str)
    }


    println()
    println("=====================")
    var sum = 0
    for (i in 1..10) {
        if (i == 4)
            break
        sum += 1
    }
    println(sum)


    println()
    println("=====================")
    var sum1 = 0
    for (i in 1..10) {
        if (i == 5)
            continue
        sum1 += 1
    }
    println(sum1)


    println()
    println()
    loopingFromUDEMY()

}

/**
 * Knowledge From Udemy
 */
private fun loopingFromUDEMY(){
    println("========== Udemy course ==========")

    //Continue example with For
    println("====== Continue Example =========")
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println("Number is $i")
    }

    //Break example with For
    println("====== Break Example =========")
    for (i in 1..10) {
        if (i == 7) {
            break
        }
        println("Number is $i")
    }


    //Break InnerLoop example with For
    println("====== Break Inner Loop Example =========")
    for (i in 1..4) {
        println("Number is $i")
        for (inner in 1..7) {
            println("Inner loop: $inner")
            if (inner == 2) {
                break
            }
        }
    }

    //Break InnerLoop example with For
    //Break Whole for loop, including break external loop as well
    println("====== Break whole Loop Example =========")
    pearl@ for (i in 1..4) {
        println("Number is $i")
        for (inner in 1..7) {
            println("Inner loop: $inner")
            if (inner == 2) {
                break@pearl
            }
        }
    }

    println()
    println()
    println()

    //======== For example ========
    println("==== 1 Start App ====")
    for (i in 1..5){
        println("Hello World $i") // print 5 time
        //println("Number is $i")
    }

    println("==== 1 End App ====")
    //========================================================


    //========= For example 2 - Use 'step' function ==========
    println("\n==== 2 Start App - Increment ====")
    println("==== Odd Num ====")
    for (i in 1..20 step 2){
        println("Number is $i") //i is 1 3 5 7 ... 15 17 19
    }

    println("\n==== Even Num ====")
    for (i in 0..20 step 2){
        println("Number is $i") //i is 0 2 4 6 ... 16 18 20
    }

    println("==== 2 End App - Increment ====")
    //========================================================


    //======== For example 3 - Use 'downTo' - 'step' function ========
    println("\n==== 3 Start App - Decrement ====")
    for (i in 19 downTo 0 step 2){
        println("Number is $i") //i is 19 17 15 ... 7 5 3 1
    }

    println("==== 3 End App - Decrement ====")
    //========================================================



    println()
    println()

    //While Loop - check code first and run it
    println("====== While Loop example =======")
    var i = 1
    while (i <= 10){
        println("Counter $i")
        i += 1 //Same like : i++
    }

    //Do While - run code first and check after
    println("====== Do While Loop example ========")
    var j = 1
    do{
        println("Counter do while: $j")
        j++
    }while (j <= 10)
}


/**
 * Knowledge From Udemy
 */
private fun nestedLoopingFromUDEMY(){
    println()
    println()
    println("============ Nested For example ===============")
    //Nested For example
    for (i in 1..2) {
        print("Enter your name: ")
        val name = readLine()!!.toString()

        print("Where you live: ")
        val livePlace = readLine()!!.toString()

        //Nested For Loop
        print("How many pet do you have: ")
        var petName: String? = ""
        val petAmount = readLine()!!.toInt()
        for (petID in 1..petAmount) {
            print("Enter Pet $petID: ")
            petName = petName + readLine()!!.toString() + ", "
        }

        //Printing User Information
        println("===== User Info ======")
        println("name: $name")
        println("livePlace: $livePlace")
        println("Pet name: $petName")

        //Check pet name is in 'Car' or Not?
        if(petName!!.contains("Cat")){
            println("We have a program of your Cat")
        }
    }
}