package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_2 extends App {

    println(revertString("Hello"))

    def revertString(str: String): String = {
        if (str.isEmpty) {
            ""
        } else {
            revertString(str.tail) + str.head
        }
    }

}
