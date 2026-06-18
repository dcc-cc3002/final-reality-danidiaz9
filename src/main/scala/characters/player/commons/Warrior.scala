package characters.player.commons

import weaponry.TraitWeaponry
import weaponry.weapons.commons.AbstractCommonW

import java.util.Objects

/** A class representing a warrior character in the game.
 *
 *  @constructor Creates a new warrior character with the specified name, health points, defense, and weight.
 *  @param name The name of the warrior character.
 *  @param healthPoints The current health points of the warrior character.
 *  @param defense The defense points of the warrior character.
 *  @param weight The weight of the warrior character.
 */
class Warrior(_name: String,
            _healthPoints: Int,
            _defense: Int,
            _weight: Double,
            _weapon: TraitWeaponry = _) extends
  AbstractCommonP(_name, _healthPoints, _defense, _weight, _weapon) {

}
  /** The weapon equipped by the warrior character. */
  //var equipWeapon: Null = _

 // override var actionPoints = 0.0

 // override var actionBar: Double = weight + 0.5*Weapon.getWeight

 // override def canEqual(that: Any): Boolean = that.isInstanceOf[Warrior]
    
//  override def equals(that: Any): Boolean = {
 //     if (canEqual(that)) {
 //         val other = that.asInstanceOf[Warrior]
  //        name == other.name &&
  //        healthPoints == other.healthPoints &&
  //        defense == other.defense &&
   //       weight == other.weight
   //   }
    //  else false
 // }
    
 // override def hashCode: Int = Objects.hash(classOf[Warrior], name, healthPoints, defense, weight)
    
//  override def toString: String = s"Warrior {" +
 //     s"name: $name, " +
  //    s"healthPoints: $healthPoints, " +
   //   s"defense: $defense, " +
    //  s"weight: $weight" +
    //  s"}"
//}
