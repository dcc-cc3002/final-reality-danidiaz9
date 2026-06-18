package characters.common

import java.util.Objects

/** A class representing a warrior character in the game.
 *
 *  @constructor Creates a new warrior character with the specified name, health points, defense, and weight.
 *  @param name The name of the warrior character.
 *  @param healthPoints The current health points of the warrior character.
 *  @param defense The defense points of the warrior character.
 *  @param weight The weight of the warrior character.
 */
class Warrior(name: String,
              healthPoints: Int,
              defense: Int,
              weight: Double) extends
  AbstractCommon(name, healthPoints, defense, weight) with Equals {

  /** The weapon equipped by the warrior character. */
  //var equipWeapon: Null = _

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Warrior]
    
  override def equals(that: Any): Boolean = {
      if (canEqual(that)) {
          val other = that.asInstanceOf[Warrior]
          name == other.name && 
          healthPoints == other.healthPoints && 
          defense == other.defense &&
          weight == other.weight
      }
      else false
  }
    
  override def hashCode: Int = Objects.hash(classOf[Warrior], name, healthPoints, defense, weight)
    
  override def toString: String = s"Warrior {" + 
      s"name: $name, " +
      s"healthPoints: $healthPoints, " + 
      s"defense: $defense, " +
      s"weight: $weight" + 
      s"}"
}
