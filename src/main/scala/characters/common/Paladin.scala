package characters.common

import java.util.Objects

/** A class representing a paladin character in the game.
 *
 *  @constructor Creates a new paladin character with the specified name, health points, defense, and weight.
 *  @param name The name of the paladin character.
 *  @param healthPoints The current health points of the paladin character.
 *  @param defense The defense points of the paladin character.
 *  @param weight The weight of the paladin character.
 */
class Paladin(name: String,
              healthPoints: Int,
              defense: Int,
              weight: Double) extends
  AbstractCommon(name, healthPoints, defense, weight) with Equals {

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Paladin]
    
  override def equals(that: Any): Boolean = {
      if (canEqual(that)) {
          val other = that.asInstanceOf[Paladin]
          name == other.name && 
          healthPoints == other.healthPoints && 
          defense == other.defense &&
          weight == other.weight
      }
      else false
  }
    
  override def hashCode: Int = Objects.hash(classOf[Paladin], name, healthPoints, defense, weight)
    
  override def toString: String = s"Paladin {" + 
      s"name: $name, " +
      s"healthPoints: $healthPoints, " + 
      s"defense: $defense, " +
      s"weight: $weight" + 
      s"}"
}
