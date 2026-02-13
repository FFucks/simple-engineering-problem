package DPK05

import scala.collection.mutable

class DPK05_impl_10 {

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

        val power = getPower(player1).compare(getPower(player2))

        val points = Map(
            1  -> (10, -5, player1),
            -1 -> (-5, 10, player2),
            0  -> (5, 5, "Draw")
        )

        val (s1, s2, result) = points(power)

        leaderboard(player1) += s1
        leaderboard(player2) += s2

        result
    }
}

@main def dpk05Impl10(): Unit = {

    val dpk05 = new DPK05_impl_10

    println(dpk05.play("John", "Paul"))
    dpk05.showLeaderboard()

    println(dpk05.play("John", "Ringo"))
    dpk05.showLeaderboard()

}
