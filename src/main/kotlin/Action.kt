open abstract class Action(){
         sealed class Action()
    class processAction(act: Action) : Action()

    fun impl(a:Action, p:Actor){
        when(a){
         is processAction-> p.act()
        }
    }

}
