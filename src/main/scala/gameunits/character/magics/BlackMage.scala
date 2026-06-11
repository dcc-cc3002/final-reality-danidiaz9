package gameunits.character.magics

import weapons.Weapon
import weapons.commons.Sword
import weapons.magics.{Staff, Wand}

import java.util.Objects

/** A class representing a black wizard character in the game.
 *
 *  @constructor Creates a new black wizard character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the black wizard character.
 *  @param healthPoints The current health points of the black wizard character.
 *  @param defense The defense points of the black wizard character.
 *  @param weight The weight of the black wizard character.
 *  @param manaPoints The current mana points of the black wizard character.
 *  @param weapon The weapons equipped by the black wizard character.
 */

class BlackMage(name: String,
                healthPoints: Int,
                defense: Int,
                weight: Double,
                manaPoints: Int,
                weapon: Option[Weapon]) extends
                  AbstractMagicalCharacter(name, healthPoints, defense, weight, manaPoints, weapon) {

  /** Equips a sword to the black wizard character.
   *
   *  @param sword The sword to be equipped.
   */
  override def equipSword(sword: Sword): Unit = {
    sword.setBlackMage(this)
  }

  /** Equips a wand to the black wizard character.
   *
   *  @param wand The wand to be equipped.
   */
  override def equipWand(wand: Wand): Unit = {
    wand.setBlackMage(this)
  }

  /** Equips a staff to the black wizard character.
   *
   *  @param staff The staff to be equipped.
   */
  override def equipStaff(staff: Staff): Unit = {
    staff.setBlackMage(this)
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[BlackMage]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[BlackMage]
      getName == other.getName &&
        getHealthPoints == other.getHealthPoints &&
        getDefense == other.getDefense &&
        getWeight == other.getWeight &&
        getManaPoints == other.getManaPoints &&
        getWeapon == other.getWeapon
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[BlackMage],
    getName, getHealthPoints, getDefense, getWeight, getManaPoints, getWeapon)

  override def toString: String = s"BlackMage {" +
    s"name: $getName, " +
    s"healthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"manaPoints: $getManaPoints, " +
    s"weapons: $getWeapon" +
    s"}"
}
