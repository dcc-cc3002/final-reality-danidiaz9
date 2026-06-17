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
  def setWeapon(weapon: Weapon): Unit

  def equipAxe(axe: Axe): Unit

  def equipBow(bow: Bow): Unit

  def equipSword(sword: Sword): Unit

  def equipWand(wand: Wand): Unit

  def equipStaff(staff: Staff): Unit

}
