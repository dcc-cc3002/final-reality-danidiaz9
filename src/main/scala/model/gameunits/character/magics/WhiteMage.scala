package model.gameunits.character.magics

import exceptions.InvalidSpellException
import model.gameunits.GameUnit
import model.spells.Spell
import model.weapons.Weapon
import model.weapons.commons.Bow
import model.weapons.magics.{Staff, Wand}

import java.util.Objects

/** A class representing a white wizard character in the game.
 *
 *  @constructor Creates a new white wizard character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the white wizard character.
 *  @param maxHealthPoints The maximum health points of the white wizard character.
 *  @param currentHealthPoints The current health points of the white wizard character.
 *  @param defense The defense points of the white wizard character.
 *  @param weight The weight of the white wizard character.
 *  @param maxManaPoints The maximum mana points of the white wizard character.
 *  @param currentManaPoints The current mana points of the white wizard character.
 *  @param weapon The weapons equipped by the white wizard character.
 */

class WhiteMage(name: String,
                maxHealthPoints: Int,
                currentHealthPoints: Int,
                defense: Int,
                weight: Double,
                maxManaPoints: Int,
                currentManaPoints: Int,
                weapon: Option[Weapon]) extends
                AbstractMagicCharacter(name,
                  maxHealthPoints,
                  currentHealthPoints,
                  defense,
                  weight,
                  maxManaPoints,
                  currentManaPoints,
                  weapon) {

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

  /**
   * Uses a healing spell by the white wizard character on a target game unit if the target's health points are greater than zero.
   *
   * @param target The target game unit to use the healing spell on.
   */
  def useHealing(target: GameUnit): Unit = {
    if (target.getHealthPoints > 0) {
      target.receiveHealing()
    }
  }

  /**
   * Uses a spell by the white wizard character on a target game unit.
   *
   * @param s The spell to use.
   * @param target The target game unit to use the spell on.
   * @throws InvalidSpellException if the character does not have a magic weapon equipped.
   */
  override def useSpell(s: Spell, target: GameUnit): Unit = {
    if (this.getWeapon.isDefined) {
      s.useByWhiteMage(this)
      target.receiveDamage(this.getWeapon.get.getMagicAttackPoints)
    }
    else {
      throw new InvalidSpellException("Need a magic weapon.")
    }
  }

  /**
   * Checks if the given object is equal to this white mage character.
   *
   * @param that The object to compare.
   * @return `true` if the objects are equal, `false` otherwise.
   */
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
    s"currentHealthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"currentManaPoints: $getManaPoints, " +
    s"weapons: $getWeapon" +
    s"}"
}
