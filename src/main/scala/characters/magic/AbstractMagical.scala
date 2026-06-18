package characters.magic

import characters.TCharacter
import weaponry.MagicalWeapon

/** An abstract class representing a magical character in the game.
 *
 *  @constructor Creates a new magical character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the magical character.
 *  @param healthPoints The current health points of the magical character.
 *  @param defense The defense points of the magical character.
 *  @param weight The weight of the magical character.
 *  @param manaPoints The current mana points of the magical character.
 */

abstract class AbstractMagical(val name: String,
                               var healthPoints: Int,
                               var defense:Int,
                               val weight: Double,
                               var manaPoints: Int) extends TCharacter {

  /** The magical weapon equipped by the magical character. */
  override def equipWeapon: Boolean = true

  /** Returns the name of the magical character. */
  def getName: String = name

  /** Returns the current health points of the magical character. */
  def getHealthPoints: Int = healthPoints

  /** Returns the defense points of the magical character. */
  def getDefense: Int = defense

  /** Returns the weight of the magical character. */
  def getWeight: Double = weight

  /** Returns the current mana points of the magical character. */
  def getManaPoints: Int = manaPoints

}