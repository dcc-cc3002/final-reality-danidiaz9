package model.spells.light

import exceptions.InvalidSpellException
import model.gameunits.character.magics.WhiteMage
import model.spells.AbstractSpell

/**
 * An abstract class representing a light spell in the game.
 *
 * Provides functionality to be used by a WhiteMage character, deducting mana points if sufficient and throwing
 * an InvalidSpellException otherwise.
 */
abstract class AbstractLight extends AbstractSpell {

  /**
   * Uses the spell by a WhiteMage character.
   *
   * @param whiteMage The WhiteMage character using the spell.
   * @throws InvalidSpellException If the WhiteMage does not have enough mana to use the spell.
   */
  override def useByWhiteMage(whiteMage: WhiteMage): Unit = {
    if (getManaCost <= whiteMage.getManaPoints) {
      whiteMage.setManaPoints(whiteMage.getManaPoints - getManaCost)
    }
    else {
      throw new InvalidSpellException("Not enough mana.")
    }
  }

}
