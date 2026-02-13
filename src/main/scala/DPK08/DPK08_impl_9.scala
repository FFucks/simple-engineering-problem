package DPK08

import scala.collection.mutable.ListBuffer

/*DPK08 Map
 Create a function that can map a function execution to each element of a list, return a new list.

map([1,2,3,4,5], (x) => x * 2) -> [2,4,6,8,10]
The map function should recive a collection(list or array) and a function that will be apply to each element of the collection.

Now refactor the code and do not use any prebuild function.*/

class DPK08_impl_9 {

    def map[A, B](list: List[A], func: A => B): List[B] = {
        val buffer = ListBuffer[B]()
        var current = list

        while (current.nonEmpty) {
            buffer += func(current.head)
            current = current.tail
        }

        buffer.toList
    }
}

@main def dpk08Impl9(): Unit = {

    val dpk08 = new DPK08_impl_9

    println(dpk08.map(List(1, 2, 3, 4, 5), (x => x * 2)))
    println(dpk08.map(List(1, 2, 3, 4, 5), (x => x - 1)))
    println(dpk08.map(List(2, 4, 6, 8, 10), (x => x / 2)))
    println(dpk08.map(List(1, 2, 3, 4, 5), (x => x + 2)))
    println(dpk08.map(List(2, 4, 6, 8, 10), (x => x % 3)))
}