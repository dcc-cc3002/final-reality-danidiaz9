package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * An abstract class representing a general effect that can be applied to game units.
 *
 * The `AbstractEffect` class provides a concrete implementation of the `applyEffect` method
 * from the `Effect` trait, applying the effect to the target game unit.
 */
abstract class AbstractEffect extends Effect {

  /**
   * Applies this effect from the specified character to the target game unit.
   *
   * @param from The character applying the effect.
   * @param target The game unit that the effect is applied to.
   */
  def applyEffect(from: Character, target: GameUnit): Unit = {
    target.appliedEffect(this)
  }

}
