package model.spells.dark

import exceptions.InvalidSpellException
import model.gameunits.character.magics.BlackMage
import model.spells.AbstractSpell

/**
 * An abstract class representing a dark spell in the game.
 *
 * Dark spells typically consume mana from BlackMage characters.
 */
abstract class AbstractDark extends AbstractSpell {

  /**
   * Uses the dark spell by deducting mana from the BlackMage character.
   *
   * @param blackMage The BlackMage character using the spell.
   * @throws InvalidSpellException If the BlackMage character does not have enough mana to use the spell.
   */
  override def useByBlackMage(blackMage: BlackMage): Unit = {
    if (getManaCost <= blackMage.getManaPoints) {
      blackMage.setManaPoints(blackMage.getManaPoints - getManaCost)
    }
    else {
      throw new InvalidSpellException("Not enough mana.")
    }
  }

}
