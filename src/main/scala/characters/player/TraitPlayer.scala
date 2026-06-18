package characters.player

import characters.TraitCharacter
import weaponry.TraitWeaponry

/** Trait representing a player-controlled character.
 *
 * This trait extends the basic properties of a character in the game,
 * adding the ability to equip and change weapons.
 */
trait TraitPlayer extends TraitCharacter {

  /** Returns the weapon currently equipped by the player.
   *
   *  @return The weapon currently equipped by the player.
   */
  def getWeapon: Option[TraitWeaponry]

  /** Sets the weapon to be equipped by the player.
   *
   *  @param weapon The weapon to be equipped by the player.
   */
  def setWeapon(weapon: TraitWeaponry): Unit

}
