package DPK05

import scala.collection.mutable

class DPK05_impl_4 {

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
        val power1 = getPower(player1)
        val power2 = getPower(player2)

        if (power1 > power2) {
            player1
        } else if (power2 > power1) {
            player2
        } else {
            "Draw"
        }
    }

    def play(player1: String, player2: String): String = {

        val result = stronger(player1, player2)

        val scoreMap = Map(
            player1 -> (10, -5),
            player2 -> (-5, 10),
            "Draw" -> (5, 5)
        )

        val (s1, s2) = scoreMap(result)

        leaderboard(player1) += s1
        leaderboard(player2) += s2

        result
    }

}

@main def dpk05Impl4(): Unit = {

    val dpk05 = new DPK05_impl_4

    println(dpk05.play("John", "Paul"))
    dpk05.showLeaderboard()

    println(dpk05.play("John", "Ringo"))
    dpk05.showLeaderboard()

}