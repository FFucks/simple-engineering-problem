package DPK12

/*DPK12 Sort
    Create a function that can sort a list of numbers.The implementation should be a Bubble Sort(good to learn but terrible to use in production).

   bubble_sort([5, 4, 3, 2, 1] ) ->[1, 2, 3, 4, 5]
The sort function should receive a collection(list or array) and return a new sorted list
.*/

class DPK12_impl_3 {

     def bubble_sort(list: Seq[Int]): List[Int] = {

        val array = list.toArray

        for (iterableList <- 1 until array.length) {
            for (positionCompare <- iterableList to 1 by -1) {
                if (array(positionCompare) < array(positionCompare - 1)) {
                    val aux = array(positionCompare)
                    array(positionCompare) = array(positionCompare - 1)
                    array(positionCompare - 1) = aux
                }
            }
        }

        array.toList
    }

}

@main def dpk12Impl3(): Unit = {
    val arr = Array(10, 9, 8, 7, 6)
    val list = List(5, 4, 3, 2, 1)

    val dpk12 = new DPK12_impl_3

    println(dpk12.bubble_sort(arr))
    println(dpk12.bubble_sort(list))
}
