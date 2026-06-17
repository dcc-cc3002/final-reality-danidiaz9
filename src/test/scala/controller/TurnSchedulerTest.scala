package controller

import model.gameunits.GameUnit
import model.gameunits.character.Character
import model.gameunits.character.commons.Warrior
import model.gameunits.enemies.Enemy


class TurnSchedulerTest extends munit.FunSuite {

  var Warrior: Warrior = _
  var Character: Character = _
  var Enemy: Enemy = _
  var gameUnits: List[GameUnit] = _
  var turnScheduler: TurnScheduler = _

  // Se ejecuta antes de cada prueba para crear una nueva instancia de controller.TurnScheduler
  override def beforeEach(context: BeforeEach): Unit = {
    Warrior = new Warrior("Player1", 200, 200, 40, 60.0, None)
    Enemy = new Enemy("Goblin", 100, 100, 20, 10, 50.0)
    gameUnits = List(Character, Enemy)
    turnScheduler = new TurnScheduler(gameUnits)
  }

  test("action bars should be initialized to 0.0") {
    val actionBars = turnScheduler.getClass.getDeclaredMethod("getActionBars")
    actionBars.setAccessible(true)
    val result = actionBars.invoke(turnScheduler).asInstanceOf[Map[GameUnit, Double]]

    assertEquals(result(Character), 0.0)
    assertEquals(result(Enemy), 0.0)
  }

  test("increaseActionBar should increase action bars correctly") {
    val increaseActionBarMethod = turnScheduler.getClass.getDeclaredMethod("increaseActionBar", classOf[Int])
    increaseActionBarMethod.setAccessible(true)
    increaseActionBarMethod.invoke(turnScheduler, 5.asInstanceOf[Object])

    val actionBars = turnScheduler.getClass.getDeclaredMethod("getActionBars")
    actionBars.setAccessible(true)
    val result = actionBars.invoke(turnScheduler).asInstanceOf[Map[GameUnit, Double]]

    assertEquals(result(Character), 5.0)
    assertEquals(result(Enemy), 5.0)
  }

  test("resetActionBar should reset action bars to 0.0") {
    val increaseActionBarMethod = turnScheduler.getClass.getDeclaredMethod("increaseActionBar", classOf[Int])
    increaseActionBarMethod.setAccessible(true)
    increaseActionBarMethod.invoke(turnScheduler, 5.asInstanceOf[Object])

    val resetActionBarMethod = turnScheduler.getClass.getDeclaredMethod("resetActionBar")
    resetActionBarMethod.setAccessible(true)
    resetActionBarMethod.invoke(turnScheduler)

    val actionBars = turnScheduler.getClass.getDeclaredMethod("getActionBars")
    actionBars.setAccessible(true)
    val result = actionBars.invoke(turnScheduler).asInstanceOf[Map[GameUnit, Double]]

    assertEquals(result(Character), 0.0)
    assertEquals(result(Enemy), 0.0)
  }

  test("combat method should simulate combat between a character and an enemy") {
    turnScheduler.combat(Character, Enemy)

  }

}
