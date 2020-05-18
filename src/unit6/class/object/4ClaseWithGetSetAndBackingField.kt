package unit6.`class`.`object`

import java.text.DecimalFormat

/**
 * =========== Get/Set And Backing Field =================
 * set{}        : for receiving a value from outside class
 * get{}        : for sending a value from inside the class to outside
 *
 * CREATED BY Pearl DroidOs
 * REFERENCE FORM Hyperskill | พัฒนา ​Mobile App บน ระบบ Android ด้วย Kotlin | Udemy course
 */
class BankAccount {
    val accountName: String = "Peter Plan"
    val accountNumber: String = "023-3456-4563-2045"

    /**
     * We can only declare Get or Set in each property
     * Use 'Compute Property' to link with another property
     */
    var balance: Double = 0.0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    val formatBalance: String
        get() {
            val f = DecimalFormat("#,###.00")
            return f.format(balance)
        }

    var atmCode: String = "123456"
        set(value) {
            if (value.trim().length == 6) {
                field = if (value.toIntOrNull() != null) value else field
            }
        }

    /**
     * If we want to use both of Get and Set in a property
     * 'Backing Field' will be come a solution -> Using keyword 'field' into Get and Set
     */
    var depositType: String = "Saving"
        get() = field
        set(value) {
            val listOfType = arrayOf("Saving", "Fixed", "Current")
            if(listOfType.indexOf(value) != -1){
                field = value
            }
        }
}

/**
 * Calling a class and using get set
 */
fun main(){
    val bankAccount = BankAccount()
    bankAccount.balance = 12456.0                       //Set balance value
    println("Balance : ${bankAccount.formatBalance}")   //Get balance value by formatBalance

    //Test atmCode setting
    bankAccount.atmCode = "1"
    //123456 - Don't change anything because the new value length is not equal 6
    println("1 ATM code : ${bankAccount.atmCode}")


    bankAccount.atmCode = "3434562"
    //123456 - Don't change anything because the new value length is not equal 6
    println("2 ATM code : ${bankAccount.atmCode}")

    bankAccount.atmCode = "789456"
    println("3 ATM code : ${bankAccount.atmCode}")      //789456


    println("1 Deposit type : ${bankAccount.depositType}")      //Print default deposit type
    bankAccount.depositType = "Current"                         //Set new deposit type
    println("2 Deposit type : ${bankAccount.depositType}")      //Deposit type : Current

    bankAccount.depositType = "Go Shopping"                     //Set wrong deposit type
    println("2 Deposit type : ${bankAccount.depositType}")      //Deposit type : Current

}