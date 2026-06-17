package gameunits.character.magics

import weapons.Weapon
import weapons.commons.Bow
import weapons.magics.{Staff, Wand}

import java.util.Objects

/** A class representing a white wizard character in the game.
 *
 *  @constructor Creates a new white wizard character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the white wizard character.
 *  @param healthPoints The current health points of the white wizard character.
 *  @param defense The defense points of the white wizard character.
 *  @param weight The weight of the white wizard character.
 *  @param manaPoints The current mana points of the white wizard character.
 *  @param weapon The weapons equipped by the white wizard character.
 */

class WhiteMage(name: String,
                healthPoints: Int,
                defense: Int,
                weight: Double,
                manaPoints: Int,
                weapon: Option[Weapon]) extends
                  AbstractMagicalCharacter(name, healthPoints, defense, weight, manaPoints, weapon) {

  /** Equips a bow to the white wizard character.
   *
   *  @param bow The bow to be equipped.
   */
  override def equipBow(bow: Bow): Unit = {
    bow.setWhiteMage(this)
  }

  /** Equips a wand to the white wizard character.
   *
   *  @param wand The wand to be equipped.
   */
  override def equipWand(wand: Wand): Unit = {
    wand.setWhiteMage(this)
  }

  /** Equips a staff to the white wizard character.
   *
   *  @param staff The staff to be equipped.
   */
  override def equipStaff(staff: Staff): Unit = {
    staff.setWhiteMage(this)
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[WhiteMage]

  override def equals(that: Any): Boolean = {
  if (canEqual(that)) {
    val other = that.asInstanceOf[WhiteMage]
    getName == other.getName &&
      getHealthPoints == other.getHealthPoints &&
      getDefense == other.getDefense &&
      getWeight == other.getWeight &&
      getManaPoints == other.getManaPoints &&
      getWeapon == other.getWeapon
  }
  else false
  }

  override def hashCode: Int = Objects.hash(classOf[WhiteMage],
    getName, getHealthPoints, getDefense, getWeight, getManaPoints, getWeapon)

  override def toString: String = s"WhiteMage {" +
    s"name: $getName, " +
    s"healthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"manaPoints: $getManaPoints, " +
    s"weapons: $getWeapon" +
    s"}"
}
