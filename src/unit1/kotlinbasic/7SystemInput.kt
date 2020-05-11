package unit1.kotlinbasic

import java.util.*

/**
 * This class will be use Scanner, ReadLine to receive input from user
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(args:Array<String>){

    //Same pattern
    print("Enter input from readLine(): ")
    val input = readLine()
    print("Enter input from readLine().toString: ")
    val input2 = readLine().toString()

    println("Input1: $input   |   Input2: $input2")

    val scanner = Scanner(System.`in`)
    val sInput = scanner.next()
    val sInput2 = scanner.nextInt() //Don't put any string. The system will be error -->  'InputMismatchException'

    println("SInput1: $sInput   |   Input2: $sInput2")
}