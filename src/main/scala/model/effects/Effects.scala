package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A class representing a collection of effects that can be applied to game units.
 *
 * The `Effects` class extends `AbstractEffect` and allows for a list of effects
 * to be applied to a target game unit.
 *
 * @param effect A list of effects to be applied.
 */
class Effects(val effect: List[Effect]) extends AbstractEffect {

  /**
   * Applies each effect in the list to the target game unit from the specified character.
   *
   * @param from The character applying the effects.
   * @param target The game unit that the effects are applied to.
   */
  override def applyEffect(from: Character, target: GameUnit): Unit = {
    effect.foreach(e => e.applyEffect(from, target))
  }

}
