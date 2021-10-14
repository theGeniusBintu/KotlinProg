/*fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")
    *//*val bintu = SimpleAgent(name = "Bintu")
    println(bintu.act())*//*


}*/
fun main() {
    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.score)
}
