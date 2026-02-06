package DPK01

//DPK01 Revert String
//Create a function that can revert a string.


object DPK01_impl_1 extends App {

    println(revertString("Hello"))

    def revertString(str: String): String = {
        var result = ""

        for (s <- str) {
            result = s + result
        }
        result
    }

}
