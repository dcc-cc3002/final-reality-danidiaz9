package weaponry.weapons.magics

import characters.AbstractCharacter
import characters.player.TraitPlayer
import weaponry.AbstractWeaponry


/** A class representing a magical weapon in the game.
 *
 *  A magical weapon is a type of weapon that possesses magical properties, including additional
 *  magic attack points.
 *
 *  @param name The name of the magical weapon.
 *  @param attackPoints The attack points of the magical weapon.
 *  @param weight The weight of the magical weapon.
 *  @param owner The owner of the magical weapon, represented as an optional character.
 *  @param magicAttackPoints The magic attack points of the magical weapon.
 */
abstract class AbstractMagicalW(_name: String,
                                _attackPoints: Int,
                                _weight: Double,
                                _owner: TraitPlayer = _,
                                val _magicAttackPoints: Int) extends
            AbstractWeaponry(_name, _attackPoints, _weight, _owner) {

}

    //override def canEqual(that: Any): Boolean = that.isInstanceOf[AbstractMagical]
    
    //override def equals(that: Any): Boolean = {
      //  if (canEqual(that)) {
        //    val other = that.asInstanceOf[AbstractMagical]
          //  name == other.name &&
            //attackPoints == other.attackPoints &&
      //      weight == other.weight &&
       //     owner == other.owner &&
        //    magicAttackPoints == other.magicAttackPoints
      //  }
       // else false
  //  }
    
   // override def hashCode: Int = Objects.hash(classOf[AbstractMagical],
     //   name, attackPoints, weight, owner, magicAttackPoints)
    
   // override def toString: String = s"MagicalWeapon {" +
     //   s"name: $name, " +
      //  s"attackPoints: $attackPoints, " +
       // s"weight: $weight, " +
       // s"owner: $owner, " +
       // s"magicAttackPoints: $magicAttackPoints" +
       // s"}"
//}
