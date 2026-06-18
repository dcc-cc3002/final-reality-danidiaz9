package characters.player.magics

import weaponry.TraitWeaponry
import java.util.Objects

/** A class representing a black wizard character in the game.
 *
 *  @constructor Creates a new black wizard character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the black wizard character.
 *  @param healthPoints The current health points of the black wizard character.
 *  @param defense The defense points of the black wizard character.
 *  @param weight The weight of the black wizard character.
 *  @param manaPoints The current mana points of the black wizard character.
 *  @param weapon The weapon equipped by the black wizard character.
 */

class BlackWizard(name: String,
                  healthPoints: Int,
                  defense: Int,
                  weight: Double,
                  manaPoints: Int,
                  weapon: Option[TraitWeaponry]) extends
                  AbstractMagicalP(name, healthPoints, defense, weight, manaPoints, weapon) {

  def canEqual(that: Any): Boolean = that.isInstanceOf[BlackWizard]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[BlackWizard]
      getName == other.getName &&
        getHealthPoints == other.getHealthPoints &&
        getDefense == other.getDefense &&
        getWeight == other.getWeight &&
        getManaPoints == other.getManaPoints &&
        getWeapon == other.getWeapon
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[BlackWizard],
    getName, getHealthPoints, getDefense, getWeight, getManaPoints, getWeapon)

  override def toString: String = s"BlackWizard {" +
    s"name: $getName, " +
    s"healthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"manaPoints: $getManaPoints, " +
    s"weapon: $getWeapon" +
    s"}"
}
