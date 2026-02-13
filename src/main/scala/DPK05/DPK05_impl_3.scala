package DPK05

import scala.collection.mutable

class DPK05_impl_3 {

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

        val comparison = getPower(player1).compare(getPower(player2))

        comparison match {
            case 1 =>
                leaderboard(player1) += 10
                leaderboard(player2) -= 5
                player1

            case -1 =>
                leaderboard(player2) += 10
                leaderboard(player1) -= 5
                player2

            case _ =>
                leaderboard(player1) += 5
                leaderboard(player2) += 5
                "Draw"
        }
    }

}

@main def dpk05Impl3(): Unit = {

    val dpk05 = new DPK05_impl_3

    println(dpk05.play("John", "Paul"))
    dpk05.showLeaderboard()

    println(dpk05.play("John", "Ringo"))
    dpk05.showLeaderboard()
}