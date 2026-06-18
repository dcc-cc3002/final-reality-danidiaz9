package weaponry.weapons.magics

import characters.player.TraitPlayer
import weaponry.AbstractWeaponry
import java.util.Objects


/** A class representing a magical weapon in the game.
 *
 *  A magical weapon is a type of weapon that possesses magical properties, including additional
 *  magic attack points.
 *
 *  @constructor Creates a new instance of AbstractMagicalW with the specified attributes.
 *  @param name The name of the magical weapon.
 *  @param attackPoints The attack points of the magical weapon.
 *  @param weight The weight of the magical weapon.
 *  @param owner The owner of the magical weapon, represented as an optional character.
 *  @param magicAttackPoints The magic attack points of the magical weapon.
 */
abstract class AbstractMagicalW(name: String,
                                attackPoints: Int,
                                weight: Double,
                                owner: Option[TraitPlayer],
                                val magicAttackPoints: Int) extends
            AbstractWeaponry(name, attackPoints, weight, owner) {

  def getMagicAttackPoints: Int = magicAttackPoints


  def canEqual(that: Any): Boolean = that.isInstanceOf[AbstractMagicalW]
    
  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[AbstractMagicalW]
      getName == other.getName &&
      getAttackPoints == other.getAttackPoints &&
      getWeight == other.getWeight &&
      getOwner == other.getOwner &&
      getMagicAttackPoints == other.getMagicAttackPoints
      }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[AbstractMagicalW],
    getName, getAttackPoints, getWeight, getOwner, getMagicAttackPoints)

  override def toString: String = s"MagicalWeapon {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner, " +
    s"magicAttackPoints: $getMagicAttackPoints" +
    s"}"
  }
