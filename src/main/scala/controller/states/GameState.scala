package controller.states

import controller.GameController
import exceptions.InvalidTransitionException

class GameState(protected val context: GameController) {

  context.state = this

  def handleInput(context: GameController): Unit = {}

  def update(context: GameController): Unit = {}

  def actionBarState(): Unit =
    throw new InvalidTransitionException("Cannot transition to actionBarState.")

  def turnState(): Unit =
    throw new InvalidTransitionException("Cannot transition to turnState.")

  def enemyActionState(): Unit =
    throw new InvalidTransitionException("Cannot transition to enemyActionState.")

  def playerActionState(): Unit =
    throw new InvalidTransitionException("Cannot transition to playerActionState.")

  def equipWeaponState(): Unit =
    throw new InvalidTransitionException("Cannot transition to equipWeaponState.")

  def selectSpellState(): Unit =
    throw new InvalidTransitionException("Cannot transition to selectSpellState.")

  def targetState(): Unit =
    throw new InvalidTransitionException("Cannot transition to targetState.")

  def gameOverState(): Unit =
    throw new InvalidTransitionException("Cannot transition to gameOverState.")

}
