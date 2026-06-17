package controller

import model.gameunits.character.Character
import model.gameunits.GameUnit
import model.gameunits.enemies.Enemy

import scala.collection.mutable

/**
 * Manages the turn-based scheduling of game units.
 *
 * @constructor Creates a turn scheduler with the provided list of game units.
 * @param gameUnits The list of game units participating in the turn-based system.
 */
class TurnScheduler(gameUnits: List[GameUnit]) {

  /** Map to store the action bars of each game unit. */
  private val actionBars = mutable.Map.empty[GameUnit, Double]

  // Initialize action bars for each game unit with 0.0
  gameUnits.foreach(actionBars += _ -> 0.0)

  /** Returns a map of game units with their current action bars. */
  private def getActionBars: Map[GameUnit, Double] = actionBars.toMap

  /** Queue to manage the turn order of game units based on their action bars. */
  private val turnsQueue = mutable.Queue.empty[GameUnit]

  /** Increases the action bar of all game units by a specified amount.
   *
   *  @param k The amount to increase the action bars by.
   */
  private def increaseActionBar(k: Int): Unit = {
    getActionBars.foreach{
      case (gameUnit: GameUnit, actionBar: Double) => actionBars(gameUnit) += k
        if(gameUnit.calculateMaxWeight <= actionBar){
          turnsQueue.enqueue(gameUnit)
        }
    }
  }

  /** Resets the action bars of all game units to 0.0. */
  private def resetActionBar(): Unit = {
    gameUnits.foreach(actionBars += _ -> 0.0)
  }

  /** Simulates a combat sequence between a character and an enemy.
   *
   *  @param u1 The character initiating the attack.
   *  @param u2 The enemy being attacked.
   */
  def combat(u1: Character, u2: Enemy): Unit = {
    u1.attackEnemy(u2)
    u2.attackCharacter(u1)
  }
}