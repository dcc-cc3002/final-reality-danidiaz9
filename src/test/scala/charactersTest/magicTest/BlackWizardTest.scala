package charactersTest.magicTest

import characters.player.magics.BlackWizard
import weaponry.TraitWeaponry

class BlackWizardTest extends munit.FunSuite {

  class TestBlackWizard(name: String,
                        healthPoints: Int,
                        defense: Int,
                        weight: Double,
                        manaPoints: Int,
                        weapon: Option[TraitWeaponry])
    extends BlackWizard(name, healthPoints, defense, weight, manaPoints, weapon)

  var blackWizard: TestBlackWizard = _

  override def beforeEach(context: BeforeEach): Unit = {
    blackWizard = new TestBlackWizard("Gandalf", 150, 30, 80.0, 100, None)
  }

  test("getName returns correct name") {
    assertEquals(blackWizard.getName, "Gandalf")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(blackWizard.getHealthPoints, 150)
  }

  test("getDefense returns correct defense points") {
    assertEquals(blackWizard.getDefense, 30)
  }

  test("getWeight returns correct weight") {
    assertEquals(blackWizard.getWeight, 80.0)
  }

  test("getManaPoints returns correct mana points") {
    assertEquals(blackWizard.getManaPoints, 100)
  }

  test("getWeapon returns None by default") {
    assertEquals(blackWizard.getWeapon, None)
  }

  test("toString returns expected string representation") {
    val expected = "BlackWizard {name: Gandalf, healthPoints: 150," +
      " defense: 30, weight: 80.0, manaPoints: 100, weapon: None}"
    assertEquals(blackWizard.toString, expected)
  }

  test("equals method works correctly") {
    val sameBlackWizard = new TestBlackWizard("Gandalf", 150, 30, 80.0, 100, None)
    val differentBlackWizard = new TestBlackWizard("Saruman", 150, 30, 80.0, 100, None)

    assert(blackWizard.equals(sameBlackWizard))
    assert(!blackWizard.equals(differentBlackWizard))
  }

  test("hashCode method works correctly") {
    val sameBlackWizard = new TestBlackWizard("Gandalf", 150, 30, 80.0, 100, None)

    assertEquals(blackWizard.hashCode(), sameBlackWizard.hashCode())
  }

}
