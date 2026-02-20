package DPK10

import scala.collection.mutable.ListBuffer

/*
DPK10 Reduce
    Create a function that can reduce a list to a single value
.

reduce([1, 2, 3, 4, 5], (acc, x) => acc + x, 0) -> 15
The reduce function should recive a collection(list or array),
a function that will be apply to each element of the collection and an initial value.

Now refactor the code and do not use any prebuild function.
*/

class DPK10_impl_7 {

    def reduce[A](list: Seq[A], func: (A, A) => A, initialValue: A): A = {
        val buffer = ListBuffer[A]()
        buffer ++= list

        var result = initialValue

        for (element <- buffer) {
            result = func(result, element)
        }

        result
    }

}

@main def dpk10Impl7(): Unit = {

    val dpk10 = new DPK10_impl_7

    println(dpk10.reduce(List(1, 2, 3, 4, 5), (acc, x) => acc + x, 0)) //15
    println(dpk10.reduce(Array(1, 2, 3, 4, 5), (acc, x) => acc + x, 0)) //15

    println(dpk10.reduce(List(3, 5, 7, 9, 11), (acc, x) => acc + x, 1)) //36
    println(dpk10.reduce(Array(2, 4, 6, 8, 10), (acc, x) => acc + x, 4)) //34

    println(dpk10.reduce(List(3, 5, 7, 9, 11), (acc, x) => acc - x, 5)) //-30
    println(dpk10.reduce(Array(2, 4, 6, 8, 10), (acc, x) => acc - x, 7)) //-23
}