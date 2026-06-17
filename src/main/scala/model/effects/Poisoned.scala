package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A class representing the "Poisoned" effect in the game.
 *
 * The `Poisoned` class extends `AbstractEffect` and represents an effect that
 * applies poison damage to a target game unit over time.
 */
class Poisoned extends AbstractEffect {

  /**
   * Applies the poisoned effect to the target game unit from the specified character.
   *
   * This method applies the poisoned effect to the target game unit, dealing a portion
   * of the character's magic attack points as poison damage.
   *
   * @param from The character applying the poisoned effect.
   * @param target The game unit that the poisoned effect is applied to.
   */
  override def applyEffect(from: Character, target: GameUnit): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints/3)
    target.appliedEffect(this)
  }

}
