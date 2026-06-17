package model.gameunits.character.magics

import model.gameunits.GameUnit
import model.spells.Spell

/** A trait representing a character with magical abilities.
 *
 *  Magic characters have attributes such as maximum mana points and the ability to cast spells.
 */
trait MagicCharacter {

  /** The maximum mana points of the magic character. */
  val maxManaPoints: Int

  /** Returns the current mana points of the magic character.
   *
   *  @return The current mana points of the magic character.
   */
  def getManaPoints: Int

  /** Sets the mana points of the magic character to the specified value.
   *
   *  @param x The value to set the mana points to.
   */
  def setManaPoints(x: Int): Unit

  /** Uses a thunder spell on the specified target.
   *
   *  @param target The game unit to cast the thunder spell on.
   */
  def useSpell(s: Spell, target: GameUnit): Unit

}
