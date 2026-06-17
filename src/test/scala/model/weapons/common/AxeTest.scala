package model.weapons.common

import exceptions.{InvalidSetException, InvalidStatException}
import model.gameunits.character.commons.{Ninja, Paladin, Warrior}
import model.gameunits.character.magics.{BlackMage, WhiteMage}
import model.weapons.commons.Axe

class AxeTest extends munit.FunSuite {

  var axe: Axe = _
  var ninja: Ninja = _
  var paladin: Paladin = _
  var warrior: Warrior = _
  var blackMage: BlackMage = _
  var whiteMage: WhiteMage = _

  override def beforeEach(context: BeforeEach): Unit = {

    axe = new Axe("Battle Axe", 20, 5.0, None)
    paladin = new Paladin("Arthur", 100, 100, 10, 80.0, None)
    warrior = new Warrior("Conan", 120, 120, 15, 90.0, None)

  }

  test("getName should return the name of the weapon") {
    assertEquals(axe.getName, "Battle Axe")
  }

  test("getAttackPoints should return the attack points of the weapon") {
    assertEquals(axe.getAttackPoints, 20)
  }

  test("getMagicAttackPoints should throw InvalidStatException") {
    intercept[InvalidStatException] {
      axe.getMagicAttackPoints
    }
  }

  test("getWeight should return the weight of the weapon") {
    assertEquals(axe.getWeight, 5.0)
  }

  test("getOwner should return None when no owner is set") {
    assertEquals(axe.getOwner, None)
  }

  test("setOwner should set the owner if not already set") {
    axe.setOwner(ninja)
    assertEquals(axe.getOwner, Some(ninja))
  }

  test("setOwner should throw InvalidSetException if owner is already set") {
    axe.setOwner(ninja)
    intercept[InvalidSetException] {
      axe.setOwner(paladin)
    }
  }

  test("setNinja should throw InvalidSetException") {
    intercept[InvalidSetException] {
      axe.setNinja(ninja)
    }
  }

  test("setBlackMage should throw InvalidSetException") {
    intercept[InvalidSetException] {
      axe.setBlackMage(blackMage)
    }
  }

  test("setWhiteMage should throw InvalidSetException") {
    intercept[InvalidSetException] {
      axe.setWhiteMage(whiteMage)
    }
  }

  test("setPaladin should set the owner of the axe to a paladin character") {
    axe.setPaladin(paladin)
    assertEquals(axe.owner, Some(paladin))
  }

  test("setWarrior should set the owner of the axe to a warrior character") {
    axe.setWarrior(warrior)
    assertEquals(axe.owner, Some(warrior))
  }

  test("Axe should equal another axe with the same attributes") {
    val anotherAxe = new Axe("Battle Axe", 20, 5.0, None)
    assert(axe == anotherAxe)
  }

  test("Axe should not equal another axe with different attributes") {
    val differentAxe = new Axe("War Axe", 40, 10.0, None)
    assert(axe != differentAxe)
  }

  test("Axe's hashCode should be consistent with equals") {
    val anotherAxe = new Axe("Battle Axe", 20, 5.0, None)
    assertEquals(axe.hashCode, anotherAxe.hashCode)
  }

  test("Axe's toString should return a proper string representation") {
    val expectedString = "Axe {name: Battle Axe, attackPoints: 20, weight: 5.0, owner: None}"
    assertEquals(axe.toString, expectedString)
  }
}
