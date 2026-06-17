package gameunits.magicTest

import gameunits.character.magics.BlackMage
import weapons.Weapon
import weapons.commons.Sword
import weapons.magics.{Staff, Wand}

class BlackMageTest extends munit.FunSuite {

  class TestBlackMage(name: String,
                      healthPoints: Int,
                      defense: Int,
                      weight: Double,
                      manaPoints: Int,
                      weapon: Option[Weapon])
    extends BlackMage(name, healthPoints, defense, weight, manaPoints, weapon)

  var blackWizard: TestBlackMage = _
  var sword: Sword = _
  var wand: Wand = _
  var staff: Staff = _

  override def beforeEach(context: BeforeEach): Unit = {
    blackWizard = new TestBlackMage("Gandalf", 150, 30, 80.0, 100, None)
    sword = new Sword("Dark Sword", 70, 12.0, None)
    wand = new Wand("Elder Wand", 80, 10.0, None, 100)
    staff = new Staff("Dark Staff", 90, 15.0, None, 120)
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

  test("equipSword should equip a sword to the black wizard character") {
    blackWizard.equipSword(sword)
    assertEquals(sword.owner, Some(blackWizard))
  }

  test("equipWand should equip a wand to the black wizard character") {
    blackWizard.equipWand(wand)
    assertEquals(wand.owner, Some(blackWizard))
  }

  test("equipStaff should equip a staff to the black wizard character") {
    blackWizard.equipStaff(staff)
    assertEquals(staff.owner, Some(blackWizard))
  }

  test("toString returns expected string representation") {
    val expected = "BlackMage {name: Gandalf, healthPoints: 150," +
      " defense: 30, weight: 80.0, manaPoints: 100, weapons: None}"
    assertEquals(blackWizard.toString, expected)
  }

  test("equals method works correctly") {
    val sameBlackWizard = new TestBlackMage("Gandalf", 150, 30, 80.0, 100, None)
    val differentBlackWizard = new TestBlackMage("Saruman", 150, 30, 80.0, 100, None)

    assert(blackWizard.equals(sameBlackWizard))
    assert(!blackWizard.equals(differentBlackWizard))
  }

  test("hashCode method works correctly") {
    val sameBlackWizard = new TestBlackMage("Gandalf", 150, 30, 80.0, 100, None)

    assertEquals(blackWizard.hashCode(), sameBlackWizard.hashCode())
  }

}
