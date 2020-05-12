package unit4.function.lambda


/**
 * Variable (Number of) Argument as known as vararg
 * vararg can use only once in each method
 * vararg can use with another parameters
 * vararg is similar with array
 * ================ Example ==================
 * function(vararg num:Int) <-- Calling --> function(1,2,3,4,5) or function(1,2,3) whatever you want to put
 * val array = arrayOf(1,2,3,4) ---> function(*array) // Need to put * went you want to put array in the function
 *
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
fun main(){
    val sum1 = summation(1,2,3,4,5)         //15
    val sum2 = summation(1)                 //1
    val sum3 = summation(1,2,3)             //6

    val array = intArrayOf(1,2,3,4,5,6)
    val sum4 = summation(*array)                    //21
    val sum5 = summation(*intArrayOf(1,2,3))        //6
}

fun f1(vararg data:Int){}                       //Fine
fun f2(name:String, vararg data:Int){}          //Fine
//fun f3(name:String, vararg data1:Int,vararg  data2:Int){}  //Error Because of only once 'vararg' declaration


fun summation(vararg data:Int):Int{
    var sum = 0
    for(d in data){
        sum += d
    }
    return sum
}