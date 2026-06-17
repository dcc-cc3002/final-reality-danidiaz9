package weapons.magics

import gameunits.character.Character
import gameunits.character.commons.Ninja
import gameunits.character.magics.{BlackMage, WhiteMage}

import java.util.Objects

/** A class representing a wand magical weapons in the game.
 *
 *  A wand is a type of magical weapons that is commonly used by spellcasters to channel their magical abilities.
 *
 *  @constructor Creates a new instance of Wand with the specified attributes.
 *  @param name The name of the wand.
 *  @param attackPoints The attackCharacter points of the wand.
 *  @param weight The weight of the wand.
 *  @param owner The owner of the wand, represented as an optional character.
 *  @param magicAttackPoints The magic attackCharacter points of the wand.
 */
class Wand (name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[Character],
            magicAttackPoints: Int)
            extends AbstractMagicWeapon (name, attackPoints, weight, owner, magicAttackPoints) {

  /** Sets the owner of the wand to a ninja character.
   *
   *  @param ninja The ninja character who will be the owner of the wand.
   */
  override def setNinja(ninja: Ninja): Unit = {
    ninja.equipWeapon(this)
  }

  /** Sets the owner of the wand to a black wizard character.
   *
   *  @param blackMage The black wizard character who will be the owner of the wand.
   */
  override def setBlackMage(blackMage: BlackMage): Unit = {
    blackMage.equipWeapon(this)
  }

  /** Sets the owner of the wand to a white wizard character.
   *
   *  @param whiteMage The white wizard character who will be the owner of the wand.
   */
  override def setWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipWeapon(this)
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[Wand]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Wand]
      getName == other.getName &&
        getAttackPoints == other.getAttackPoints &&
        getWeight == other.getWeight &&
        getOwner == other.getOwner &&
        getMagicAttackPoints == other.getMagicAttackPoints
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Wand],
    getName, getAttackPoints, getWeight, getOwner, getMagicAttackPoints)

  override def toString: String = s"Wand {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner, " +
    s"magicAttackPoints: $getMagicAttackPoints" +
    s"}"

}