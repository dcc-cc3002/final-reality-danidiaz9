package weapons

import exceptions.InvalidSetException
import gameunits.character.Character
import gameunits.character.commons.{Ninja, Paladin, Warrior}
import gameunits.character.magics.{BlackMage, WhiteMage}

/** An abstract class representing a type of weapons in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 *
 *  @constructor Creates a new instance of AbstractWeapon with the specified attributes.
 *  @param name The name of the weapons.
 *  @param attackPoints The attack points of the weapons.
 *  @param weight The weight of the weapons.
 *  @param owner The owner of the weapons, represented as an optional character.
 */
abstract class AbstractWeapon(
                                 val name: String,
                                 val attackPoints: Int,
                                 val weight: Double,
                                 var owner: Option[Character] = None
                               ) extends Weapon {


  /** Returns the name of the weapons.
   *
   *  @return The name of the weapons.
   */
  def getName: String = name

  /** Returns the attack points of the weapons.
   *
   *  @return The attack points of the weapons.
   */
  def getAttackPoints: Int = attackPoints

  /** Returns the weight of the weapons.
   *
   *  @return The weight of the weapons.
   */
  def getWeight: Double = weight

  /** Returns the owner of the weapons.
   *
   *  @return The owner of the weapons.
   */
  def getOwner: Option[Character] = owner

  /** Sets the owner of the weapons.
   *
   *  @param o The owner of the weapons.
   */
  def setOwner(o: Character): Unit = {
    owner = Some(o)
    o.setWeapon(this)
  }

  def setNinja(ninja: Ninja): Unit = throw new InvalidSetException()

  def setPaladin(paladin: Paladin): Unit = throw new InvalidSetException()

  def setWarrior(warrior: Warrior): Unit = throw new InvalidSetException()

  def setBlackMage(blackMage: BlackMage): Unit = throw new InvalidSetException()

  def setWhiteMage(whiteMage: WhiteMage): Unit = throw new InvalidSetException()

}
