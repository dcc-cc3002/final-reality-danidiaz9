package charactersTest.magicTest

import characters.player.magics.WhiteWizard
import weaponry.TraitWeaponry

class WhiteWizardTest extends munit.FunSuite {

  class TestWhiteWizard(name: String, healthPoints: Int, defense: Int, weight: Double, manaPoints: Int, weapon: Option[TraitWeaponry])
    extends WhiteWizard(name, healthPoints, defense, weight, manaPoints, weapon)

  var whiteWizard: TestWhiteWizard = _

  override def beforeEach(context: BeforeEach): Unit = {
    whiteWizard = new TestWhiteWizard("Gandalf", 150, 30, 80.0, 100, None)
  }

  test("getName returns correct name") {
    assertEquals(whiteWizard.getName, "Gandalf")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(whiteWizard.getHealthPoints, 150)
  }

  test("getDefense returns correct defense points") {
    assertEquals(whiteWizard.getDefense, 30)
  }

  test("getWeight returns correct weight") {
    assertEquals(whiteWizard.getWeight, 80.0)
  }

  test("getManaPoints returns correct mana points") {
    assertEquals(whiteWizard.getManaPoints, 100)
  }

  test("getWeapon returns None by default") {
    assertEquals(whiteWizard.getWeapon, None)
  }

  test("toString returns expected string representation") {
    val expected = "WhiteWizard {name: Gandalf, healthPoints: 150, defense: 30, weight: 80.0, manaPoints: 100, weapon: None}"
    assertEquals(whiteWizard.toString, expected)
  }

  test("equals method works correctly") {
    val sameWhiteWizard = new TestWhiteWizard("Gandalf", 150, 30, 80.0, 100, None)
    val differentWhiteWizard = new TestWhiteWizard("Saruman", 150, 30, 80.0, 100, None)

    assert(whiteWizard.equals(sameWhiteWizard))
    assert(!whiteWizard.equals(differentWhiteWizard))
  }

  test("hashCode method works correctly") {
    val sameWhiteWizard = new TestWhiteWizard("Gandalf", 150, 30, 80.0, 100, None)

    assertEquals(whiteWizard.hashCode(), sameWhiteWizard.hashCode())
  }

}
