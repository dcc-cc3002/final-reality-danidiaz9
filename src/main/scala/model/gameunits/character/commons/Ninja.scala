package model.gameunits.character.commons

import model.weapons.Weapon
import model.weapons.commons.{Bow, Sword}
import model.weapons.magics.Wand

import java.util.Objects


/** A class representing a ninja character in the game.
 *
 *  @constructor Creates a new ninja character with the specified name, health points, defense, and weight.
 *  @param name The name of the ninja character.
 *  @param maxHealthPoints The maximum health points of the ninja character.
 *  @param currentHealthPoints The current health points of the ninja character.
 *  @param defense The defense points of the ninja character.
 *  @param weight The weight of the ninja character.
 *  @param weapon The weapons equipped by the ninja character.
 */
class Ninja(name: String,
            maxHealthPoints: Int,
            currentHealthPoints: Int,
            defense: Int,
            weight: Double,
            weapon: Option[Weapon]) extends
            AbstractCommonCharacter(name, maxHealthPoints, currentHealthPoints, defense, weight, weapon) {

  /** Equips a sword to the ninja character.
   *
   *  @param sword The sword to be equipped.
   */
  override def equipSword(sword: Sword): Unit = {
    sword.setNinja(this)
  }

  /** Equips a bow to the ninja character.
   *
   *  @param bow The bow to be equipped.
   */
  override def equipBow(bow: Bow): Unit = {
    bow.setNinja(this)
  }

  /** Equips a wand to the ninja character.
   *
   *  @param wand The wand to be equipped.
   */
  override def equipWand(wand: Wand): Unit = {
    wand.setNinja(this)
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[Ninja]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Ninja]
      getName == other.getName &&
      getHealthPoints == other.getHealthPoints &&
      getDefense == other.getDefense &&
      getWeight == other.getWeight &&
      getWeapon == other.getWeapon
    }
    else false
    }

    override def hashCode: Int = Objects.hash(classOf[Ninja],
      getName, getHealthPoints, getDefense, getWeight, getWeapon)

    override def toString: String = s"Ninja {" +
      s"name: $getName, " +
      s"currentHealthPoints: $getHealthPoints, " +
      s"defense: $getDefense, " +
      s"weight: $getWeight, " +
      s"weapons: $getWeapon" +
      s"}"
}
