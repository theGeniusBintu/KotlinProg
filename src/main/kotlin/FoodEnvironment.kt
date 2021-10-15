import kotlin.random.Random as RNG

class FoodEnvironment(vararg  ags : Actor ) : Environment(*ags) {

    override fun step() {
        super.step()
    }
    override fun processAction(agent: Actor, act: Action) {
     // if (act is ForageAction){
        //  score.put(agent,score.getValue(agent)+1)
        when(act){
            is ForageAction -> score.put(agent,score.getValue(agent)+1)
        }



      }


    override fun sense(agent: Actor) {
        var animal : String?

        val probOfHunt  : Double = RNG.nextDouble(0.1, 1.0)
        if (probOfHunt in 0.0..0.5){
         animal = null
        }else{
            animal = "Elephant"
        }



    }


    val score : MutableMap<Actor, Int> = mutableMapOf()
    init {
        score.put(ags[0],0)

    }



  /*  typealias MyHandler = (Int, String, Any) -> Unit

    typealias Predicate<T> = (T) -> Boolean


Override processAction to match on the type of its act parameter. (Hint: "is TypeName ->")
If the agent has performed a ForageAction, increase their score by one. (Hint: look at the API of MutableMap)
        */


}

//typealias processAction = (Actor, Action) -> Action