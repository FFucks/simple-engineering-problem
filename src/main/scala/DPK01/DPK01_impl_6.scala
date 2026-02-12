package DPK01

import scala.collection.mutable

//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_6 extends App {


    println(revertString("Hello"))

    def revertString(str: String): String = {
        val queue = mutable.Queue[Char]()

        for (char <- str) {
            queue.enqueue(char)
        }

        var result = ""

        while (queue.nonEmpty) {
            result = queue.dequeue() + result
        }
        
        result
    }
}
