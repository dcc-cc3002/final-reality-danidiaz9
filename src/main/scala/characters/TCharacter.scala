package characters

import weaponry.Weapon

/** Trait representing a character.
 *
 * This trait defines the basic properties of a character in the game,
 * such as name, health points, defense, and weight.
 */
trait TCharacter {
  /** The name of the character.
   *
   */
  val name: String

  /** The current health points of the character.
   *
   */
  var healthPoints: Int

  /** The defense points of the character.
   *
   */
  var defense: Int

  /** The weight of the character.
   *
   */
  val weight: Double

  /** Returns the name of the character.
   *
   */
  def getName: String

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double

  def equipWeapon: Boolean
}
