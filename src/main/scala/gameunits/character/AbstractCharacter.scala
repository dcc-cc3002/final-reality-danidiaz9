package gameunits.character

import exceptions.{InvalidAttackException, InvalidEquipException, InvalidSpellException}
import gameunits.Enemy
import weapons.Weapon
import weapons.commons.{Axe, Bow, Sword}
import weapons.magics.{Staff, Wand}

/** An abstract class representing a character-controlled character in the game.
 *
 *  @constructor Creates a new character with the specified name, health points, defense, weight, and weapons.
 *  @param name The name of the character.
 *  @param maxHealthPoints The maximum health points of the character.
 *  @param currentHealthPoints The current health points of the character.
 *  @param defense The defense points of the character.
 *  @param weight The weight of the character.
 *  @param weapon The weapon equipped by the character, represented as an optional trait weapons.
 */
abstract class AbstractCharacter(val name: String,
                                 val maxHealthPoints: Int,
                                 var currentHealthPoints: Int,
                                 val defense: Int,
                                 val weight: Double,
                                 private var weapon: Option[Weapon] = None) extends Character {

  /** The action bar of the character. */
  var actionBar: Double = 0.0

  /** Sets the action bar value of the character to the specified value.
   *
   * @param x The value to set the action bar to.
   */
  def setActionBar(x: Double): Unit = {
    actionBar = x
  }

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

  /** Sets the health points of the character to the specified value.
   *
   *  @param x The value to set the health points to.
   */
  def setHealthPoints(x: Int): Unit = {
    currentHealthPoints = x
  }

  /** Returns the weapons equipped by the character.
   *
   *  @return The weapons equipped by the character.
   */
  def getWeapon: Option[Weapon] = weapon

  /** Sets the weapons to be equipped by the character.
   *
   *  @param w The weapons to be equipped by the character.
   */
  def equipWeapon(w: Weapon): Unit = {
   if (getWeapon.isDefined){
     throw new InvalidEquipException("This character already has a weapon.")
   }
   else{
     weapon = Some(w)
     w.setOwner(this)
   }
  }

  /** Equips an axe to the character.
   *
   *  @param axe The axe to be equipped.
   */
  def equipAxe(axe: Axe): Unit =
    throw new InvalidEquipException("Player cannot has this weapon.")

  /** Equips a bow to the character.
   *
   *  @param bow The bow to be equipped.
   */
  def equipBow(bow: Bow): Unit =
    throw new InvalidEquipException("Player cannot has this weapon.")

  /** Equips a sword to the character.
   *
   *  @param sword The sword to be equipped.
   */
  def equipSword(sword: Sword): Unit =
    throw new InvalidEquipException("Player cannot has this weapon.")

  /** Equips a wand to the character.
   *
   *  @param wand The wand to be equipped.
   */
  def equipWand(wand: Wand): Unit =
    throw new InvalidEquipException("Player cannot has this weapon.")

  /** Equips a staff to the character.
   *
   *  @param staff The staff to be equipped.
   */
  def equipStaff(staff: Staff): Unit =
    throw new InvalidEquipException("Player cannot has this weapon.")

  /**
   * Unequips the weapon currently equipped by the character.
   */
  def unEquipWeapon(): Unit = {
    weapon = None
  }

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double = actionBar

  /** Calculates the maximum action bar of the character.
   *
   *  @return The maximum action bar of the character.
   */
  def calculateMaxActionBar: Double = {
    val charWeight = this.getWeight
    val weaponWeight = this.getWeapon.get.getWeight
    val maxActionBar = charWeight + 0.5 * weaponWeight
    maxActionBar

  }

  /** Receives an attack from an enemy.
   *
   *  @param damage The amount of damage received.
   */
  def receiveDamage(damage: Int): Unit = {
    val enemyDamage = damage - this.getDefense
    this.setHealthPoints(this.getHealthPoints - enemyDamage)
  }

  def receiveMagicDamage(magicDamage: Int): Unit = {
    throw new InvalidAttackException("Invalid target.")
  }

  /** Attacks another game unit.
   *
   *  @param target The game unit to attack.
   */
  override def attackCharacter(target: Character): Unit = {
    throw new InvalidAttackException("Invalid target.")
  }

  override def attackEnemy(target: Enemy): Unit = {
    if (getWeapon.isDefined) {
      target.receiveDamage(this.getWeapon.get.getAttackPoints)
    }
    else {
      throw new InvalidAttackException("Character needs a weapon to attack.")
    }
  }

  /** Receives healing from a spell.
   *
   */
  def receiveHealing(): Unit = {
    if (this.getHealthPoints <= 0){
      throw new InvalidSpellException("Character is dead")
    }

    else {
      if (getHealthPoints + 0.3 * maxHealthPoints <= maxHealthPoints){
        setHealthPoints(currentHealthPoints + (0.3 * maxHealthPoints).toInt)
      }
      else{
        currentHealthPoints = maxHealthPoints
      }
    }
  }

}
