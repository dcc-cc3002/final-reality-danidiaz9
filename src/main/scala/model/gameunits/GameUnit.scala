package model.gameunits

import model.effects.Effect
import model.gameunits.character.Character
import model.gameunits.enemies.Enemy
import model.spells.dark.{Fire, Thunder}
import model.spells.light.{Paralysis, Poison}

/** Trait representing a character in the game.
 *
 * This trait defines the basic properties and behaviors of a character,
 * such as name, health points, defense, weight, and actions.
 */
trait GameUnit {
  /** The name of the character.
   *
   */
  val name: String

  /** The weight of the character.
   *
   */
  val weight: Double

  /** Returns the name of the character.
   *
   * @return The name of the character.
   */
  def getName: String

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int

  /** Sets the health points of the character to the specified value.
   *
   *  @param x The value to set the health points to.
   */
  def setHealthPoints(x: Int): Unit

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double

  /** Sets the action bar value of the character to the specified value.
   *
   * @param x The value to set the action bar to.
   */
  def setActionBar(x: Double): Unit

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double

  /** Calculates and returns the maximum value of the action bar for the character.
   *
   *  @return The maximum value of the action bar for the character.
   */
  def calculateMaxWeight: Double

  /** Attack a game character.
   *
   *  @param target The game unit to attack.
   */
  def attackCharacter(target: Character): Unit

  /** Attack a game enemy.
   *
   * @param target The game unit to attack.
   */
  def attackEnemy(target: Enemy): Unit

  /** Receive an attack and reduce health points accordingly.
   *
   *  @param damage The amount of damage received.
   */
  def receiveDamage(damage: Int): Unit

  /** Receive magic damage and reduce health points accordingly.
   *
   * @param magicDamage The amount of magic damage received.
   */
  def receiveMagicDamage(magicDamage: Int): Unit

  /** Receive healing from a spell.
   *
   */
  def receiveHealing(): Unit

  /**
   * Apply an effect to the game unit.
   *
   * @param effect The effect to apply.
   */
  def appliedEffect(effect: Effect): Unit

  /**
   * Apply fire spell to the game unit.
   *
   * @param fire The fire spell to apply.
   * @param from The character applying the spell.
   */
  def applyFire(fire: Fire, from: Character): Unit

  /**
   * Apply thunder spell to the game unit.
   *
   * @param thunder The thunder spell to apply.
   * @param from The character applying the spell.
   */
  def applyThunder(thunder: Thunder, from: Character): Unit

  /**
   * Apply paralysis spell to the game unit.
   *
   * @param paralysis The paralysis spell to apply.
   * @param from The character applying the spell.
   */
  def applyParalysis(paralysis: Paralysis, from: Character): Unit

  /**
   * Apply poison spell to the game unit.
   *
   * @param poison The poison spell to apply.
   * @param from The character applying the spell.
   */
  def applyPoison(poison: Poison, from: Character): Unit

}