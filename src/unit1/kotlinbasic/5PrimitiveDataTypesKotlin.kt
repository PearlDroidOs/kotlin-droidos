package unit1.kotlinbasic


/**
 * The class describes about Primitive data type which is divided into 6 groups:
 * - Signed Integral Type
 * - Unsigned Integral Type
 * - Floating Point Type
 * - Boolean Type
 * - Text Type
 * - Other Type
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
class DataTypes() {

    /**
     * ====================================== Signed Integral Type ======================================
     *     Type     |                    Data Range                  |      Size(bit)     |   Last Word
     * ==================================================================================================
     *     Byte     |    -128 to 127                                 |          8         |
     *     Short    |    -32768 to 32767                             |          16        |
     *     Int      |    -2,147,483,648 to 2,147,483,647             |          32        |
     *     Long     |    -9,223,372,036,854,775,808 to               |          64        |       L
     *              |    9,223,372,036,854,775,807                   |
     *
     */
    fun signedIntegralType() {

    }


    /**
     * ===================================== Unsigned Integral Type =====================================
     *     Type     |                    Data Range                  |      Size(bit)     |   Last Word
     * ==================================================================================================
     *     UByte    |    0 to 255                                    |          8         |   u  Or  U
     *     UShort   |    0 to 65535                                  |          16        |   u  Or  U
     *     UInt     |    0 to 4,294,967,295                          |          32        |   u  Or  U
     *     ULong    |    0 to 18,446,744,073,709,551,615             |          64        |   uL Or  UL
     *
     */
    fun unsignedIntegralType(){

    }

    /**
     * ====================================== Floating Point Type =======================================
     *     Type     |                    Data Range                  |      Size(bit)     |   Last Word
     * ==================================================================================================
     *     Float    |    1.4E-45 to 3.4028235E38                     |          32        |   f  Or  F
     *     Double   |    4.9E-324 to 1.7976931348623157E308          |          64        |
     *
     */
    fun floatingPointType(){

    }

    /**
     * ========================================= Boolean Type ===========================================
     *     Type     |                    Data Range                  |      Size(bit)     |   Last Word
     * ==================================================================================================
     *     Boolean  |    Must be possible values: 'true' Or 'false   |          1         |
     *
     */
    fun booleanType(){

    }

    /**
     * ========================================== Text type =============================================
     *     Type     |                    Data Range                  |      Size(bit)     |   Last Word
     * ==================================================================================================
     *     Char     |    Store value only 1 character                |      16            |
     *     String   |    Store value more than 1 characters          |      16 * length   |
     *
     */
    fun textType(){

    }

    /**
     * ========================================= Other Type ===========================================
     *     Type     |                    Data Range                  |      Size(bit)     |   Last Word
     * ==================================================================================================
     *     Any      |  Store any values e.g. int, string, boolean    |                    |
     *
     */
    fun otherType(){

    }
}

fun main(){
    //Testing from knowledge above

    //Try to print min and max Integers
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)

    //Try to print min and max UIntegers
    println(UInt.MIN_VALUE)
    println(UInt.MAX_VALUE)

    //Try to print max ULong
    println(ULong.MAX_VALUE)

    //Try to print min and max Float
    println(Float.MIN_VALUE)
    println(Float.MAX_VALUE)

}