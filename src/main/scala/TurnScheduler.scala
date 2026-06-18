
import characters.player.TraitPlayer
import characters.{Party, TraitCharacter}

import scala.collection.mutable.ArrayBuffer

class TurnScheduler {

  private val loadingZoneP: ArrayBuffer[TraitPlayer] = new ArrayBuffer()
  private val waitingZoneP: ArrayBuffer[TraitPlayer] = new ArrayBuffer()
  private val loadingZoneE: ArrayBuffer[TraitCharacter] = new ArrayBuffer()
  private val waitingZoneE: ArrayBuffer[TraitCharacter] = new ArrayBuffer()

  def addLoadingZoneP(c: TraitPlayer): Unit = {
    loadingZoneP += c
  }

  def removeLoadingZoneP(c: TraitPlayer): Unit = {
    loadingZoneP -= c
  }

  private def addWaitingZoneP(c: TraitPlayer): Unit = {
    waitingZoneP += c
  }

  def removeWaitingZoneP(c: TraitPlayer): Unit = {
    waitingZoneP -= c
  }

  def addLoadingZoneE(e: TraitCharacter): Unit = {
    loadingZoneE += e
  }

  def removeLoadingZoneE(e: TraitCharacter): Unit = {
    loadingZoneE -= e
  }

  private def addWaitingZoneE(e: TraitCharacter): Unit = {
    waitingZoneE += e
  }

  def removeWaitingZoneE(e: TraitCharacter): Unit = {
    waitingZoneE -= e
  }

  private def calculateMaxActionBarC(c: TraitPlayer): Double = {
    val charWeight = c.getWeight
    val weaponWeight = c.getWeapon.getWeight
    val maxActionBarC = charWeight + 0.5 * weaponWeight
    maxActionBarC

  }

  private def calculateMaxActionBarE(e: TraitCharacter): Double = {
    val enemyWeight = e.getWeight
    val maxActionBarE = enemyWeight
    maxActionBarE

  }

  def actualActionBarC(c: TraitPlayer): Double = {
     c.getActionBar - calculateMaxActionBarC(c)
  }
  def actualActionBarE(e: TraitCharacter): Double = {
     e.getActionBar - calculateMaxActionBarE(e)
  }

  private def updateActionBarC(c: TraitPlayer, k: Int): Unit = {
    c.actionBar += k
  }

  def updateActionBarE(e: TraitCharacter, k: Int): Unit = {
    e.actionBar += k
  }

  private def resetActionBarC(c: TraitPlayer): Double ={
    c.actionBar = 0.0
    c.actionBar
  }

  def resetActionBarParty(): Unit = {
    for (c <- waitingZoneP){
      resetActionBarC(c)
    }
  }

  def resetActionBarE(e: TraitCharacter): Double = {
    e.actionBar = 0.0
    e.actionBar
  }

  def updateLoadingZoneP(k: Int): Unit = {
    for (c <- loadingZoneP){
      updateActionBarC(c,k)
    }
  }

  def updateLoadingZoneE(k: Int): Unit = {
    for (e <- loadingZoneE){
      updateActionBarE(e,k)
    }
  }

  def completeActionBarP(): Unit = {
    val turnsP: ArrayBuffer[TraitPlayer] = new ArrayBuffer[TraitPlayer]()
    for (c <- loadingZoneP) {
      addWaitingZoneP(c)
    }
    for (c <- waitingZoneP) {
      if (c.getActionBar >= calculateMaxActionBarC(c)) {
        turnsP += c
      }
    }
  }


  def completeActionBarE(): Unit = {
    val turnsE: ArrayBuffer[TraitCharacter] = new ArrayBuffer[TraitCharacter]()
    for (e <- loadingZoneE){
      addWaitingZoneE(e)
    }
    for (e <- waitingZoneE){
      if (e.getActionBar >= calculateMaxActionBarE(e)){
        turnsE += e
      }
    }
  }

  val turns: Unit = {

  }
}
