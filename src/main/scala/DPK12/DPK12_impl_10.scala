package DPK12

class DPK12_impl_10 {

    def bubble_sort(list: Seq[Int]): List[Int] = {
        val array = list.toArray
        var sorted = false

        while (!sorted) {
            sorted = true
            var index = 0

            while (index < array.length - 1) {
                if (array(index) > array(index + 1)) {
                    val temp = array(index)
                    array(index) = array(index + 1)
                    array(index + 1) = temp

                    sorted = false
                }
                index += 1
            }
        }

        array.toList
    }
}

@main def dpk12Impl10(): Unit = {
    val arr = Array(10, 9, 8, 7, 6)
    val list = List(5, 4, 3, 2, 1)

    val dpk12 = new DPK12_impl_10

    println(dpk12.bubble_sort(arr))
    println(dpk12.bubble_sort(list))
}