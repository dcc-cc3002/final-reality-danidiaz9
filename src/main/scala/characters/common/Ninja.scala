package characters.common

import java.util.Objects

/** A class representing a ninja character in the game.
 *
 *  @constructor Creates a new ninja character with the specified name, health points, defense, and weight.
 *  @param name The name of the ninja character.
 *  @param healthPoints The current health points of the ninja character.
 *  @param defense The defense points of the ninja character.
 *  @param weight The weight of the ninja character.
 */
class Ninja(name: String,
            healthPoints: Int,
            defense: Int,
            weight: Double) extends
  AbstractCommon(name, healthPoints, defense, weight) with Equals {

  /** The weapon equipped by the ninja character. */
  //var equipWeapon: Null = _

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Ninja]
    
  override def equals(that: Any): Boolean = {
      if (canEqual(that)) {
          val other = that.asInstanceOf[Ninja]
          name == other.name && 
          healthPoints == other.healthPoints && 
          defense == other.defense &&
          weight == other.weight
      }
      else false
  }
    
  override def hashCode: Int = Objects.hash(classOf[Ninja], name, healthPoints, defense, weight)
    
  override def toString: String = s"Ninja {" + 
      s"name: $name, " +
      s"healthPoints: $healthPoints, " + 
      s"defense: $defense, " +
      s"weight: $weight" + 
      s"}"
}
