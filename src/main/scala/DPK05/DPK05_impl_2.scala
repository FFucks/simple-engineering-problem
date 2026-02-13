package DPK05

import scala.collection.mutable

class DPK05_impl_2 {

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

        power1.compare(power2) match {
            case 1 => player1
            case -1 => player2
            case 0 => "Draw"
        }
    }

    def play(player1: String, player2: String): String = {

        stronger(player1, player2) match {
            case winner if winner == player1 =>
                leaderboard(player1) += 10
                leaderboard(player2) -= 5
                winner

            case winner if winner == player2 =>
                leaderboard(player2) += 10
                leaderboard(player1) -= 5
                winner

            case _ =>
                leaderboard(player1) += 5
                leaderboard(player2) += 5
                "Draw"
        }
    }

}

@main def dpk05Impl2(): Unit = {

    val dpk05 = new DPK05_impl_2

    println(dpk05.play("John", "Paul"))
    dpk05.showLeaderboard()

    println(dpk05.play("John", "Ringo"))
    dpk05.showLeaderboard()
}