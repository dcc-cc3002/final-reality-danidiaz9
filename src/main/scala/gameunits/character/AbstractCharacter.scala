package gameunits.character

import exceptions.InvalidEquipException
import weapons.Weapon
import weapons.commons.{Axe, Bow, Sword}
import weapons.magics.{Staff, Wand}

/** An abstract class representing a character-controlled character in the game.
 *
 *  @constructor Creates a new character with the specified name, health points, defense, weight, and weapons.
 *  @param name The name of the character.
 *  @param healthPoints The current health points of the character.
 *  @param defense The defense points of the character.
 *  @param weight The weight of the character.
 *  @param weapon The weapons equipped by the character, represented as an optional trait weapons.
 */
abstract class AbstractCharacter(val name: String,
                                 private var healthPoints: Int,
                                 private var defense: Int,
                                 val weight: Double,
                                 private var weapon: Option[Weapon] = None
                             ) extends Character {
  
  /** The action bar of the character. */
  var actionBar: Double = 0.0

  /** Returns the name of the character.
   *
   *  @return The name of the character.
   */
  def getName: String = name

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int = healthPoints

  /** Sets the health points of the character to the specified value.
   *
   *  @param x The value to set the health points to.
   */
  def setHealthPoints(x: Int): Unit = {
    healthPoints = x
  }

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int = defense

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double = weight

  /** Returns the weapons equipped by the character.
   *
   *  @return The weapons equipped by the character.
   */
  def getWeapon: Option[Weapon] = weapon

  /** Sets the weapons to be equipped by the character.
   *
   *  @param w The weapons to be equipped by the character.
   */
  def setWeapon(w: Weapon): Unit = {
   weapon = Some(w)
   w.setOwner(this)
  }

  def equipAxe(axe: Axe): Unit = throw new InvalidEquipException()

  def equipBow(bow: Bow): Unit = throw new InvalidEquipException()

  def equipSword(sword: Sword): Unit = throw new InvalidEquipException()

  def equipWand(wand: Wand): Unit = throw new InvalidEquipException()

  def equipStaff(staff: Staff): Unit = throw new InvalidEquipException()

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double = actionBar

  /** Calculates the maximum action bar of the character.
   *
   *  @return The maximum action bar of the character.
   */
  def calculateMaxActionBar: Double = {
    val charWeight = this.getWeight
    val weaponWeight = this.getWeapon.get.getWeight
    val maxActionBar = charWeight + 0.5 * weaponWeight
    maxActionBar

  }

  /** Returns the attack points of the character.
   *
   *  @return The attack points of the character.
   */
  def attack: Int = {
    if (this.getWeapon.isDefined) {
      this.getWeapon.get.getAttackPoints
    }
    else {
      println("Error: Players must have a weapons to attack.")
      -1
    }
  }

}
