package model.weapons

import model.gameunits.character
import model.gameunits.character.commons.{Ninja, Paladin, Warrior}
import model.gameunits.character.magics.{BlackMage, WhiteMage}

/** A trait representing weapons in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 */
trait Weapon {

  /** The name of the weapons. */
  val name: String

  /** The attackCharacter points of the weapons. */
  val attackPoints: Int

  /** The weight of the weapons. */
  val weight: Double

  /** Returns the name of the weapons.
   *
   *  @return The name of the weapons.
   */
  def getName: String

  /** Returns the attack points of the weapons.
   *
   *  @return The attack points of the weapons.
   */
  def getAttackPoints: Int

  /** Returns the magic attack points of the weapon.
   *
   *  @return The magic attack points of the weapon.
   */
  def getMagicAttackPoints: Int

  /** Returns the weight of the weapons.
   *
   *  @return The weight of the weapons.
   */
  def getWeight: Double

  /** Returns the owner of the weapons.
   *
   *  @return The owner of the weapons.
   */
  def getOwner: Option[character.Character]

  /** Sets the owner of the weapons.
   *
   * */
  def setOwner(o: character.Character): Unit

  /** Sets the owner of the weapon to a Ninja character.
   *
   *  @param ninja The Ninja character to set as the owner of the weapon.
   */
  def setNinja(ninja: Ninja): Unit

  /** Sets the owner of the weapon to a Paladin character.
   *
   *  @param paladin The Paladin character to set as the owner of the weapon.
   */
  def setPaladin(paladin: Paladin): Unit

  /** Sets the owner of the weapon to a Warrior character.
   *
   *  @param warrior The Warrior character to set as the owner of the weapon.
   */
  def setWarrior(warrior: Warrior): Unit

  /** Sets the owner of the weapon to a BlackMage character.
   *
   *  @param blackMage The BlackMage character to set as the owner of the weapon.
   */
  def setBlackMage(blackMage: BlackMage): Unit

  /** Sets the owner of the weapon to a WhiteMage character.
   *
   *  @param whiteMage The WhiteMage character to set as the owner of the weapon.
   */
  def setWhiteMage(whiteMage: WhiteMage): Unit

}
