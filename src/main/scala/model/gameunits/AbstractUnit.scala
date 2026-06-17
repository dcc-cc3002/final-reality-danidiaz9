package model.gameunits

import exceptions.{InvalidAttackException, InvalidSpellException, Require}
import model.effects.Effect
import model.gameunits.character.Character
import model.gameunits.enemies.Enemy
import model.spells.dark.{Fire, Thunder}
import model.spells.light.{Paralysis, Poison}

/** An abstract class representing a character in the game.
 *
 *  @constructor Creates a new character with the specified name, health points, defense, and weight.
 *  @param name The name of the character.
 *  @param maxHealthPoints The maximum health points of the character.
 *  @param currentHealthPoints The current health points of the character.
 *  @param attackPoints The attack points of the character.
 *  @param defense The defense points of the character.
 *  @param weight The weight of the character.
 */
abstract class AbstractUnit(val name: String,
                            val maxHealthPoints: Int,
                            protected var currentHealthPoints: Int,
                            val attackPoints: Int,
                            protected var defense: Int,
                            val weight: Double) extends GameUnit {

  Require.Stat(currentHealthPoints, "currentHealthPoints").atLeast(0)

  /** The action bar of the character. */
  var actionBar: Double = 0.0

  /** Returns the name of the character.
   *
   *  @return The name of the character.
   */
  def getName: String = name

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int = currentHealthPoints

  /** Sets the health points of the character to the specified value.
   *
   *  @param x The value to set the health points to.
   */
  def setHealthPoints(x: Int): Unit = {
    currentHealthPoints = x
  }

  /** Returns the attackCharacter points of the character.
   *
   *  @return The attackCharacter points of the character.
   */
  def getAttackPoints: Int = attackPoints

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int = defense

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double = weight

  /** Sets the action bar value of the character to the specified value.
   *
   * @param x The value to set the action bar to.
   */
  def setActionBar(x: Double): Unit = {
    actionBar = x
  }

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double = actionBar

  /** Calculates the maximum action bar value for the character based on its weight.
   *
   *  @return The maximum action bar value.
   */
  def calculateMaxWeight: Double = {
    val charWeight = this.getWeight
    charWeight

  }

  /** Attack another game unit.
   *
   *  @param target The game unit to attack.
   *  @throws InvalidAttackException if this game unit cannot attack an ally of the same type.
   */
  override def attackCharacter(target: Character): Unit = {
    target.receiveDamage(this.getAttackPoints)
  }

  /**
   * Throws InvalidAttackException since AbstractUnit cannot attack an enemy directly.
   *
   * @param target The enemy to attack.
   * @throws InvalidAttackException always thrown.
   */
  override def attackEnemy(target: Enemy): Unit = {
    throw new InvalidAttackException("Invalid target.")
  }

  /** Receive an attack and reduce health points accordingly.
   *
   *  @param damage The amount of damage received.
   */
  def receiveDamage(damage: Int): Unit = {
    val weaponDamage = damage - this.getDefense
    if(weaponDamage >= this.getHealthPoints){
      this.setHealthPoints(0)
    }
    else{
      this.setHealthPoints(this.getHealthPoints - weaponDamage)
    }

  }

  /** Receive magic damage and reduce health points accordingly.
   *
   * @param magicDamage The amount of magic damage received.
   */
  def receiveMagicDamage(magicDamage: Int): Unit = {
    val magicWeaponDamage = magicDamage - this.getDefense
    if (magicWeaponDamage >= getHealthPoints) {
      this.setHealthPoints(0)
    }
    else {
      this.setHealthPoints(this.getHealthPoints - magicWeaponDamage)
    }
  }

  /** Receive healing from a spell.
   *
   *  @throws InvalidSpellException if the spell cannot impact this unit.
   */
  def receiveHealing(): Unit =
    throw new InvalidSpellException("Spell cannot impact this unit.")

  /**
   * Applies an effect to the unit.
   *
   * @param effect The effect to apply.
   */
  def appliedEffect(effect: Effect): Unit = {
    println(s"$effect")
  }

  /**
   * Applies the fire spell effect to this unit.
   *
   * @param fire The fire spell to apply.
   * @param from The character applying the spell.
   */
  def applyFire(fire: Fire, from: Character): Unit = {
    fire.applyFireTo(this, from)
  }

  /**
   * Applies the thunder spell effect to this unit.
   *
   * @param thunder The thunder spell to apply.
   * @param from The character applying the spell.
   */
  def applyThunder(thunder: Thunder, from: Character): Unit = {
    thunder.applyThunderTo(this, from)
  }

  /**
   * Applies the paralysis spell effect to this unit.
   *
   * @param paralysis The paralysis spell to apply.
   * @param from The character applying the spell.
   */
  def applyParalysis(paralysis: Paralysis, from: Character): Unit = {
    paralysis.applyParalysisTo(this, from)
  }

  /**
   * Applies the poison spell effect to this unit.
   *
   * @param poison The poison spell to apply.
   * @param from The character applying the spell.
   */
  def applyPoison(poison: Poison, from: Character): Unit = {
    poison.applyPoisonTo(this, from)
  }
}
