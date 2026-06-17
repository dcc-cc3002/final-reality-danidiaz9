package controller.states

import controller.GameController

class TurnState(context: GameController) extends GameState(context) {

  override def enemyActionState(): Unit = context.state = new EnemyActionState(context)

  override def playerActionState(): Unit = context.state = new PlayerActionState(context)

}
