package model.spells

import exceptions.InvalidSpellException
import model.effects.Effect
import model.gameunits.character.magics.{BlackMage, WhiteMage}

/**
 * An abstract class representing a spell in the game.
 */
abstract class AbstractSpell extends Spell {

  /** The mana cost required to use the spell. */
  val manaCost: Int = 0

  /** The effect of the spell when used. */
  val effect: Effect = null

  /**
   * Returns the mana cost required to use the spell.
   *
   * @return The mana cost of the spell.
   */
  def getManaCost: Int = manaCost

  /**
   * Throws an InvalidSpellException indicating the spell is not available for BlackMage characters.
   *
   * @param blackMage The BlackMage character attempting to use the spell.
   * @throws InvalidSpellException If the spell is not available.
   */
  def useByBlackMage(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Spell not available.")

  /**
   * Throws an InvalidSpellException indicating the spell is not available for WhiteMage characters.
   *
   * @param whiteMage The WhiteMage character attempting to use the spell.
   * @throws InvalidSpellException If the spell is not available.
   */
  def useByWhiteMage(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Spell not available.")

}
