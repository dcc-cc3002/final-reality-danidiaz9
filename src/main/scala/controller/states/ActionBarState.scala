package controller.states

import controller.GameController

class ActionBarState(context: GameController) extends GameState(context) {

  override def turnState(): Unit = context.state = new TurnState(context)

  override def gameOverState(): Unit = context.state = new GameOverState(context)

}
