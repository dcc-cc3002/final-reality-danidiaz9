package gameunits

/** Trait representing a character.
 *
 * This trait defines the basic properties of a character in the game,
 * such as name, health points, defense, weight, and action bar.
 */
trait GameUnit {
  /** The name of the character.
   *
   */
  val name: String

  /** The weight of the character.
   *
   */
  val weight: Double

  /** The action bar of the character. */
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

  /** Sets the health points of the character to the specified value.
   *
   *  @param x The value to set the health points to.
   */
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

  def attack(g: GameUnit): Unit

  def attackFromCharacter(c: Character): Unit

  def attackFromEnemy(e: Enemy): Unit

}