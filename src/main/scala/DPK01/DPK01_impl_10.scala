package DPK01

//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_10 extends App {

    println(revertString("Hello"))

    def revertString(str: String): String = {
        var result = ""
        var index = str.length - 1

        while (index >= 0) {
            result += str(index)
            index -= 1
        }

        result
    }

}
