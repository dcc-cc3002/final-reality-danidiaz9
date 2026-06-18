package weaponry

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
                                 val name: String,
                                 val attackPoints: Int,
                                 val weight: Double) extends TWeaponry {

  var owner: Option[Character] = _

  override def setOwner(owner: Option[Character]): Unit = this.owner = owner

  /** Returns the name of the weapon. */
  def getName: String = name

  /** Returns the attack points of the weapon. */
  def getAttackPoints: Int = attackPoints

  /** Returns the weight of the weapon. */
  def getWeight: Double = weight

  /** Returns the owner of the weapon. */
  def getOwner: Option[Character] = owner

}
