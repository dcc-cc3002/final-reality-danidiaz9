package spells.light

import exceptions.InvalidSpellException
import gameunits.character.magics.WhiteMage
import spells.AbstractSpell

abstract class AbstractLight extends AbstractSpell {

  override def useByWhiteMage(whiteMage: WhiteMage): Unit = {
    if (getManaCost <= whiteMage.getManaPoints) {
      whiteMage.setManaPoints(whiteMage.getManaPoints - getManaCost)
    }
    else {
      throw new InvalidSpellException("Not enough mana.")
    }
  }

}
