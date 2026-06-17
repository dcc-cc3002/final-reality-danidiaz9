import gameunits.GameUnit
import gameunits.character.Character

import scala.collection.mutable.ArrayBuffer

/** A class representing a turn scheduler in the game.
 *
 *  This class manages the turn order of gameunits during combat by handling their action bars.
 */
class TurnScheduler {

  /** The loading zone where gameunits wait for their action bars to fill up. */
  val loadingZone: ArrayBuffer[GameUnit] = new ArrayBuffer()

  /** The waiting zone where gameunits with filled action bars wait for their turn. */
  val waitingZone: ArrayBuffer[GameUnit] = new ArrayBuffer()

  /** Adds a character to the loading zone.
   *
   *  @param c The character to add to the loading zone.
   */
  def addLoadingZone(c: GameUnit): Unit = {
    loadingZone += c
  }

  /** Removes a character from the loading zone.
   *
   *  @param c The character to remove from the loading zone.
   */
  def removeLoadingZone(c: GameUnit): Unit = {
    loadingZone -= c
  }

  /** Adds a character to the waiting zone.
   *
   *  @param c The character to add to the waiting zone.
   */
  def addWaitingZone(c: GameUnit): Unit = {
    waitingZone += c
  }

  /** Removes a character from the waiting zone.
   *
   *  @param c The character to remove from the waiting zone.
   */
  def removeWaitingZone(c: GameUnit): Unit = {
    waitingZone -= c
  }

  /** Returns the actual action bar value of a character.
   *
   *  @param c The character whose action bar value to retrieve.
   *  @return The difference between the character's current action bar and its maximum action bar.
   */
  private def excessActionBar(c: GameUnit): Double = {
     c.getActionBar - c.calculateMaxActionBar
  }

  /** Updates the action bar of a character.
   *
   *  @param c The character whose action bar to update.
   *  @param k The amount to increase the character's action bar by.
   */
  private def updateActionBar(c: GameUnit, k: Int): Unit = {
    c.actionBar += k
  }

  /** Resets the action bar of a character to zero.
   *
   *  @param c The character whose action bar to reset.
   *  @return The new action bar value, which is always 0.0.
   */
  private def resetActionBar(c: GameUnit): Unit ={
    c.actionBar = 0.0
  }

  /** Resets the action bars of all gameunits in the waiting zone to zero. */
  def resetActionBarInstance(): Unit = {
    for (c <- waitingZone){
      resetActionBar(c)
    }
  }

  /** Updates the action bars of all gameunits in the loading zone.
   *
   *  @param k The amount to increase each character's action bar by.
   */
  def updateLoadingZone(k: Int): Unit = {
    for (c <- loadingZone){
      updateActionBar(c,k)
    }
  }

  /** Completes the action bars of gameunits in the loading zone and moves them to the waiting zone. */
  def completeActionBar(): Unit = {
    for (c <- loadingZone) {
      if (excessActionBar(c) > 0) {
        addWaitingZone(c)
      }
    }
  }

  /** Sorts the gameunits in the waiting zone by their excess action bars. */
  def sortTurns(): Unit = {
    waitingZone.sortBy(c => -excessActionBar(c))
  }

  /** Simulates combat between a character character and an enemy character.
   *
   *  @param player The character character.
   *  @param enemy The enemy character.
   */
  def combatPlayer(player: Character, enemy: GameUnit): Unit = {

    val playerDamage = player.attack - enemy.getDefense
    enemy.setHealthPoints(enemy.getHealthPoints - playerDamage)

    if (enemy.getHealthPoints > 0) {
      println(s"Damage inflicted: $playerDamage")
    }
    else {
      println(s"${enemy.getName} defeated")
    }

  }

  /** Simulates combat between an enemy character and a character character.
   *
   *  @param enemy The enemy character.
   *  @param player The character character.
   */
  def combatEnemy(enemy: GameUnit, player: Character): Unit = {

    val enemyDamage = enemy.attack - player.getDefense
    player.setHealthPoints(player.getHealthPoints - enemyDamage)

    if (player.getHealthPoints > 0) {
      println(s"Damage inflicted: $enemyDamage")
    }
    else {
      println(s"${player.getName} defeated")
    }
  }
}
