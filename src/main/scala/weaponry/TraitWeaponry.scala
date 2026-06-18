package weaponry

import characters.AbstractCharacter
import characters.player.TraitPlayer

/** A trait representing weaponry in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 */
trait TraitWeaponry {

  /** The name of the weapon. */
  val _name: String

  /** The attack points of the weapon. */
  val _attackPoints: Int

  /** The weight of the weapon. */
  val _weight: Double

  var _owner: TraitPlayer

  def getName: String

  def getAttackPoints: Int

  def getWeight: Double

  def getOwner: TraitPlayer

  def setOwner(owner: TraitPlayer): Unit

}
