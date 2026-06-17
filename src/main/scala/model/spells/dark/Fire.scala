package model.spells.dark

import model.effects.{Burned, Effects, Effect}
import model.gameunits.GameUnit
import model.gameunits.character.Character

import util.Random

/**
 * A class representing a Fire spell in the game.
 *
 * The Fire spell inflicts magic damage and has a chance to apply a Burned effect to the target.
 */
class Fire extends AbstractDark {

  /** The mana cost required to cast the Fire spell. */
  override val manaCost: Int = 15
  /** The effect of the Fire spell, which may apply a Burned effect to the target. */
  override val effect: Effect = new Effects(List[Burned]())

  /**
   * Applies the Fire spell to a target GameUnit from a Character.
   *
   * @param target The GameUnit target to apply the spell to.
   * @param from The Character casting the spell.
   */
  def applyFireTo(target: GameUnit, from: Character): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints)
    if (Random.nextDouble < 0.2){
      effect.applyEffect(from, target)
    }

  }

}
