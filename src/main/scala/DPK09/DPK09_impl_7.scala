package DPK09

import scala.collection.mutable

class DPK09_impl_7 {

    def filter[A](list: List[A], func: A => Boolean): List[A] = {
        val queue = mutable.Queue[A]()

        for (element <- list) {
            if (func(element)) {
                queue.enqueue(element)
            }
        }
        queue.toList
    }
}

@main def dpk09Impl7(): Unit = {

    val dpk09 = new DPK09_impl_7

    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 == 0)))
    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 > 0)))
    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 < 0)))

}