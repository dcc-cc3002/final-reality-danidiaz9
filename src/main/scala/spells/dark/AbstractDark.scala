package spells.dark

import exceptions.InvalidSpellException
import gameunits.character.magics.BlackMage
import spells.AbstractSpell

abstract class AbstractDark extends AbstractSpell {

  override def useByBlackMage(blackMage: BlackMage): Unit = {
    if (getManaCost <= blackMage.getManaPoints) {
      blackMage.setManaPoints(blackMage.getManaPoints - getManaCost)
    }
    else {
      throw new InvalidSpellException("Not enough mana.")
    }
  }

}
