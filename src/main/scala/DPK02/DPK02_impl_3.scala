package DPK02

import scala.collection.mutable

//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02_impl_3 extends App {

    println(revertList[Int](List(1, 2, 3, 4)))

    def revertList[A](list: List[A]): List[A] = {
        val stack = mutable.Stack[A]()
        var result = List.empty[A]

        for (element <- list) {
            stack.push(element)
        }

        while (stack.nonEmpty) {
            result = result :+ stack.pop()
        }

        result
    }

}
