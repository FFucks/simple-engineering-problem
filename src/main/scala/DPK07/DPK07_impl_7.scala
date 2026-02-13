package DPK07

import scala.collection.mutable

/*DPK07 Group By
Create a function that can group a list of numbers by a given number.

group_by([1,2,3,4,5,6,7,8,9,10], 3) -> [[1,2,3], [4,5,6], [7,8,9], [10]]
Please make sure the same function works with strings as well.

group_by(["a","b","c","d","e","f","g","h","i","j"], 3) -> [["a","b","c"], ["d","e","f"], ["g","h","i"], ["j"]]
Can you refactor the code and create your own group by function, do not use any prebuild function.*/

class DPK07_impl_7 {

    def group_by[A](list: List[A], size: Int): List[List[A]] = {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0")
        }

        val queue = mutable.Queue[A](list: _*)
        var result = List.empty[List[A]]

        while (queue.nonEmpty) {
            var group = List.empty[A]
            var count = 0

            while (count < size && queue.nonEmpty) {
                group = group :+ queue.dequeue()
                count += 1
            }

            result = result :+ group
        }

        result
    }
}

@main def dpk07Impl7(): Unit = {

    val dpk07 = new DPK07_impl_7

    println(dpk07.group_by[Int](List(), 2))

    println(dpk07.group_by[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3))
    println(dpk07.group_by[String](List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), 3))

    println(dpk07.group_by[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4))
    println(dpk07.group_by[String](List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), 4))

    println(dpk07.group_by[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
    println(dpk07.group_by[String](List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), 5))

}
