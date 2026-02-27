package DPK14

import scala.collection.mutable
/*
Create a function that can move a fighter in a 2D grid. The grid should be a 2D array.
grid = [
  ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
  ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
]
The moves should be:
up
down
left
right
The function should receive the grid, the initial position of the fighter and a list of moves.
move(grid, [0,0], ["up", "left", "down", "right"])
Every time a player move to a new position, the old position should be empty.
move(grid, [0,0], ["up"]) ->
      ["", "E.Honda", "Blanka", "Guile", "Balrog", "Vega",
      "Ryu", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
What the function needs to return is a list with the name of all players was beaten, therefore removed from the grid.
move(grid, [0,0], ["up", "left", "down", "right"]) -> ["ken", "M.Bison", "Vega"]

*/

class DPK14_impl_4 {
    def move(grid: Array[Array[String]], position: (Int, Int), moves: List[String]): List[String] = {
        val stack = mutable.Stack[String]()
        stack.pushAll(moves.reverse)

        var beaten = List.empty[String]
        var row = position._1
        var col = position._2
        val fighter = grid(row)(col)

        while (stack.nonEmpty) {
            val move = stack.pop()
            grid(row)(col) = ""

            move match {
                case "up" => row = (row - 1 + grid.length) % grid.length
                case "down" => row = (row + 1) % grid.length
                case "left" => col = (col - 1 + grid(row).length) % grid(row).length
                case "right" => col = (col + 1) % grid(row).length
                case _ => ()
            }

            val opponent = grid(row)(col)
            if (opponent != "") beaten = beaten :+ opponent

            grid(row)(col) = fighter
        }

        beaten
    }
}

@main def Dpk14Impl4(): Unit = {

    val dpk14 = new DPK14_impl_4

    val grid: Array[Array[String]] = Array(
        Array("Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"),
        Array("Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison")
    )

    val position = (0, 0)

    val moves: List[String] = List("up", "left", "down", "right")

    println(dpk14.move(grid, position, moves))
}
