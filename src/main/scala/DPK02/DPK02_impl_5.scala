package DPK02

import scala.collection.mutable

//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02_impl_5 extends App {

    println(revertList[Int](List(1, 2, 3, 4)))

    def revertList[A](list: List[A]): List[A] = {
        val queue = mutable.Queue[A]()
        var result = List.empty[A]

        list.foreach(queue.enqueue)

        while (queue.nonEmpty) {
            result = queue.dequeue() :: result
        }

        result
    }
}
