package model.gameunits.character.commons

import model.gameunits.character.AbstractCharacter
import model.weapons.Weapon

/** An abstract class representing a common character in the game.
 *
 *  @constructor Creates a new common character with the specified name, health points, defense, weight, and weapon.
 *  @param name The name of the common character.
 *  @param maxHealthPoints The maximum health points of the common character.
 *  @param currentHealthPoints The current health points of the common character.
 *  @param defense The defense points of the common character.
 *  @param weight The weight of the common character.
 *  @param weapon The weapon equipped by the common character, represented as an optional trait weapon.
 */
abstract class AbstractCommonCharacter(name: String,
                                       maxHealthPoints: Int,
                                       currentHealthPoints: Int,
                                       defense: Int,
                                       weight: Double,
                                       weapon: Option[Weapon])
  extends AbstractCharacter(name, maxHealthPoints, currentHealthPoints, defense, weight, weapon)  {


}
