package charactersTest.commonTest

import characters.player.commons.Ninja
import weaponry.TraitWeaponry

class NinjaTest extends munit.FunSuite {

  class TestNinja(name: String, healthPoints: Int, defense: Int, weight: Double, weapon: Option[TraitWeaponry])
    extends Ninja(name, healthPoints, defense, weight, weapon)

  var ninja: TestNinja = _

  override def beforeEach(context: BeforeEach): Unit = {
    ninja = new TestNinja("Hanzo", 100, 20, 70.0, None)
  }

  test("getName returns correct name") {
    assertEquals(ninja.getName, "Hanzo")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(ninja.getHealthPoints, 100)
  }

  test("getDefense returns correct defense points") {
    assertEquals(ninja.getDefense, 20)
  }

  test("getWeight returns correct weight") {
    assertEquals(ninja.getWeight, 70.0)
  }

  test("getWeapon returns None by default") {
    assertEquals(ninja.getWeapon, None)
  }

  test("toString returns expected string representation") {
    val expected = "Ninja {name: Hanzo, healthPoints: 100, defense: 20, weight: 70.0, weapon: None}"
    assertEquals(ninja.toString, expected)
  }

  test("equals method works correctly") {
    val sameNinja = new TestNinja("Hanzo", 100, 20, 70.0, None)
    val differentNinja = new TestNinja("Hattori", 100, 20, 70.0, None)

    assert(ninja.equals(sameNinja))
    assert(!ninja.equals(differentNinja))
  }

  test("hashCode method works correctly") {
    val sameNinja = new TestNinja("Hanzo", 100, 20, 70.0, None)

    assertEquals(ninja.hashCode(), sameNinja.hashCode())
  }
}
