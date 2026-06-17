package model.weapons.magics

import model.gameunits.character.Character
import model.weapons.AbstractWeapon


/** A class representing a magical weapons in the game.
 *
 *  A magical weapons is a type of weapons that possesses magical properties, including additional
 *  magic attackCharacter points.
 *
 *  @constructor Creates a new instance of AbstractMagicWeapon with the specified attributes.
 *  @param name The name of the magical weapons.
 *  @param attackPoints The attackCharacter points of the magical weapons.
 *  @param weight The weight of the magical weapons.
 *  @param owner The owner of the magical weapons, represented as an optional character.
 *  @param magicAttackPoints The magic attackCharacter points of the magical weapons.
 */
abstract class AbstractMagicWeapon(name: String,
                                   attackPoints: Int,
                                   weight: Double,
                                   owner: Option[Character],
                                   val magicAttackPoints: Int) extends
                                   AbstractWeapon(name, attackPoints, weight, owner)
                                   with MagicWeapon {

  /** Returns the magic attack points of the weapon.
   *
   *  @return The magic attack points of the weapon.
   */
  override def getMagicAttackPoints: Int = magicAttackPoints


  }
