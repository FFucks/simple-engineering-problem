package DPK12

/*DPK12 Sort
    Create a function that can sort a list of numbers.The implementation should be a Bubble Sort(good to learn but terrible to use in production).

   bubble_sort([5, 4, 3, 2, 1] ) ->[1, 2, 3, 4, 5]
The sort function should receive a collection(list or array) and return a new sorted list
.*/

class DPK12_impl_7 {

    def bubble_sort(list: Seq[Int]): List[Int] = {
        val array = list.toArray

        for (passNumber <- array.indices) {
            for (currentIndex <- array.indices.dropRight(passNumber + 1)) {
                if (array(currentIndex) > array(currentIndex + 1)) {
                    val temp = array(currentIndex)
                    array(currentIndex) = array(currentIndex + 1)
                    array(currentIndex + 1) = temp
                }
            }
        }

        array.toList
    }
}

@main def dpk12Impl7(): Unit = {
    val arr = Array(10, 9, 8, 7, 6)
    val list = List(5, 4, 3, 2, 1)

    val dpk12 = new DPK12_impl_7

    println(dpk12.bubble_sort(arr))
    println(dpk12.bubble_sort(list))
}