package DPK02

import scala.collection.mutable

//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_3 {

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

@main def Dpk02Impl3(): Unit = {

    val dpk02 = new DPK02_impl_3

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}
