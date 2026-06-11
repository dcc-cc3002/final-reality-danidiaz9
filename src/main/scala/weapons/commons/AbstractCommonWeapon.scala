package weapons.commons

import gameunits.character.Character
import weapons.AbstractWeapon
import java.util.Objects

/** An abstract class representing a common type of weapons in the game.
 *
 *  A common weapons is an object used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of AbstractCommonWeapon with the specified attributes.
 *  @param name The name of the weapons.
 *  @param attackPoints The attack points of the weapons.
 *  @param weight The weight of the weapons.
 *  @param owner The owner of the weapons, represented as an optional character.
 */
abstract class AbstractCommonWeapon(name: String,
                                    attackPoints: Int,
                                    weight: Double,
                                    owner: Option[Character]) extends
             AbstractWeapon(name, attackPoints, weight, owner) {



  def canEqual(that: Any): Boolean = that.isInstanceOf[AbstractWeapon]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[AbstractWeapon]
      getName == other.getName &&
      getAttackPoints == other.getAttackPoints &&
      getWeight == other.getWeight &&
      getOwner == other.getOwner
      }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[AbstractWeapon],
    getName, getAttackPoints, getWeight, getOwner)

  override def toString: String = s"Weapon {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner" +
    s"}"
}