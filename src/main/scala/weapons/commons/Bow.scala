package weapons.commons

import gameunits.character.Character
import gameunits.character.commons.{Ninja, Warrior}
import gameunits.character.magics.WhiteMage

import java.util.Objects

/** A class representing a bow weapons in the game.
 *
 *  A bow is a type of weapons used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Bow with the specified attributes.
 *  @param name The name of the bow.
 *  @param attackPoints The attackCharacter points of the bow.
 *  @param weight The weight of the bow.
 *  @param owner The owner of the bow, represented as an optional character.
 */
class Bow (name: String,
           attackPoints: Int,
           weight: Double,
           owner: Option[Character])
           extends AbstractCommonWeapon (name, attackPoints, weight, owner) {

  /** Sets the owner of the bow to a warrior character.
   *
   *  @param warrior The warrior character who will be the owner of the bow.
   */
  override def setWarrior(warrior: Warrior): Unit = {
    warrior.equipWeapon(this)
  }

  /** Sets the owner of the bow to a ninja character.
   *
   *  @param ninja The ninja character who will be the owner of the bow.
   */
  override def setNinja(ninja: Ninja): Unit = {
    ninja.equipWeapon(this)
  }

  /** Sets the owner of the bow to a white wizard character.
   *
   *  @param whiteMage The white wizard character who will be the owner of the bow.
   */
  override def setWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipWeapon(this)
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[Bow]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Bow]
      getName == other.getName &&
        getAttackPoints == other.getAttackPoints &&
        getWeight == other.getWeight &&
        getOwner == other.getOwner
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Bow],
    getName, getAttackPoints, getWeight, getOwner)

  override def toString: String = s"Bow {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner" +
    s"}"

}