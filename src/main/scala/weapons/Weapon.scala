package weapons

import gameunits.character.Character
import gameunits.character.commons.{Ninja, Paladin, Warrior}
import gameunits.character.magics.{BlackMage, WhiteMage}

/** A trait representing weapons in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 */
trait Weapon {

  /** The name of the weapons. */
  val name: String

  /** The attack points of the weapons. */
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

  /** Returns the weight of the weapons.
   *
   *  @return The weight of the weapons.
   */
  def getWeight: Double

  /** Returns the owner of the weapons.
   *
   *  @return The owner of the weapons.
   */
  def getOwner: Option[Character]

  /** Sets the owner of the weapons.
   *
   * */
  def setOwner(o: Character): Unit

  def setNinja(ninja: Ninja): Unit

  def setPaladin(paladin: Paladin): Unit

  def setWarrior(warrior: Warrior): Unit

  def setBlackMage(blackMage: BlackMage): Unit

  def setWhiteMage(whiteMage: WhiteMage): Unit

}
