package DPK05

import scala.collection.mutable

class DPK05_impl_8 {

    private val power = Map(
        "John" -> 100,
        "Paul" -> 90,
        "George" -> 80,
        "Ringo" -> 70
    )

    private val leaderboard = mutable.HashMap(
        "John" -> 0,
        "Paul" -> 0,
        "George" -> 0,
        "Ringo" -> 0
    )

    def showLeaderboard(): Unit = {
        println(leaderboard)
    }

    def getPower(name: String): Int = {
        power.getOrElse(name, 0)
    }

    def stronger(player1: String, player2: String): String = {

        val difference = getPower(player1) - getPower(player2)

        difference.sign match {
            case 1  => player1
            case -1 => player2
            case 0  => "Draw"
        }
    }

    def play(player1: String, player2: String): String = {

        val result = stronger(player1, player2)

        val (s1, s2) = result match {
            case `player1` => (10, -5)
            case `player2` => (-5, 10)
            case _ => (5, 5)
        }

        leaderboard(player1) += s1
        leaderboard(player2) += s2

        result
    }
}

@main def dpk05Impl8(): Unit = {

    val dpk05 = new DPK05_impl_8

    println(dpk05.play("John", "Paul"))
    dpk05.showLeaderboard()

    println(dpk05.play("John", "Ringo"))
    dpk05.showLeaderboard()

}
