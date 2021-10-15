/*fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")
    *//*val bintu = SimpleAgent(name = "Bintu")
    println(bintu.act())*//*


}*/
fun main() {
  /*  val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.score)*/


        val env = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
        for (i in 1..100)
            env.step()
        println(env.score)

    println("May the force guide you")

/*    val env = FoodEnvironment(CleverAgent("Charlie"), RandomAgent("Bob", 0.2), SimpleAgent("Alice"))
    for (i in 1..100) {
        env.step()
    }
    println(env.score)*/
}
