package controller.states

import controller.GameController

class EquipWeaponState(context: GameController) extends GameState(context) {

  override def equipWeaponState(): Unit = context.state = new EquipWeaponState(context)

  override def playerActionState(): Unit = context.state = new PlayerActionState(context)

}
