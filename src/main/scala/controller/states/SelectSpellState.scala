package controller.states

import controller.GameController

class SelectSpellState(context: GameController) extends GameState(context) {

  override def playerActionState(): Unit = context.state = new PlayerActionState(context)

  override def targetState(): Unit = context.state = new TargetState(context)

}
