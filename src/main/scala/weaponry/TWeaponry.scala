package weaponry

/** A trait representing weaponry in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 */
trait TWeaponry {

  /** The name of the weapon. */
  val name: String

  /** The attack points of the weapon. */
  val attackPoints: Int

  /** The weight of the weapon. */
  val weight: Double

  /** The owner of the weapon, represented as an optional character. */


  def getOwner: Option[Character]
  def setOwner(owner: Option[Character]): Unit

}
