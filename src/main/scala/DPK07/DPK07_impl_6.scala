package DPK07

import scala.collection.mutable.ArrayBuffer

/*DPK07 Group By
Create a function that can group a list of numbers by a given number.

group_by([1,2,3,4,5,6,7,8,9,10], 3) -> [[1,2,3], [4,5,6], [7,8,9], [10]]
Please make sure the same function works with strings as well.

group_by(["a","b","c","d","e","f","g","h","i","j"], 3) -> [["a","b","c"], ["d","e","f"], ["g","h","i"], ["j"]]
Can you refactor the code and create your own group by function, do not use any prebuild function.*/

class DPK07_impl_6 {

    def group_by[A](list: List[A], size: Int): List[List[A]] = {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0")
        }

        val result = ArrayBuffer[List[A]]()
        var index = 0

        while (index < list.length) {
            val group = ArrayBuffer[A]()
            var count = 0

            while (count < size && index < list.length) {
                group += list(index)
                index += 1
                count += 1
            }

            result += group.toList
        }

        result.toList
    }
}

@main def dpk07Impl6(): Unit = {

    val dpk07 = new DPK07_impl_6

    println(dpk07.group_by[Int](List(), 2))

    println(dpk07.group_by[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3))
    println(dpk07.group_by[String](List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), 3))

    println(dpk07.group_by[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4))
    println(dpk07.group_by[String](List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), 4))

    println(dpk07.group_by[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
    println(dpk07.group_by[String](List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), 5))

}
