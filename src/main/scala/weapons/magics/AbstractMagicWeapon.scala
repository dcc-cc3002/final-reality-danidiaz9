package weapons.magics

import gameunits.character.Character
import weapons.AbstractWeapon
import java.util.Objects


/** A class representing a magical weapons in the game.
 *
 *  A magical weapons is a type of weapons that possesses magical properties, including additional
 *  magic attack points.
 *
 *  @constructor Creates a new instance of AbstractMagicWeapon with the specified attributes.
 *  @param name The name of the magical weapons.
 *  @param attackPoints The attack points of the magical weapons.
 *  @param weight The weight of the magical weapons.
 *  @param owner The owner of the magical weapons, represented as an optional character.
 *  @param magicAttackPoints The magic attack points of the magical weapons.
 */
abstract class AbstractMagicWeapon(name: String,
                                   attackPoints: Int,
                                   weight: Double,
                                   owner: Option[Character],
                                   val magicAttackPoints: Int) extends
            AbstractWeapon(name, attackPoints, weight, owner) with MagicWeapon {

  def getMagicAttackPoints: Int = magicAttackPoints

  def canEqual(that: Any): Boolean = that.isInstanceOf[AbstractMagicWeapon]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[AbstractMagicWeapon]
      getName == other.getName &&
      getAttackPoints == other.getAttackPoints &&
      getWeight == other.getWeight &&
      getOwner == other.getOwner &&
      getMagicAttackPoints == other.getMagicAttackPoints
      }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[AbstractMagicWeapon],
    getName, getAttackPoints, getWeight, getOwner, getMagicAttackPoints)

  override def toString: String = s"MagicWeapon {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner, " +
    s"magicAttackPoints: $getMagicAttackPoints" +
    s"}"
  }
