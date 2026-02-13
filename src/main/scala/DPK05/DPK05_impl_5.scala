package DPK05

import scala.collection.mutable

class DPK05_impl_5 {

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

        val difference = getPower(player1) - getPower(player2)

        val result =
            if (difference > 0) {
                player1
            } else if (difference < 0) {
                player2
            } else {
                "Draw"
            }

        val (s1, s2) =
            if (difference > 0) {
                (10, -5)
            } else if (difference < 0) {
                (-5, 10)
            } else {
                (5, 5)
            }

        leaderboard(player1) += s1
        leaderboard(player2) += s2

        result
    }
}

@main def dpk05Impl5(): Unit = {

    val dpk05 = new DPK05_impl_5

    println(dpk05.play("John", "Paul"))
    dpk05.showLeaderboard()

    println(dpk05.play("John", "Ringo"))
    dpk05.showLeaderboard()

}
