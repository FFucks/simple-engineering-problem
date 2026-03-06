package DPK16

import scala.util.Random

class DPK16_impl_1

class Mosquito(var row: Int, var col: Int) {

    def move(): Unit = {
        row = Random.nextInt(100)
        col = Random.nextInt(100)
    }
}

class Exterminator(var row: Int, var col: Int) {

    def moveTo(newRow: Int, newCol: Int) = {
        row = newRow
        col = newCol
    }
}

class Game() {

}