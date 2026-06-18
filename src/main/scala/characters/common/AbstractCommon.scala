package characters.common

import characters.TCharacter
import weaponry.Weapon

/** An abstract class representing a common character in the game.
 *
 *  @constructor Creates a new common character with the specified name, health points, defense, and weight.
 *  @param name The name of the common character.
 *  @param healthPoints The current health points of the common character.
 *  @param defense The defense points of the common character.
 *  @param weight The weight of the common character.
 */
abstract class AbstractCommon(val name: String,
                              var healthPoints: Int,
                              var defense: Int,
                              val weight: Double) extends TCharacter {

  /** The weapon equipped by the common character. */
  override def equipWeapon: Boolean = true

  /** Returns the name of the common character. */
  def getName: String = name

  /** Returns the current health points of the common character. */
  def getHealthPoints: Int = healthPoints

  /** Returns the defense points of the common character. */
  def getDefense: Int = defense

  /** Returns the weight of the common character. */
  def getWeight: Double = weight

}
