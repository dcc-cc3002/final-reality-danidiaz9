package characters.player.commons

import weaponry.TraitWeaponry
import java.util.Objects


/** A class representing a ninja character in the game.
 *
 *  @constructor Creates a new ninja character with the specified name, health points, defense, and weight.
 *  @param name The name of the ninja character.
 *  @param healthPoints The current health points of the ninja character.
 *  @param defense The defense points of the ninja character.
 *  @param weight The weight of the ninja character.
 *  @param weapon The weapon equipped by the ninja character.
 */
class Ninja(name: String,
            healthPoints: Int,
            defense: Int,
            weight: Double,
            weapon: Option[TraitWeaponry]) extends
            AbstractCommonP(name, healthPoints, defense, weight, weapon) {

  def canEqual(that: Any): Boolean = that.isInstanceOf[Ninja]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Ninja]
      getName == other.getName &&
      getHealthPoints == other.getHealthPoints &&
      getDefense == other.getDefense &&
      getWeight == other.getWeight &&
      getWeapon == other.getWeapon
    }
    else false
    }

    override def hashCode: Int = Objects.hash(classOf[Ninja],
      getName, getHealthPoints, getDefense, getWeight, getWeapon)

    override def toString: String = s"Ninja {" +
      s"name: $getName, " +
      s"healthPoints: $getHealthPoints, " +
      s"defense: $getDefense, " +
      s"weight: $getWeight, " +
      s"weapon: $getWeapon" +
      s"}"
}
