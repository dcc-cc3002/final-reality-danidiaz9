package characters

/** Trait representing a character.
 *
 * This trait defines the basic properties of a character in the game,
 * such as name, health points, defense, weight, and action bar.
 */
trait TraitCharacter {
  /** The name of the character.
   *
   */
  val name: String

  /** The weight of the character.
   *
   */
  val weight: Double

  var actionBar: Double

  /** Returns the name of the character.
   *
   * @return The name of the character.
   */
  def getName: String

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int

  def setHealthPoints(x: Int): Unit

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

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double

  /** Calculates and returns the maximum value of the action bar for the character.
   *
   *  @return The maximum value of the action bar for the character.
   */
  def calculateMaxActionBar: Double

  def attack: Int

}