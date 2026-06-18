package weaponry.weapons.commons

import characters.player.TraitPlayer

/** A class representing a sword weapon in the game.
 *
 *  A sword is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Sword with the specified attributes.
 *  @param name The name of the sword.
 *  @param attackPoints The attack points of the sword.
 *  @param weight The weight of the sword.
 *  @param owner The owner of the sword, represented as an optional character.
 */
class Sword (
            name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[TraitPlayer]
          ) extends AbstractCommonW (name, attackPoints, weight, owner) {

}