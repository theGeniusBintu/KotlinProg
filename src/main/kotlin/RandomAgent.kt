import kotlin.random.Random

class RandomAgent(override val name: String, val prob : Double, vararg ags:Actor ) : Actor {
    val randomAgent : List<Actor> = ags.toList()

    override fun act(): Action {
        val probOfHunt: Double = Random.nextDouble(0.1, 1.0)

        return ForageAction()
    }


    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }

}