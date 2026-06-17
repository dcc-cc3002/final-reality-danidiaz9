package model.gameunits.character.commons

import model.weapons.Weapon
import model.weapons.commons.{Axe, Sword}

import java.util.Objects

/** A class representing a paladin character in the game.
 *
 *  @constructor Creates a new paladin character with the specified name, health points, defense, and weight.
 *  @param name The name of the paladin character.
 *  @param maxHealthPoints The maximum health points of the paladin character.
 *  @param currentHealthPoints The current health points of the paladin character.
 *  @param defense The defense points of the paladin character.
 *  @param weight The weight of the paladin character.
 *  @param weapon The weapons equipped by the paladin character.
 */
class Paladin(name: String,
              maxHealthPoints: Int,
              currentHealthPoints: Int,
              defense: Int,
              weight: Double,
              weapon: Option[Weapon]) extends
              AbstractCommonCharacter(name, maxHealthPoints, currentHealthPoints, defense, weight, weapon) {

  /** Equips a sword to the paladin character.
   *
   *  @param sword The sword to be equipped.
   */
  override def equipSword(sword: Sword): Unit = {
    sword.setPaladin(this)
  }

  /** Equips an axe to the paladin character.
   *
   *  @param axe The axe to be equipped.
   */
  override def equipAxe(axe: Axe): Unit = {
    axe.setPaladin(this)
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[Paladin]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Paladin]
      getName == other.getName &&
        getHealthPoints == other.getHealthPoints &&
        getDefense == other.getDefense &&
        getWeight == other.getWeight &&
        getWeapon == other.getWeapon
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Paladin],
    getName, getHealthPoints, getDefense, getWeight, getWeapon)

  override def toString: String = s"Paladin {" +
    s"name: $getName, " +
    s"currentHealthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"weapons: $getWeapon" +
    s"}"

}
