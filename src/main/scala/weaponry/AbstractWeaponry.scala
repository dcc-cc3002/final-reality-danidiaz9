package weaponry

import characters.AbstractCharacter
import characters.player.TraitPlayer

/** An abstract class representing a type of weaponry in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 *
 *  @param name The name of the weapon.
 *  @param attackPoints The attack points of the weapon.
 *  @param weight The weight of the weapon.
 *  @param owner The owner of the weapon, represented as an optional character.
 */
abstract class AbstractWeaponry(
                                 val _name: String,
                                 val _attackPoints: Int,
                                 val _weight: Double,
                                 var _owner: TraitPlayer = _
                               ) extends TraitWeaponry {


  /** Returns the name of the weapon. */
  def getName: String = _name

  /** Returns the attack points of the weapon. */
  def getAttackPoints: Int = _attackPoints

  /** Returns the weight of the weapon. */
  def getWeight: Double = _weight

  /** Returns the owner of the weapon. */
  def getOwner: TraitPlayer = _owner

  protected def setOwner(owner: TraitPlayer): Unit = {
    _owner = owner
  }

}
