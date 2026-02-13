package DPK02

import scala.collection.mutable

//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_5 {

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

@main def Dpk02Impl5(): Unit = {

    val dpk02 = new DPK02_impl_5

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}
