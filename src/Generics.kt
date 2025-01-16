fun main() {

    val footballPlayer1 = FootballPlayer("Messi")
    val footballPlayer2 = FootballPlayer("Ronaldo")

    val baseballPlayer1 = BaseballPlayer("Jordan")
    val baseballPlayer2 = BaseballPlayer("Michael")

    val footballTeam = Team("Manchester", mutableListOf(footballPlayer1))
    footballTeam.addPlayers(footballPlayer1)
    footballTeam.addPlayers(footballPlayer2)
    footballTeam.addPlayers(footballPlayer2)

    println("\n")

    val baseballTeam = Team("America", mutableListOf(baseballPlayer1))
    baseballTeam.addPlayers(baseballPlayer1)
    baseballTeam.addPlayers(baseballPlayer2)
    baseballTeam.addPlayers(baseballPlayer2)

}

//here specifying upper bound to the type : T
class Team<T : Player>(val name: String, val players: MutableList<T>) {
    fun addPlayers(player: T) {
        if (players.contains(player)) {
            //word casting used to get player name
            println("Player: ${(player as Player).name} is already in the team ${this.name}")
        } else {
            players.add(player)
            println("Player: ${(player as Player).name} is added to the team ${this.name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)
