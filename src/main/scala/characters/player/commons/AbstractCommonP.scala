package characters.player.commons

import characters.player.AbstractPlayer
import weaponry.TraitWeaponry

/** An abstract class representing a common player character in the game.
 *
 *  @constructor Creates a new common player character with the specified name, health points, defense, and weight.
 *  @param name The name of the common player character.
 *  @param healthPoints The current health points of the common player character.
 *  @param defense The defense points of the common player character.
 *  @param weight The weight of the common player character.
 *  @param weapon The weapon equipped by the common player character.
 */
abstract class AbstractCommonP(name: String,
                               healthPoints: Int,
                               defense: Int,
                               weight: Double,
                               weapon: Option[TraitWeaponry])
  extends AbstractPlayer(name, healthPoints, defense, weight, weapon)  {


}
