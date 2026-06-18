package characters.player.commons

import weaponry.TraitWeaponry
import java.util.Objects

/** A class representing a warrior character in the game.
 *
 *  @constructor Creates a new warrior character with the specified name, health points, defense, and weight.
 *  @param name The name of the warrior character.
 *  @param healthPoints The current health points of the warrior character.
 *  @param defense The defense points of the warrior character.
 *  @param weight The weight of the warrior character.
 *  @param weapon The weapon equipped by the warrior character.
 */
class Warrior(name: String,
            healthPoints: Int,
            defense: Int,
            weight: Double,
            weapon: Option[TraitWeaponry]) extends
            AbstractCommonP(name, healthPoints, defense, weight, weapon) {

  def canEqual(that: Any): Boolean = that.isInstanceOf[Warrior]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Warrior]
      getName == other.getName &&
        getHealthPoints == other.getHealthPoints &&
        getDefense == other.getDefense &&
        getWeight == other.getWeight &&
        getWeapon == other.getWeapon
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Warrior],
    getName, getHealthPoints, getDefense, getWeight, getWeapon)

  override def toString: String = s"Warrior {" +
    s"name: $getName, " +
    s"healthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"weapon: $getWeapon" +
    s"}"

}
