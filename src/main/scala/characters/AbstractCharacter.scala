package characters

import characters.player.TraitPlayer

/** An abstract class representing a character in the game.
 *
 *  @constructor Creates a new character with the specified name, health points, defense, and weight.
 *  @param name The name of the character.
 *  @param healthPoints The current health points of the character.
 *  @param defense The defense points of the character.
 *  @param weight The weight of the character.
 */
abstract class AbstractCharacter(val _name: String,
                        var _healthPoints: Int,
                        var _defense: Int,
                        val _weight: Double) extends TraitCharacter {

  var actionBar: Double = 0.0

  /** Returns the name of the character.
   *
   *  @return The name of the character.
   */
  def getName: String = _name

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int = _healthPoints

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int = _defense

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double = _weight

  def getActionBar: Double = actionBar

}
