package DPK08

/*DPK08 Map
 Create a function that can map a function execution to each element of a list, return a new list.

map([1,2,3,4,5], (x) => x * 2) -> [2,4,6,8,10]
The map function should recive a collection(list or array) and a function that will be apply to each element of the collection.

Now refactor the code and do not use any prebuild function.*/


object DPK08_impl_1 extends App{

    println(map(List(1, 2, 3, 4, 5), (x => x * 2)))
    println(mapPerformance(List(1, 2, 3, 4, 5), (x => x - 1)))
    println(map(List(2, 4, 6, 8, 10), (x => x / 2)))
    println(map(List(1, 2, 3, 4, 5), (x => x + 2)))
    println(map(List(2, 4, 6, 8, 10), (x => x % 3)))


    def map[A, B](list: List[A], func: A => B): List[B] = {

        var result = List.empty[B]

        for (element <- list) {
            val mappedElement = func.apply(element)
            result = result :+ mappedElement
        }

        result
    }

    def mapPerformance[A, B](list: List[A], func: Function1[A, B]): List[B] = {

        var result = List.empty[B]

        for (element <- list) {
            val mappedElement = func.apply(element)
            result = mappedElement :: result
        }

        result.reverse
    }

}
