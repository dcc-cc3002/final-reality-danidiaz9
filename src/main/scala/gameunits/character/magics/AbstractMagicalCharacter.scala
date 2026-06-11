package gameunits.character.magics

import gameunits.character.AbstractCharacter
import weapons.Weapon

/** An abstract class representing a magical character in the game.
 *
 *  @constructor Creates a new magical character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the magical character.
 *  @param healthPoints The current health points of the magical character.
 *  @param defense The defense points of the magical character.
 *  @param weight The weight of the magical character.
 *  @param manaPoints The current mana points of the magical character.
 *  @param weapon The weapons equipped by the magical character.
 */

abstract class AbstractMagicalCharacter(name: String,
                                        healthPoints: Int,
                                        defense:Int,
                                        weight: Double,
                                        protected var manaPoints: Int,
                                        weapon: Option[Weapon])
  extends AbstractCharacter(name, healthPoints, defense, weight, weapon) with MagicCharacter {

  def getManaPoints: Int = manaPoints

}