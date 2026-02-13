package DPK01

import scala.collection.mutable

//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_6 {

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

@main def Dpk01Impl6(): Unit = {

    val dpk01 = new DPK01_impl_6

    println(dpk01.revertString("Hello"))
}
