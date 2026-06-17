package controller.states

import controller.GameController

class EnemyActionState(context: GameController) extends GameState(context) {

  override def enemyActionState(): Unit = context.state = new EnemyActionState(context)

  override def targetState(): Unit = context.state = new TargetState(context)

}
