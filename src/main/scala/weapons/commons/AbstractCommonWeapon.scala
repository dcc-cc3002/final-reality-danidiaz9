package weapons.commons

import exceptions.InvalidStatException
import gameunits.character.Character
import weapons.AbstractWeapon

/** An abstract class representing a common type of weapons in the game.
 *
 *  A common weapons is an object used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of AbstractCommonWeapon with the specified attributes.
 *  @param name The name of the weapons.
 *  @param attackPoints The attackCharacter points of the weapons.
 *  @param weight The weight of the weapons.
 *  @param owner The owner of the weapons, represented as an optional character.
 */
abstract class AbstractCommonWeapon(name: String,
                                    attackPoints: Int,
                                    weight: Double,
                                    owner: Option[Character]) extends
                                    AbstractWeapon(name, attackPoints, weight, owner) {

  override def getMagicAttackPoints: Int =
    throw new InvalidStatException("This isn't a magic weapon.")
}
