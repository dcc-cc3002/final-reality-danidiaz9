package characters.player.commons

import weaponry.TraitWeaponry
import java.util.Objects

/** A class representing a paladin character in the game.
 *
 *  @constructor Creates a new paladin character with the specified name, health points, defense, and weight.
 *  @param name The name of the paladin character.
 *  @param healthPoints The current health points of the paladin character.
 *  @param defense The defense points of the paladin character.
 *  @param weight The weight of the paladin character.
 *  @param weapon The weapon equipped by the paladin character.
 */
class Paladin(name: String,
            healthPoints: Int,
            defense: Int,
            weight: Double,
            weapon: Option[TraitWeaponry]) extends
            AbstractCommonP(name, healthPoints, defense, weight, weapon) {

  def canEqual(that: Any): Boolean = that.isInstanceOf[Paladin]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Paladin]
      getName == other.getName &&
        getHealthPoints == other.getHealthPoints &&
        getDefense == other.getDefense &&
        getWeight == other.getWeight &&
        getWeapon == other.getWeapon
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Paladin],
    getName, getHealthPoints, getDefense, getWeight, getWeapon)

  override def toString: String = s"Paladin {" +
    s"name: $getName, " +
    s"healthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"weapon: $getWeapon" +
    s"}"

}
