package model.gameunits.common

import model.gameunits.character.commons.Warrior
import model.weapons.Weapon
import model.weapons.commons.{Axe, Bow, Sword}

class WarriorTest extends munit.FunSuite {

  class TestWarrior(name: String, maxHealthPoints: Int, currentHealthPoints: Int, defense: Int,
                    weight: Double, weapon: Option[Weapon])
    extends Warrior(name, maxHealthPoints, currentHealthPoints, defense, weight, weapon)

  var warrior: TestWarrior = _
  var sword: Sword = _
  var axe: Axe = _
  var bow: Bow = _

  override def beforeEach(context: BeforeEach): Unit = {
    warrior = new TestWarrior("Conan", 200, 200, 40, 100.0, None)
    sword = new Sword("Broad Sword", 60, 10.0, None)
    axe = new Axe("Battleaxe", 50, 15.0, None)
    bow = new Bow("Longbow", 40, 8.0, None)
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

  test("equipSword should equip a sword to the warrior character") {
    warrior.equipSword(sword)
    assertEquals(sword.owner, Some(warrior))
  }

  test("equipAxe should equip an axe to the warrior character") {
    warrior.equipAxe(axe)
    assertEquals(axe.owner, Some(warrior))
  }

  test("equipBow should equip a bow to the warrior character") {
    warrior.equipBow(bow)
    assertEquals(bow.owner, Some(warrior))
  }

  test("toString returns expected string representation") {
    val expected = "Warrior {name: Conan, currentHealthPoints: 200, defense: 40, weight: 100.0, weapons: None}"
    assertEquals(warrior.toString, expected)
  }

  test("equals method works correctly") {
    val sameWarrior = new TestWarrior("Conan", 200, 200, 40, 100.0, None)
    val differentWarrior = new TestWarrior("Thor", 200, 200, 40, 100.0, None)

    assert(warrior.equals(sameWarrior))
    assert(!warrior.equals(differentWarrior))
  }

  test("hashCode method works correctly") {
    val sameWarrior = new TestWarrior("Conan", 200, 200, 40, 100.0, None)

    assertEquals(warrior.hashCode(), sameWarrior.hashCode())
  }

}
