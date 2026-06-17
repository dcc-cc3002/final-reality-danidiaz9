package weapons.commons

import gameunits.character.Character
import gameunits.character.commons.{Paladin, Warrior}
import java.util.Objects

/** A class representing an axe weapons in the game.
 *
 *  An axe is a type of weapons used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Axe with the specified attributes.
 *  @param name The name of the axe.
 *  @param attackPoints The attackCharacter points of the axe.
 *  @param weight The weight of the axe.
 *  @param owner The owner of the axe, represented as an optional character.
 */
class Axe (name: String,
           attackPoints: Int,
           weight: Double,
           owner: Option[Character])
           extends AbstractCommonWeapon (name, attackPoints, weight, owner) {

  /** Sets the owner of the axe to a paladin character.
   *
   *  @param paladin The paladin character who will be the owner of the axe.
   */
  override def setPaladin(paladin: Paladin): Unit = {
    paladin.equipWeapon(this)
  }

  /** Sets the owner of the axe to a warrior character.
   *
   *  @param warrior The warrior character who will be the owner of the axe.
   */
  override def setWarrior(warrior: Warrior): Unit = {
    warrior.equipWeapon(this)
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[Axe]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Axe]
      getName == other.getName &&
        getAttackPoints == other.getAttackPoints &&
        getWeight == other.getWeight &&
        getOwner == other.getOwner
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Axe],
    getName, getAttackPoints, getWeight, getOwner)

  override def toString: String = s"Axe {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner" +
    s"}"

}
