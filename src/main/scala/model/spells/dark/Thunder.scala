package model.spells.dark

import model.effects.{Effects, Effect, Paralyzed}
import model.gameunits.GameUnit
import model.gameunits.character.Character

import scala.util.Random

/**
 * A class representing a Thunder spell in the game.
 *
 * The Thunder spell inflicts magic damage and has a chance to apply a Paralyzed effect to the target.
 */
class Thunder extends AbstractDark {

  /** The mana cost required to cast the Thunder spell. */
  override val manaCost: Int = 20
  /** The effect of the Thunder spell, which may apply a Paralyzed effect to the target. */
  override val effect: Effect = new Effects(List[Paralyzed]())

  /**
   * Applies the Thunder spell to a target GameUnit from a Character.
   *
   * @param target The GameUnit target to apply the spell to.
   * @param from The Character casting the spell.
   */
  def applyThunderTo(target: GameUnit, from: Character): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints)
    if (Random.nextDouble < 0.3){
      effect.applyEffect(from, target)
    }

  }

}
