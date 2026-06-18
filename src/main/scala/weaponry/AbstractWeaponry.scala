package weaponry

import characters.player.TraitPlayer

/** An abstract class representing a type of weaponry in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 *
 *  @constructor Creates a new instance of AbstractWeaponry with the specified attributes.
 *  @param name The name of the weapon.
 *  @param attackPoints The attack points of the weapon.
 *  @param weight The weight of the weapon.
 *  @param owner The owner of the weapon, represented as an optional character.
 */
abstract class AbstractWeaponry(
                                 val name: String,
                                 val attackPoints: Int,
                                 val weight: Double,
                                 protected var owner: Option[TraitPlayer] = None
                               ) extends TraitWeaponry {


  /** Returns the name of the weapon.
   *
   *  @return The name of the weapon.
   */
  def getName: String = name

  /** Returns the attack points of the weapon.
   *
   *  @return The attack points of the weapon.
   */
  def getAttackPoints: Int = attackPoints

  /** Returns the weight of the weapon.
   *
   *  @return The weight of the weapon.
   */
  def getWeight: Double = weight

  /** Returns the owner of the weapon.
   *
   *  @return The owner of the weapon.
   */
  def getOwner: Option[TraitPlayer] = owner

  /** Sets the owner of the weapon.
   *
   *  @param o The owner of the weapon.
   */
  def setOwner(o: TraitPlayer): Unit = {
    owner = Some(o)
  }

}
