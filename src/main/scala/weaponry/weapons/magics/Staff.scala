package weaponry.weapons.magics

import characters.player.TraitPlayer

/** A class representing a staff magical weapon in the game.
 *
 *  A staff is a type of magical weapon that is used by spellcasters to enhance their magical abilities.
 *
 *  @constructor Creates a new instance of Staff with the specified attributes.
 *  @param name The name of the staff.
 *  @param attackPoints The attack points of the staff.
 *  @param weight The weight of the staff.
 *  @param owner The owner of the staff, represented as an optional character.
 *  @param magicAttackPoints The magic attack points of the staff.
 */
class Staff (
            name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[TraitPlayer],
            magicAttackPoints: Int
          ) extends AbstractMagicalW (name, attackPoints, weight, owner, magicAttackPoints) {

}