package model.weapons.magics

import model.weapons.Weapon

/** A trait representing magic weapons in the game.
 *
 *  Magic weapons include attributes such as magic attack points in addition to the standard weapon attributes.
 */
trait MagicWeapon extends Weapon {

  /** The magic attack points of the weapon. */
  val magicAttackPoints: Int

  /** Returns the magic attack points of the weapon.
   *
   *  @return The magic attack points of the weapon.
   */
  def getMagicAttackPoints: Int

}
