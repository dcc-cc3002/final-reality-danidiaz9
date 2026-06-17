package spells

import exceptions.InvalidSpellException
import gameunits.character.magics.{BlackMage, WhiteMage}

abstract class AbstractSpell extends Spell {

  val manaCost: Int = 0

  def getManaCost: Int = manaCost

  def useByBlackMage(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Spell not available.")

  def useByWhiteMage(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Spell not available.")


}
