package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A trait representing an effect that can be applied to game units.
 *
 * The `Effect` trait defines a single method to apply the effect from a character to a target game unit.
 */
trait Effect {

  /**
   * Applies the effect from the specified character to the target game unit.
   *
   * @param from The character applying the effect.
   * @param target The game unit that the effect is applied to.
   */
  def applyEffect(from: Character, target: GameUnit): Unit

}
