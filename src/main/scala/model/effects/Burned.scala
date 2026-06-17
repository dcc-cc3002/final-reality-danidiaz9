package model.effects
import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A class representing the "Burned" effect in the game.
 *
 * The `Burned` class extends `AbstractEffect` and represents an effect that causes
 * a target game unit to receive magic damage and then applies the burned effect.
 */
class Burned extends AbstractEffect {

  /**
   * Applies the burned effect to the target game unit from the specified character.
   *
   * This method causes the target to receive magic damage equal to half the magic
   * attack points of the weapon the character is holding, and then applies the burned effect.
   *
   * @param from The character applying the burned effect.
   * @param target The game unit that the burned effect is applied to.
   */
  override def applyEffect(from: Character, target: GameUnit): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints/2)
    target.appliedEffect(this)
  }

}
