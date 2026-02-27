package DPK12

/*DPK12 Sort
    Create a function that can sort a list of numbers.The implementation should be a Bubble Sort(good to learn but terrible to use in production).

   bubble_sort([5, 4, 3, 2, 1] ) ->[1, 2, 3, 4, 5]
The sort function should receive a collection(list or array) and return a new sorted list
.*/

class DPK12_impl_9 {

    def bubble_sort(list: Seq[Int]): List[Int] = {
        val array = list.toArray

        array.indices.foreach { passNumber =>
            (0 until array.length - passNumber - 1).foreach { index =>
                if (array(index) > array(index + 1)) {
                    val temp = array(index)
                    array(index) = array(index + 1)
                    array(index + 1) = temp
                }
            }
        }

        array.toList
    }
}

@main def dpk12Impl9(): Unit = {
    val arr = Array(10, 9, 8, 7, 6)
    val list = List(5, 4, 3, 2, 1)

    val dpk12 = new DPK12_impl_9

    println(dpk12.bubble_sort(arr))
    println(dpk12.bubble_sort(list))
}