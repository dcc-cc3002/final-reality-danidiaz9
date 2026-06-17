package gameunits.common

import gameunits.character.commons.Ninja
import weapons.Weapon
import weapons.commons.{Bow, Sword}
import weapons.magics.Wand

class NinjaTest extends munit.FunSuite {

  class TestNinja(name: String, maxHealthPoints: Int, currentHealthPoints: Int, defense: Int,
                  weight: Double, weapon: Option[Weapon])
    extends Ninja(name, maxHealthPoints, currentHealthPoints, defense, weight, weapon)

  var ninja: TestNinja = _
  var sword: Sword = _
  var bow: Bow = _
  var wand: Wand = _

  override def beforeEach(context: BeforeEach): Unit = {
    ninja = new TestNinja("Hanzo", 100, 100, 20, 70.0, None)
    sword = new Sword("Katana", 30, 2.5, None)
    bow = new Bow("Longbow", 25, 3.0, None)
    wand = new Wand("Magic Wand", 20, 2.0, None, 30)
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

  test("equipSword should equip a sword to the ninja character") {
    ninja.equipSword(sword)
    assertEquals(sword.owner, Some(ninja))
  }

  test("equipBow should equip a bow to the ninja character") {
    ninja.equipBow(bow)
    assertEquals(bow.owner, Some(ninja))
  }

  test("equipWand should equip a wand to the ninja character") {
    ninja.equipWand(wand)
    assertEquals(wand.owner, Some(ninja))
  }


  test("toString returns expected string representation") {
    val expected = "Ninja {name: Hanzo, currentHealthPoints: 100, defense: 20, weight: 70.0, weapons: None}"
    assertEquals(ninja.toString, expected)
  }

  test("equals method works correctly") {
    val sameNinja = new TestNinja("Hanzo", 100, 100, 20, 70.0, None)
    val differentNinja = new TestNinja("Hattori", 100, 100, 20, 70.0, None)

    assert(ninja.equals(sameNinja))
    assert(!ninja.equals(differentNinja))
  }

  test("hashCode method works correctly") {
    val sameNinja = new TestNinja("Hanzo", 100, 100, 20, 70.0, None)

    assertEquals(ninja.hashCode(), sameNinja.hashCode())
  }
}
