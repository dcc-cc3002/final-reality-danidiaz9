package weaponry

import java.util.Objects

/** A class representing a weapon in the game.
 *
 *  A weapon is an object used to inflict damage or harm to opponents in the game.
 *
 *  @param name The name of the weapon.
 *  @param attackPoints The attack points of the weapon.
 *  @param weight The weight of the weapon.
 *  @param owner The owner of the weapon, represented as an optional character.
 */
class Weapon(name: String,
             attackPoints: Int,
             weight: Double,
             owner: Option[Character]) extends
             AbstractWeaponry(name, attackPoints, weight) with Equals {

    override def canEqual(that: Any): Boolean = that.isInstanceOf[Weapon]
    
    override def equals(that: Any): Boolean = {
        if (canEqual(that)) {
            val other = that.asInstanceOf[Weapon]
            name == other.name && 
            attackPoints == other.attackPoints && 
            weight == other.weight && 
            getOwner == other.getOwner
        }
        else false
    }
    
    override def hashCode: Int = Objects.hash(classOf[Weapon], name, attackPoints, weight)
    
    override def toString: String = s"Weapon {" + 
        s"name: $name, " +
        s"attackPoints: $attackPoints, " + 
        s"weight: $weight, " + 
        s"owner: $getOwner" +
        s"}"
}
