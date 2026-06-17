package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A class representing the "Paralyzed" effect in the game.
 *
 * The `Paralyzed` class extends `AbstractEffect` and represents an effect that
 * paralyzes a target game unit, preventing it from taking actions.
 */
class Paralyzed extends AbstractEffect {

  /**
   * Applies the paralyzed effect to the target game unit from the specified character.
   *
   * This method applies the paralyzed effect to the target game unit, which prevents
   * the target from taking actions.
   *
   * @param from The character applying the paralyzed effect.
   * @param target The game unit that the paralyzed effect is applied to.
   */
  override def applyEffect(from: Character, target: GameUnit): Unit = {
    target.appliedEffect(this)
  }

}
