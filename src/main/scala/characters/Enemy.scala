package characters

import java.util.Objects

/** A class representing an enemy character in the game.
 *
 *  @constructor Creates a new enemy with the specified name, health points, attack points, defense, and weight.
 *  @param name The name of the enemy.
 *  @param healthPoints The current health points of the enemy.
 *  @param attackPoints The attack points of the enemy.
 *  @param defense The defense points of the enemy.
 *  @param weight The weight of the enemy.
 */
class Enemy(_name: String,
            _healthPoints: Int,
            val _attackPoints: Int,
            _defense: Int,
            _weight: Double) extends
            AbstractCharacter(_name, _healthPoints, _defense, _weight) {

}

  //override def canEqual(that: Any): Boolean = that.isInstanceOf[Enemy]

//  override def equals(that: Any): Boolean = {
  //  if (canEqual(that)) {
    //  val other = that.asInstanceOf[Enemy]
      //name == other.name &&
     // healthPoints == other.healthPoints &&
     // attackPoints == other.attackPoints &&
     // defense == other.defense &&
    //  weight == other.weight
   // }
   // else false
 // }

 // override def hashCode: Int = Objects.hash(classOf[Enemy],
  //  name, healthPoints, attackPoints, defense, weight)

//  override def toString: String = s"Enemy {" +
//    s"name: $name, " +
  //  s"healthPoints: $healthPoints, " +
  //  s"attackPoints: $attackPoints, " +
  //  s"defense: $defense, " +
  //  s"weight: $weight" +
  //  s"}"

 // override def equipWeapon: Boolean = false
//}
