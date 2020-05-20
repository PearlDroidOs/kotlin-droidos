package unit8.generic.collection

/**
 * Description - Understand on how to use definition of 'in' and 'out' with generic classes and methods
 * 'in'         means only receiving data with type
 * 'out'        means only sending data with type, not including constructor ( Constructor can receive data in and save)
 *
 *
 */
class Data4<in T>(value :T){
    private var v = value as Any

    //Send data out
    //fun type(): T  = v::class.simpleName as T         //Error because of 'in' definition
    //fun value():T = v as T                            //Error because of 'in' definition

    fun setValue(value: T){
        this.v = value as Any
    }

}

class Data5<out T>(value: T){
    private var v = value as Any

    //Send data out
    fun type(): T  = v::class.simpleName as T
    fun value():T = v as T

    //Receive data
    /* //Error because of 'out' definition
    fun setValue(value: T){
        this.v = value as Any
    }
    */
}