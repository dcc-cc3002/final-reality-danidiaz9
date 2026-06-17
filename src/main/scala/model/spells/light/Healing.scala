package model.spells.light

import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A class representing a healing spell in the game.
 *
 * Provides functionality to heal a target game unit using mana from the casting character.
 */
class Healing extends AbstractLight {

  /**
   * The mana cost of the healing spell.
   */
  override val manaCost: Int = 15

  /**
   * Applies healing to a target game unit.
   *
   * @param target The game unit to be healed.
   * @param from The character casting the healing spell.
   */
  def applyHealingTo(target: GameUnit, from: Character): Unit = {
    target.receiveHealing()
  }

}
