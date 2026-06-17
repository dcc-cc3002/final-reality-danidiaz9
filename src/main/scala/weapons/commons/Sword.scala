package weapons.commons

import gameunits.character.Character
import gameunits.character.commons.{Ninja, Paladin, Warrior}
import gameunits.character.magics.BlackMage
import weapons.Weapon

import java.util.Objects

/** A class representing a sword weapons in the game.
 *
 *  A sword is a type of weapons used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Sword with the specified attributes.
 *  @param name The name of the sword.
 *  @param attackPoints The attack points of the sword.
 *  @param weight The weight of the sword.
 *  @param owner The owner of the sword, represented as an optional character.
 */
class Sword (
            name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[Character]
          ) extends AbstractCommonWeapon (name, attackPoints, weight, owner) {

  /** Sets the owner of the sword to a paladin character.
   *
   *  @param paladin The paladin character who will be the owner of the sword.
   */
  override def setPaladin(paladin: Paladin): Unit = {
    paladin.setWeapon(this)
  }

  /** Sets the owner of the sword to a warrior character.
   *
   *  @param warrior The warrior character who will be the owner of the sword.
   */
  override def setWarrior(warrior: Warrior): Unit = {
    warrior.setWeapon(this)
  }

  /** Sets the owner of the sword to a ninja character.
   *
   *  @param ninja The ninja character who will be the owner of the sword.
   */
  override def setNinja(ninja: Ninja): Unit = {
    ninja.setWeapon(this)
  }

  /** Sets the owner of the sword to a black wizard character.
   *
   *  @param blackMage The black wizard character who will be the owner of the sword.
   */
  override def setBlackMage(blackMage: BlackMage): Unit = {
    blackMage.setWeapon(this)
  }

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Sword]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Sword]
      getName == other.getName &&
        getAttackPoints == other.getAttackPoints &&
        getWeight == other.getWeight &&
        getOwner == other.getOwner
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Sword],
    getName, getAttackPoints, getWeight, getOwner)

  override def toString: String = s"Sword {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner" +
    s"}"

}