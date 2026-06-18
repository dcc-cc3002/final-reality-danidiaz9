package weaponry.weapons.commons

import characters.player.TraitPlayer

/** A class representing a bow weapon in the game.
 *
 *  A bow is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Bow with the specified attributes.
 *  @param name The name of the bow.
 *  @param attackPoints The attack points of the bow.
 *  @param weight The weight of the bow.
 *  @param owner The owner of the bow, represented as an optional character.
 */
class Bow (
            name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[TraitPlayer]
          ) extends AbstractCommonW (name, attackPoints, weight, owner) {

}