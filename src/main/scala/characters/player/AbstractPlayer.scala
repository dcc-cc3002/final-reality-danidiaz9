package characters.player

import weaponry.TraitWeaponry

/** An abstract class representing a player-controlled character in the game.
 *
 *  @constructor Creates a new player with the specified name, health points, defense, weight, and weapon.
 *  @param name The name of the player.
 *  @param healthPoints The current health points of the player.
 *  @param defense The defense points of the player.
 *  @param weight The weight of the player.
 *  @param weapon The weapon equipped by the player, represented as an optional trait weaponry.
 */
abstract class AbstractPlayer(val name: String,
                              private var healthPoints: Int,
                              private var defense: Int,
                              val weight: Double,
                              private var weapon: Option[TraitWeaponry] = None
                             ) extends TraitPlayer {
  
  /** The action bar of the player. */
  var actionBar: Double = 0.0

  /** Returns the name of the player.
   *
   *  @return The name of the player.
   */
  def getName: String = name

  /** Returns the current health points of the player.
   *
   *  @return The current health points of the player.
   */
  def getHealthPoints: Int = healthPoints

  def setHealthPoints(x: Int): Unit = {

    healthPoints = x

  }

  /** Returns the defense points of the player.
   *
   *  @return The defense points of the player.
   */
  def getDefense: Int = defense

  /** Returns the weight of the player.
   *
   *  @return The weight of the player.
   */
  def getWeight: Double = weight

  /** Returns the weapon equipped by the player.
   *
   *  @return The weapon equipped by the player.
   */
  def getWeapon: Option[TraitWeaponry] = weapon

  /** Sets the weapon to be equipped by the player.
   *
   *  @param w The weapon to be equipped by the player.
   */
  def setWeapon(w: TraitWeaponry): Unit = {
   weapon = Some(w)
  }

  /** Returns the action bar of the player.
   *
   *  @return The action bar of the player.
   */
  def getActionBar: Double = actionBar

  /** Calculates the maximum action bar of the player.
   *
   *  @return The maximum action bar of the player.
   */
  def calculateMaxActionBar: Double = {
    val charWeight = this.getWeight
    val weaponWeight = this.getWeapon.get.getWeight
    val maxActionBar = charWeight + 0.5 * weaponWeight
    maxActionBar

  }

  def attack: Int = {
    if (this.getWeapon.isDefined) {
      this.getWeapon.get.getAttackPoints
    }
    else {
      println("Error: Players must have a weapon to attack.")
      -1
    }
  }

}
