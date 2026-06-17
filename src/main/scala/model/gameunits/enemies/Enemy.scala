package model.gameunits.enemies

import model.gameunits.AbstractUnit

import java.util.Objects

/** A class representing an enemy character in the game.
 *
 *  @constructor Creates a new enemy with the specified name, health points, attack points, defense, and weight.
 *  @param name The name of the enemy.
 *  @param maxHealthPoints The maximum health points of the enemy.
 *  @param currentHealthPoints The current health points of the enemy.
 *  @param attackPoints The attack points of the enemy.
 *  @param defense The defense points of the enemy.
 *  @param weight The weight of the enemy.
 */
class Enemy(name: String,
            maxHealthPoints: Int,
            currentHealthPoints: Int,
            attackPoints: Int,
            defense: Int,
            weight: Double) extends
            AbstractUnit(name, maxHealthPoints, currentHealthPoints, attackPoints, defense, weight) {

  def canEqual(that: Any): Boolean = that.isInstanceOf[Enemy]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Enemy]
      getName == other.getName &&
      getHealthPoints == other.getHealthPoints &&
      getAttackPoints == other.getAttackPoints &&
      getDefense == other.getDefense &&
      getWeight == other.getWeight
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Enemy],
    getName, getHealthPoints, getAttackPoints, getDefense, getWeight)

  override def toString: String = s"Enemy {" +
    s"name: $getName, " +
    s"currentHealthPoints: $getHealthPoints, " +
    s"attackPoints: $getAttackPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight" +
    s"}"
}
