package model.spells

import model.effects.Effect
import model.gameunits.character.magics.{BlackMage, WhiteMage}

/**
 * Trait representing a spell in the game.
 */
trait Spell {

  /**
   * The mana cost required to use the spell.
   */
  val manaCost: Int

  /**
   * The effect of the spell when used.
   */
  val effect: Effect

  /**
   * Returns the mana cost required to use the spell.
   *
   * @return The mana cost of the spell.
   */
  def getManaCost: Int

  /**
   * Uses the spell by a BlackMage character.
   *
   * @param blackMage The BlackMage character using the spell.
   */
  def useByBlackMage(blackMage: BlackMage): Unit

  /**
   * Uses the spell by a WhiteMage character.
   *
   * @param whiteMage The WhiteMage character using the spell.
   */
  def useByWhiteMage(whiteMage: WhiteMage): Unit

}
