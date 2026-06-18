package weaponry.weapons.commons

import characters.player.TraitPlayer

/** A class representing an axe weapon in the game.
 *
 *  An axe is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Axe with the specified attributes.
 *  @param name The name of the axe.
 *  @param attackPoints The attack points of the axe.
 *  @param weight The weight of the axe.
 *  @param owner The owner of the axe, represented as an optional character.
 */
class Axe (
            name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[TraitPlayer]
          ) extends AbstractCommonW (name, attackPoints, weight, owner) {

}
