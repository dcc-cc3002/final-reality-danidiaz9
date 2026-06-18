package characters.magic

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
 */

class BlackWizard(name: String,
                  healthPoints: Int,
                  defense: Int,
                  weight: Double,
                  manaPoints: Int) extends
  AbstractMagical(name, healthPoints, defense, weight, manaPoints) with Equals {

  /** The magical weapon equipped by the black wizard character. */
  //var equipMagicWeapon: Null = _

  override def canEqual(that: Any): Boolean = that.isInstanceOf[BlackWizard]
    
  override def equals(that: Any): Boolean = {
      if (canEqual(that)) {
          val other = that.asInstanceOf[BlackWizard]
          name == other.name &&
          healthPoints == other.healthPoints && 
          defense == other.defense &&
          weight == other.weight &&
          manaPoints == other.manaPoints
      }
      else false
  }
    
  override def hashCode: Int = Objects.hash(classOf[BlackWizard], 
    name, healthPoints, defense, weight, manaPoints)
    
  override def toString: String = s"BlackWizard {" + 
      s"name: $name, " +
      s"healthPoints: $healthPoints, " + 
      s"defense: $defense, " +
      s"weight: $weight, " +
      s"manaPoints: $manaPoints" +
      s"}"
}
