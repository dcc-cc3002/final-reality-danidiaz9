package characters.player.magics

import characters.player.TraitPlayer
import weaponry.{AbstractWeaponry, TraitWeaponry}

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

abstract class AbstractMagicalP(val _name: String,
                                var _healthPoints: Int,
                                var _defense:Int,
                                val _weight: Double,
                                var _manaPoints: Int,
                                var _weapon: TraitWeaponry = _) extends TraitPlayer {

  var actionBar: Double = 0.0

  /** The magical weapon equipped by the magical character. */
  def equipWeapon: TraitWeaponry = _weapon

  /** Returns the name of the magical character. */
  def getName: String = _name

  /** Returns the current health points of the magical character. */
  def getHealthPoints: Int = _healthPoints

  /** Returns the defense points of the magical character. */
  def getDefense: Int = _defense

  /** Returns the weight of the magical character. */
  def getWeight: Double = _weight

  def getManaPoints: Int = _manaPoints

  def getWeapon: TraitWeaponry = _weapon

  def getActionBar: Double = actionBar
}