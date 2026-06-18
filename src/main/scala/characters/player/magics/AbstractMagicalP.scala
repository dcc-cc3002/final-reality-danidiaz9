package characters.player.magics

import characters.player.AbstractPlayer
import weaponry.TraitWeaponry

/** An abstract class representing a magical character in the game.
 *
 *  @constructor Creates a new magical character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the magical character.
 *  @param healthPoints The current health points of the magical character.
 *  @param defense The defense points of the magical character.
 *  @param weight The weight of the magical character.
 *  @param manaPoints The current mana points of the magical character.
 *  @param weapon The weapon equipped by the magical character.
 */

abstract class AbstractMagicalP(name: String,
                                healthPoints: Int,
                                defense:Int,
                                weight: Double,
                                protected var manaPoints: Int,
                                weapon: Option[TraitWeaponry])
  extends AbstractPlayer(name, healthPoints, defense, weight, weapon) {

  def getManaPoints: Int = manaPoints

}