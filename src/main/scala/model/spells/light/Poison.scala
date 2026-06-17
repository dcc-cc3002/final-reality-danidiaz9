package model.spells.light

import model.effects.{Effects, Effect, Poisoned}
import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A class representing a poison spell in the game.
 *
 * Provides functionality to apply a poison effect to a target game unit using mana from the casting character.
 */
class Poison extends AbstractLight {

  /**
   * The mana cost of the poison spell.
   */
  override val manaCost: Int = 30
  /**
   * The effect applied by the poison spell.
   */
  override val effect: Effect = new Effects(List[Poisoned]())

  /**
   * Applies poison to a target game unit.
   *
   * @param target The game unit to be poisoned.
   * @param from The character casting the poison spell.
   */
  def applyPoisonTo(target: GameUnit, from: Character): Unit = {
    effect.applyEffect(from, target)
  }

}
