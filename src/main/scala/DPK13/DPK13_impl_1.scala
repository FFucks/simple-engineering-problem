package DPK13

/*DPK13 FizzBuzz
Create a function that can return a list of numbers from 1 to 100. For multiples of three return “Fizz” instead of the number and
for the multiples of five return “Buzz ”.For numbers which are multiples of both three and five return “FizzBuzz”.
fizzbuzz() -> [1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz","Buzz",11,"Fizz",13,14,"FizzBuzz",16,17,"Fizz",19,"Buzz","Fizz",22,23,"Fizz","Buzz",26,"Fizz",28,29,"FizzBuzz",31,32,"Fizz",34,"Buzz","Fizz",37,38,"Fizz","Buzz",41,"Fizz",43,44,"FizzBuzz",46,47,"Fizz",49,"Buzz","Fizz",52,53,"Fizz","Buzz",56,"Fizz",58,59,"FizzBuzz",61,62,"Fizz",64,"Buzz","Fizz",67,68,"Fizz","Buzz",71,"Fizz",73,74,"FizzBuzz",76,77,"Fizz",79,"Buzz","Fizz",82,83,"Fizz","Buzz",86,"Fizz",88,89,"FizzBuzz",91,92,"Fizz",94,"Buzz","Fizz",97,98,"Fizz","Buzz"]
Refactor the code to receive by parameter how many numbers you want to generate.
fizzbuzz(10) -> [1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz","Buzz"]

*/

class DPK13_impl_1 {

    def fizzBuzz(numbers: Int): List[Int | String] = {
        var result = List.empty[Int | String]

        for (element <- 1 to numbers) {
            if (element % 15 == 0) {
                result = result :+ "FizzBuzz"
            } else if (element % 3 == 0) {
                result = result :+ "Fizz"
            } else if (element % 5 == 0) {
                result = result :+ "Buzz"
            } else {
                result = result :+ element
            }

        }

        result;
    }
}

@main def dpk13Impl1(): Unit = {

    val dpk13 = new DPK13_impl_1

    println(dpk13.fizzBuzz(100))
    println(dpk13.fizzBuzz(10))
    println(dpk13.fizzBuzz(15))
}