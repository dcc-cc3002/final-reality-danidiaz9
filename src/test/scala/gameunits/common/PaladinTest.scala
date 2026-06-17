package gameunits.common

import gameunits.character.commons.Paladin
import weapons.Weapon
import weapons.commons.{Axe, Sword}

class PaladinTest extends munit.FunSuite {

  class TestPaladin(name: String, maxHealthPoints: Int, currentHealthPoints: Int, defense: Int,
                    weight: Double, weapon: Option[Weapon])
    extends Paladin(name, maxHealthPoints, currentHealthPoints, defense, weight, weapon)

  var paladin: TestPaladin = _
  var sword: Sword = _
  var axe: Axe = _

  override def beforeEach(context: BeforeEach): Unit = {
    paladin = new TestPaladin("Arthur", 150, 150, 30, 80.0, None)
    sword = new Sword("Excalibur", 50, 5.0, None)
    axe = new Axe("Battleaxe", 40, 7.0, None)
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

  test("equipSword should equip a sword to the paladin character") {
    paladin.equipSword(sword)
    assertEquals(sword.owner, Some(paladin))
  }

  test("equipAxe should equip an axe to the paladin character") {
    paladin.equipAxe(axe)
    assertEquals(axe.owner, Some(paladin))
  }

  test("toString returns expected string representation") {
    val expected = "Paladin {name: Arthur, currentHealthPoints: 150, defense: 30, weight: 80.0, weapons: None}"
    assertEquals(paladin.toString, expected)
  }

  test("equals method works correctly") {
    val samePaladin = new TestPaladin("Arthur", 150, 150, 30, 80.0, None)
    val differentPaladin = new TestPaladin("Lancelot", 150, 150, 30, 80.0, None)

    assert(paladin.equals(samePaladin))
    assert(!paladin.equals(differentPaladin))
  }

  test("hashCode method works correctly") {
    val samePaladin = new TestPaladin("Arthur", 150, 150, 30, 80.0, None)

    assertEquals(paladin.hashCode(), samePaladin.hashCode())
  }

}
