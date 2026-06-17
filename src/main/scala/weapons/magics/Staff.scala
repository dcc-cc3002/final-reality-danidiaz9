package weapons.magics

import gameunits.character.Character
import gameunits.character.magics.{BlackMage, WhiteMage}
import weapons.Weapon

import java.util.Objects

/** A class representing a staff magical weapons in the game.
 *
 *  A staff is a type of magical weapons that is used by spellcasters to enhance their magical abilities.
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
              owner: Option[Character],
              magicAttackPoints: Int
          ) extends AbstractMagicWeapon (name, attackPoints, weight, owner, magicAttackPoints) with MagicWeapon {

  /** Sets the owner of the staff to a black wizard character.
   *
   *  @param blackMage The black wizard character who will be the owner of the staff.
   */
  override def setBlackMage(blackMage: BlackMage): Unit = {
    blackMage.setWeapon(this)
  }

  /** Sets the owner of the staff to a white wizard character.
   *
   *  @param whiteMage The white wizard character who will be the owner of the staff.
   */
  override def setWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.setWeapon(this)
  }

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Staff]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Staff]
      getName == other.getName &&
        getAttackPoints == other.getAttackPoints &&
        getWeight == other.getWeight &&
        getOwner == other.getOwner &&
        getMagicAttackPoints == other.getMagicAttackPoints
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Staff],
    getName, getAttackPoints, getWeight, getOwner, getMagicAttackPoints)

  override def toString: String = s"Staff {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner, " +
    s"magicAttackPoints: $getMagicAttackPoints" +
    s"}"

}