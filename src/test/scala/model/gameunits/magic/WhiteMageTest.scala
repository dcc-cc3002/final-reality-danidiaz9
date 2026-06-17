package model.gameunits.magic

import model.gameunits.character.magics.WhiteMage
import model.weapons.Weapon
import model.weapons.commons.Bow
import model.weapons.magics.{Staff, Wand}

class WhiteMageTest extends munit.FunSuite {

  class TestWhiteMage(name: String,
                      maxHealthPoints: Int,
                      currentHealthPoints: Int,
                      defense: Int,
                      weight: Double,
                      maxManaPoints: Int,
                      currentManaPoints:Int,
                      weapon: Option[Weapon])
    extends WhiteMage(name, maxHealthPoints, currentHealthPoints,
      defense, weight, maxManaPoints, currentManaPoints, weapon)

  var whiteWizard: TestWhiteMage = _
  var bow: Bow = _
  var wand: Wand = _
  var staff: Staff = _

  override def beforeEach(context: BeforeEach): Unit = {
    whiteWizard = new TestWhiteMage("Gandalf", 150, 50, 30, 80.0, 100, 100, None)
    bow = new Bow("Elven Bow", 100, 8.0, None)
    wand = new Wand("Magic Wand", 120, 7.0, None, 150)
    staff = new Staff("Holy Staff", 150, 12.0, None, 180)
  }

  test("getName returns correct name") {
    assertEquals(whiteWizard.getName, "Gandalf")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(whiteWizard.getHealthPoints, 50)
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

  test("equipBow should equip a bow to the white wizard character") {
    whiteWizard.equipBow(bow)
    assertEquals(bow.owner, Some(whiteWizard))
  }

  test("equipWand should equip a wand to the white wizard character") {
    whiteWizard.equipWand(wand)
    assertEquals(wand.owner, Some(whiteWizard))
  }

  test("equipStaff should equip a staff to the white wizard character") {
    whiteWizard.equipStaff(staff)
    assertEquals(staff.owner, Some(whiteWizard))
  }

  test("toString returns expected string representation") {
    val expected = "WhiteMage {name: Gandalf, currentHealthPoints: 50, defense: 30, " +
      "weight: 80.0, currentManaPoints: 100, weapons: None}"
    assertEquals(whiteWizard.toString, expected)
  }

  test("equals method works correctly") {
    val sameWhiteWizard = new TestWhiteMage("Gandalf", 150, 50, 30, 80.0, 100, 100, None)
    val differentWhiteWizard = new TestWhiteMage("Saruman", 150, 150, 30, 80.0, 100, 100, None)

    assert(whiteWizard.equals(sameWhiteWizard))
    assert(!whiteWizard.equals(differentWhiteWizard))
  }

  test("hashCode method works correctly") {
    val sameWhiteWizard = new TestWhiteMage("Gandalf", 150, 50, 30, 80.0, 100, 100, None)

    assertEquals(whiteWizard.hashCode(), sameWhiteWizard.hashCode())
  }

}
