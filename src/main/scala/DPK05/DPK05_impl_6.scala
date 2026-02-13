package DPK05

import scala.collection.mutable

class DPK05_impl_6 {

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

    def play(player1: String, player2: String): String = {

        val (s1, s2, result) =
            getPower(player1).compare(getPower(player2)) match {
                case 1 => (10, -5, player1)
                case -1 => (-5, 10, player2)
                case 0 => (5, 5, "Draw")
            }

        leaderboard(player1) += s1
        leaderboard(player2) += s2

        result
    }

}

@main def dpk05Impl6(): Unit = {

    val dpk05 = new DPK05_impl_6

    println(dpk05.play("John", "Paul"))
    dpk05.showLeaderboard()

    println(dpk05.play("John", "Ringo"))
    dpk05.showLeaderboard()

}