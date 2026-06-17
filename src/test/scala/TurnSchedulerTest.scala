import gameunits.character.commons.Warrior
import gameunits.{Enemy, GameUnit}
import scala.collection.mutable.ArrayBuffer


class TurnSchedulerTest extends munit.FunSuite {

  var turnScheduler: TurnScheduler = _
  var Warrior: Warrior = _

  // Se ejecuta antes de cada prueba para crear una nueva instancia de TurnScheduler
  override def beforeEach(context: BeforeEach): Unit = {
    turnScheduler = new TurnScheduler
    Warrior = new Warrior("Player1", 200, 200, 40, 60.0, None)
  }

  test("addLoadingZone") {
    turnScheduler.addLoadingZone(Warrior)
    assert(turnScheduler.loadingZone.contains(Warrior))
  }

  test("removeLoadingZone") {
    turnScheduler.loadingZone += Warrior
    turnScheduler.removeLoadingZone(Warrior)
    assert(!turnScheduler.loadingZone.contains(Warrior))
  }

  test("addWaitingZone") {
    turnScheduler.addWaitingZone(Warrior)
    assert(turnScheduler.waitingZone.contains(Warrior))
  }

  test("removeWaitingZone") {
    turnScheduler.waitingZone += Warrior
    turnScheduler.removeWaitingZone(Warrior)
    assert(!turnScheduler.waitingZone.contains(Warrior))
  }

  test("resetActionBarInstance") {
    val character1: GameUnit = new Enemy("Enemy1", 100, 100, 20, 30, 50)
    val character2: GameUnit = new Enemy("Enemy2", 150, 150, 25, 35, 55)
    turnScheduler.waitingZone ++= ArrayBuffer(character1, character2)
    character1.getActionBar = 10.0
    character2.getActionBar = 20.0
    turnScheduler.resetActionBarInstance()
    assert(character1.getActionBar == 0.0 && character2.getActionBar == 0.0)
  }

  test("updateLoadingZone") {
    val character1: GameUnit = new Enemy("Enemy1", 100, 100, 20, 30, 50)
    val character2: GameUnit = new Enemy("Enemy2", 150, 150, 25, 35, 55)
    turnScheduler.loadingZone ++= ArrayBuffer(character1, character2)
    turnScheduler.updateLoadingZone(5)
    assert(character1.getActionBar == 5 && character2.getActionBar == 5)
  }

  test("completeActionBar") {
    val character1: GameUnit = new Enemy("Enemy1", 100, 100, 20, 30, 50)
    val character2: GameUnit = new Enemy("Enemy2", 150, 150, 25, 35, 55)
    turnScheduler.loadingZone ++= ArrayBuffer(character1, character2)
    character1.getActionBar = 25.0
    character2.getActionBar = 15.0
    turnScheduler.completeActionBar()
    assert(!turnScheduler.waitingZone.contains(character1) && !turnScheduler.waitingZone.contains(character2))
  }

  test("sortTurns") {
    val character1: GameUnit = new Enemy("Enemy1", 100, 100, 20, 30, 50)
    val character2: GameUnit = new Enemy("Enemy2", 150, 150, 25, 35, 55)
    turnScheduler.waitingZone ++= ArrayBuffer(character1, character2)
    character1.getActionBar = 25.0
    character2.getActionBar = 15.0
    turnScheduler.sortTurns()
    assert(turnScheduler.waitingZone.head == character1 && turnScheduler.waitingZone.last == character2)
  }
}
