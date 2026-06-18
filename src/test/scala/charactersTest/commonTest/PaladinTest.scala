package charactersTest.commonTest

import characters.player.commons.Paladin
import weaponry.TraitWeaponry

class PaladinTest extends munit.FunSuite {

  class TestPaladin(name: String, healthPoints: Int, defense: Int, weight: Double, weapon: Option[TraitWeaponry])
    extends Paladin(name, healthPoints, defense, weight, weapon)

  var paladin: TestPaladin = _

  override def beforeEach(context: BeforeEach): Unit = {
    paladin = new TestPaladin("Arthur", 150, 30, 80.0, None)
  }

  test("getName returns correct name") {
    assertEquals(paladin.getName, "Arthur")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(paladin.getHealthPoints, 150)
  }

  test("getDefense returns correct defense points") {
    assertEquals(paladin.getDefense, 30)
  }

  test("getWeight returns correct weight") {
    assertEquals(paladin.getWeight, 80.0)
  }

  test("getWeapon returns None by default") {
    assertEquals(paladin.getWeapon, None)
  }

  test("toString returns expected string representation") {
    val expected = "Paladin {name: Arthur, healthPoints: 150, defense: 30, weight: 80.0, weapon: None}"
    assertEquals(paladin.toString, expected)
  }

  test("equals method works correctly") {
    val samePaladin = new TestPaladin("Arthur", 150, 30, 80.0, None)
    val differentPaladin = new TestPaladin("Lancelot", 150, 30, 80.0, None)

    assert(paladin.equals(samePaladin))
    assert(!paladin.equals(differentPaladin))
  }

  test("hashCode method works correctly") {
    val samePaladin = new TestPaladin("Arthur", 150, 30, 80.0, None)

    assertEquals(paladin.hashCode(), samePaladin.hashCode())
  }

}
