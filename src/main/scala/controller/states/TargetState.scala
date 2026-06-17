package controller.states

import controller.GameController

class TargetState(context: GameController) extends GameState(context) {

  override def actionBarState(): Unit = context.state = new ActionBarState(context)

}
