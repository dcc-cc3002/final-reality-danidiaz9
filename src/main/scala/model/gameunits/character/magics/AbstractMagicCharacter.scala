package model.gameunits.character.magics

import exceptions.InvalidSpellException
import model.gameunits.GameUnit
import model.gameunits.character.AbstractCharacter
import model.spells.Spell
import model.weapons.Weapon

/** An abstract class representing a magical character in the game.
 *
 *  @constructor Creates a new magical character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the magical character.
 *  @param maxHealthPoints The maximum health points of the magical character.
 *  @param currentHealthPoints The current health points of the magical character.
 *  @param defense The defense points of the magical character.
 *  @param weight The weight of the magical character.
 *  @param maxManaPoints The maximum mana points of the magical character.
 *  @param currentManaPoints The current mana points of the magical character.
 *  @param weapon The weapons equipped by the magical character.
 */

abstract class AbstractMagicCharacter(name: String,
                                      maxHealthPoints: Int,
                                      currentHealthPoints: Int,
                                      defense: Int,
                                      weight: Double,
                                      val maxManaPoints: Int,
                                      var currentManaPoints: Int,
                                      weapon: Option[Weapon])
  extends AbstractCharacter(name,maxHealthPoints, currentHealthPoints, defense, weight, weapon)
    with MagicCharacter {


  /** Returns the current mana points of the magical character.
   *
   *  @return The current mana points of the magical character.
   */
  def getManaPoints: Int = currentManaPoints

  /** Sets the mana points of the magical character to the specified value.
   *
   *  @param x The value to set the mana points to.
   */
  def setManaPoints(x: Int): Unit = {
    currentManaPoints = x
  }

  /** Uses a thunder spell on the specified target.
   *
   *  @param target The game unit to cast the thunder spell on.
   */
  def useSpell(s: Spell, target: GameUnit): Unit = {
    throw new InvalidSpellException("Invalid target.")
  }

}