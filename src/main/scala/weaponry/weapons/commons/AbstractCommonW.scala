package weaponry.weapons.commons

import characters.player.TraitPlayer
import weaponry.AbstractWeaponry
import java.util.Objects

/** An abstract class representing a common type of weapon in the game.
 *
 *  A common weapon is an object used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of AbstractCommonW with the specified attributes.
 *  @param name The name of the weapon.
 *  @param attackPoints The attack points of the weapon.
 *  @param weight The weight of the weapon.
 *  @param owner The owner of the weapon, represented as an optional character.
 */
abstract class AbstractCommonW(name: String,
                               attackPoints: Int,
                               weight: Double,
                               owner: Option[TraitPlayer]) extends
             AbstractWeaponry(name, attackPoints, weight, owner) {



  def canEqual(that: Any): Boolean = that.isInstanceOf[AbstractWeaponry]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[AbstractWeaponry]
      getName == other.getName &&
      getAttackPoints == other.getAttackPoints &&
      getWeight == other.getWeight &&
      getOwner == other.getOwner
      }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[AbstractWeaponry],
    getName, getAttackPoints, getWeight, getOwner)

  override def toString: String = s"Weapon {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner" +
    s"}"
}