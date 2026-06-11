package gameunits.character

import gameunits.GameUnit
import weapons.Weapon
import weapons.commons.{Axe, Bow, Sword}
import weapons.magics.{Staff, Wand}

/** Trait representing a character-controlled character.
 *
 * This trait extends the basic properties of a character in the game,
 * adding the ability to equip and change weapons.
 */
trait Character extends GameUnit {

  /** Returns the weapons currently equipped by the character.
   *
   *  @return The weapons currently equipped by the character.
   */
  def getWeapon: Option[Weapon]

  /** Sets the weapons to be equipped by the character.
   *
   *  @param weapon The weapons to be equipped by the character.
   */
  def equipWeapon(weapon: Weapon): Unit

  /** Equips an axe to the character.
   *
   *  @param axe The axe to be equipped.
   */
  def equipAxe(axe: Axe): Unit

  /** Equips a bow to the character.
   *
   *  @param bow The bow to be equipped.
   */
  def equipBow(bow: Bow): Unit

  /** Equips a sword to the character.
   *
   *  @param sword The sword to be equipped.
   */
  def equipSword(sword: Sword): Unit

  /** Equips a wand to the character.
   *
   *  @param wand The wand to be equipped.
   */
  def equipWand(wand: Wand): Unit

  /** Equips a staff to the character.
   *
   *  @param staff The staff to be equipped.
   */
  def equipStaff(staff: Staff): Unit

/**
 * Unequips the weapon currently equipped by the character.
 */
  def unEquipWeapon(): Unit

}
