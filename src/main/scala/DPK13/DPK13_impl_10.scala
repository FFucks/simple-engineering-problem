package DPK13

class DPK13_impl_10 {

    def fizzBuzz(numbers: Int): List[Int | String] = {
        var result = List.empty[Int | String]
        var index = 1

        while (index <= numbers) {
            if (index % 15 == 0) {
                result = result :+ "FizzBuzz"
            } else if (index % 3 == 0) {
                result = result :+ "Fizz"
            } else if (index % 5 == 0) {
                result = result :+ "Buzz"
            } else {
                result = result :+ index
            }
            index += 1
        }

        result
    }
}

@main def dpk13Impl10(): Unit = {

    val dpk13 = new DPK13_impl_10

    println(dpk13.fizzBuzz(100))
    println(dpk13.fizzBuzz(10))
    println(dpk13.fizzBuzz(15))
}