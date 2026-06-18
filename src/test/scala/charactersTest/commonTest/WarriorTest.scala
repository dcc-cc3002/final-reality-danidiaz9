package charactersTest.commonTest

import characters.player.commons.Warrior
import weaponry.TraitWeaponry

class WarriorTest extends munit.FunSuite {

  class TestWarrior(name: String, healthPoints: Int, defense: Int, weight: Double, weapon: Option[TraitWeaponry])
    extends Warrior(name, healthPoints, defense, weight, weapon)

  var warrior: TestWarrior = _

  override def beforeEach(context: BeforeEach): Unit = {
    warrior = new TestWarrior("Conan", 200, 40, 100.0, None)
  }

  test("getName returns correct name") {
    assertEquals(warrior.getName, "Conan")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(warrior.getHealthPoints, 200)
  }

  test("getDefense returns correct defense points") {
    assertEquals(warrior.getDefense, 40)
  }

  test("getWeight returns correct weight") {
    assertEquals(warrior.getWeight, 100.0)
  }

  test("getWeapon returns None by default") {
    assertEquals(warrior.getWeapon, None)
  }

  test("toString returns expected string representation") {
    val expected = "Warrior {name: Conan, healthPoints: 200, defense: 40, weight: 100.0, weapon: None}"
    assertEquals(warrior.toString, expected)
  }

  test("equals method works correctly") {
    val sameWarrior = new TestWarrior("Conan", 200, 40, 100.0, None)
    val differentWarrior = new TestWarrior("Thor", 200, 40, 100.0, None)

    assert(warrior.equals(sameWarrior))
    assert(!warrior.equals(differentWarrior))
  }

  test("hashCode method works correctly") {
    val sameWarrior = new TestWarrior("Conan", 200, 40, 100.0, None)

    assertEquals(warrior.hashCode(), sameWarrior.hashCode())
  }

}
