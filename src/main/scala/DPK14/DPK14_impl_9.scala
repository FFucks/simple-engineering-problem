package DPK14

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

class DPK14_impl_9 {

    private def getOpponent(grid: Array[Array[String]], row: Int, col: Int): Option[String] = {
        if (grid(row)(col) != "") {
            Some(grid(row)(col))
        } else
            None
    }

    def move(grid: Array[Array[String]], position: (Int, Int), moves: List[String]): List[String] = {
        var beaten = List.empty[String]
        var row = position._1
        var col = position._2
        val fighter = grid(row)(col)

        for (move <- moves) {
            grid(row)(col) = ""

            if (move == "up") {
                row = (row - 1 + grid.length) % grid.length
            } else if (move == "down") {
                row = (row + 1) % grid.length
            } else if (move == "left") {
                col = (col - 1 + grid(row).length) % grid(row).length
            } else if (move == "right") {
                col = (col + 1) % grid(row).length
            }

            getOpponent(grid, row, col).foreach(opponent => beaten = beaten :+ opponent)

            grid(row)(col) = fighter
        }

        beaten
    }
}

@main def Dpk14Impl9(): Unit = {

    val dpk14 = new DPK14_impl_9

    val grid: Array[Array[String]] = Array(
        Array("Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"),
        Array("Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison")
    )

    val position = (0, 0)

    val moves: List[String] = List("up", "left", "down", "right")

    println(dpk14.move(grid, position, moves))
}