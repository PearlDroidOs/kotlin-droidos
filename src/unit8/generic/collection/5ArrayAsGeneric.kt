package unit8.generic.collection

/**
 * Description - Understand on how to create array list with generic type
 */
fun main() {
    val colors: Array<String> = Array<String>(3) { "" }        //("","","")
    val colors2 = Array(3) { "" }                 //("","","")
    val color3: Array<String> = Array(3, { "" })                //("","","")

    val ints = Array(3) { 5 }
    println(ints.joinToString(","))                     //5,5,5

    val bools = Array(4) { false }
    val even = Array(5) { it * 2 }                //it starts at 0,1,2,3,4,...
    println(even.joinToString(","))                     //Then, result shows 0,2,4,6

    val years = Array(3) { it + 2020 }
    println(years.joinToString(","))                   //2020,2021,2022

    val strNull = arrayOfNulls<String>(3)
    println(strNull.joinToString(","))                  //null,null,null

    val int = arrayOfNulls<Int>(7)
    int[0] = 20
    int[1] = 22
    int[3] = 77
    println(int.joinToString(","))                      //20,22,null,77,null,null,null
}