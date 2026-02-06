package DPK07


/*DPK07 Group By
Create a function that can group a list of numbers by a given number.

group_by([1,2,3,4,5,6,7,8,9,10], 3) -> [[1,2,3], [4,5,6], [7,8,9], [10]]
Please make sure the same function works with strings as well.

group_by(["a","b","c","d","e","f","g","h","i","j"], 3) -> [["a","b","c"], ["d","e","f"], ["g","h","i"], ["j"]]
Can you refactor the code and create your own group by function, do not use any prebuild function.*/


object DPK07_impl_1 extends App {


    println(group_by[Int](List(1,2,3,4,5,6,7,8,9,10), 3))
    println(group_by[String](List("a","b","c","d","e","f","g","h","i","j"), 3))

    println(group_by_better_performance[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3))
    println(group_by_better_performance(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), 3))


    def group_by[A](list: List[A], size: Int): List[List[A]] = {

        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0")
        }

        var result = List.empty[List[A]]
        var currentGroup = List.empty[A]
        var count = 0

        for (element <- list) {
            currentGroup = currentGroup :+ element
            count += 1

            if (count == size) {
                result = result :+ currentGroup
                currentGroup = List.empty[A]
                count = 0
            }
        }

        if (currentGroup.nonEmpty) {
            result = result :+ currentGroup
        }
        result
    }

    def group_by_better_performance[A](list: List[A], size: Int): List[List[A]] = {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0")
        }

        var result = List.empty[List[A]]
        var currentGroup = List.empty[A]
        var count = 0

        for (element <- list) {
            currentGroup = element :: currentGroup
            count += 1

            if (count == size) {
                result = currentGroup.reverse :: result
                currentGroup = List.empty[A]
                count = 0
            }
        }

        if (currentGroup.nonEmpty) {
            result = currentGroup.reverse :: result
        }

        result.reverse
    }

}
