package DPK16

class DPK16_impl_1

import scala.util.Random
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class Mosquito(var row: Int, var col: Int) {

    def move(): Unit = {
        row = Random.nextInt(100)
        col = Random.nextInt(100)
    }

    override def toString: String = s"Mosquito($row,$col)"
}

class Exterminator(var row: Int, var col: Int) {

    def moveTo(newRow: Int, newCol: Int): Unit = {
        row = newRow
        col = newCol
    }

    override def toString: String = s"Exterminator($row,$col)"
}

class Game {

    val size = 100

    val matrix: Array[Array[String]] =
        Array.fill(size, size)(".")

    val mosquitoes: List[Mosquito] = List.fill(10)(new Mosquito(Random.nextInt(100), Random.nextInt(100)))

    val exterminator = new Exterminator(50, 50)


    def printMatrix(): Unit = {
        matrix.foreach(row => println(row.mkString(" ")))
    }

    def start(): Unit = {

        Future {
            while (true) {
                mosquitoes.foreach(_.move())
                exterminator.moveTo(Random.nextInt(100), Random.nextInt(100))

                println("------ GAME MOSQUITO ------")
                printMatrix()

                Thread.sleep(1000)
            }
        }
    }
}

@main def mosquitoGame(): Unit = {

    val game = new Game()

    game.start()

    Thread.sleep(Long.MaxValue)
}