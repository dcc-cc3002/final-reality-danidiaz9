package controller.states

import controller.GameController

class PlayerActionState(context: GameController) extends GameState(context) {

  override def targetState(): Unit = context.state = new TurnState(context)

  override def equipWeaponState(): Unit = context.state = new EquipWeaponState(context)

  override def selectSpellState(): Unit = context.state = new SelectSpellState(context)

}
