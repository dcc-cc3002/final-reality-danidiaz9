package characters.player.magics

import weaponry.TraitWeaponry
import weaponry.weapons.magics.AbstractMagicalW

import java.util.Objects

/** A class representing a white wizard character in the game.
 *
 *  @constructor Creates a new white wizard character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the white wizard character.
 *  @param healthPoints The current health points of the white wizard character.
 *  @param defense The defense points of the white wizard character.
 *  @param weight The weight of the white wizard character.
 *  @param manaPoints The current mana points of the white wizard character.
 */

class WhiteWizard(_name: String,
                  _healthPoints: Int,
                  _defense: Int,
                  _weight: Double,
                  _manaPoints: Int,
                  _weapon: TraitWeaponry = _) extends
  AbstractMagicalP(_name, _healthPoints, _defense, _weight, _manaPoints, _weapon) {

}

  ///** The magical weapon equipped by the white wizard character. */
  //var equipMagicWeapon: Null = _

//  override var actionPoints = 0.0

//  override var actionBar: Double = weight + 0.5*MagicalWeapon.getWeight

//  override def canEqual(that: Any): Boolean = that.isInstanceOf[WhiteWizard]
    
//  override def equals(that: Any): Boolean = {
  ///    if (canEqual(that)) {
//          val other = that.asInstanceOf[WhiteWizard]
       //   name == other.name &&
     //     healthPoints == other.healthPoints &&
         // defense == other.defense &&
         // weight == other.weight &&
       //   manaPoints == other.manaPoints
    //  }
    //  else false
//  }
    
  //override def hashCode: Int = Objects.hash(classOf[WhiteWizard],
  //  name, healthPoints, defense, weight, manaPoints)
    
 // override def toString: String = s"WhiteWizard {" +
  //    s"name: $name, " +
   //   s"healthPoints: $healthPoints, " +
   //   s"defense: $defense, " +
    //  s"weight: $weight, " +
    //  s"manaPoints: $manaPoints" +
    //  s"}"
//}