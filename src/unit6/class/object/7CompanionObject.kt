package unit6.`class`.`object`

class Circle5 {
    companion object {
        var PI: Double = 3.14
        fun area(radius: Int) = PI * radius * radius
        fun perimeter(radius: Int) = 2 * PI * radius
    }
}

class Circle6(var radius: Int) {
    var PI: Double = 3.14

    companion object {
        val className: String = "Circle"

        /*
        ======= Cannot call variable property parameter and method outside ===========
        It will show error
        fun area() = PI * radius * radius
        fun perimeter(radius: Int) = 2 * PI * radius
         */
    }

    private fun checkValue(v: Int): Int{
        return if(v > 0) v else 0
    }

    fun getClassName(): String = className //Can call property and method from 'companion object'
}

fun main(){
    val a = Circle5.area(10)
    val b = Circle5.perimeter(20)
    val c = Circle5()
    //val d = c.area(10)  //Error: Because it cannot be called via instance
}