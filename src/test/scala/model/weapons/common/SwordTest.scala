package model.weapons.common

import exceptions.{InvalidSetException, InvalidStatException}
import model.gameunits.character.commons.{Ninja, Paladin, Warrior}
import model.gameunits.character.magics.{BlackMage, WhiteMage}
import model.weapons.commons.Sword

class SwordTest extends munit.FunSuite {

  var sword: Sword = _
  var ninja: Ninja = _
  var paladin: Paladin = _
  var warrior: Warrior = _
  var blackMage: BlackMage = _
  var whiteMage: WhiteMage = _

  override def beforeEach(context: BeforeEach): Unit = {

    sword = new Sword("Excalibur", 30, 8.0, None)
    paladin = new Paladin("Arthur", 130, 130, 20, 100.0, None)
    warrior = new Warrior("Conan", 120, 120, 15, 90.0, None)
    ninja = new Ninja("Ryu", 100, 100, 12, 80.0, None)
    blackMage = new BlackMage("Voldemort", 150, 150, 25, 95.0, 200, 200, None)

  }

  test("getName should return the name of the weapon") {
    assertEquals(sword.getName, "Excalibur")
  }

  test("getAttackPoints should return the attack points of the weapon") {
    assertEquals(sword.getAttackPoints, 30)
  }

  test("getMagicAttackPoints should throw InvalidStatException") {
    intercept[InvalidStatException] {
      sword.getMagicAttackPoints
    }
  }

  test("getWeight should return the weight of the weapon") {
    assertEquals(sword.getWeight, 8.0)
  }

  test("getOwner should return None when no owner is set") {
    assertEquals(sword.getOwner, None)
  }

  test("setOwner should set the owner if not already set") {
    sword.setOwner(ninja)
    assertEquals(sword.getOwner, Some(ninja))
  }

  test("setOwner should throw InvalidSetException if owner is already set") {
    sword.setOwner(ninja)
    intercept[InvalidSetException] {
      sword.setOwner(paladin)
    }
  }

  test("setWhiteMage should throw InvalidSetException") {
    intercept[InvalidSetException] {
      sword.setWhiteMage(whiteMage)
    }
  }

  test("setPaladin should set the owner of the sword to a paladin character") {
    sword.setPaladin(paladin)
    assertEquals(sword.owner, Some(paladin))
  }

  test("setWarrior should set the owner of the sword to a warrior character") {
    sword.setWarrior(warrior)
    assertEquals(sword.owner, Some(warrior))
  }

  test("setNinja should set the owner of the sword to a ninja character") {
    sword.setNinja(ninja)
    assertEquals(sword.owner, Some(ninja))
  }

  test("setBlackMage should set the owner of the sword to a black wizard character") {
    sword.setBlackMage(blackMage)
    assertEquals(sword.owner, Some(blackMage))
  }

  test("Sword should equal another sword with the same attributes") {
    val anotherSword = new Sword("Excalibur", 30, 8.0, None)
    assert(sword == anotherSword)
  }

  test("Sword should not equal another sword with different attributes") {
    val differentSword = new Sword("Durandal", 45, 6.0, None)
    assert(sword != differentSword)
  }

  test("Sword's hashCode should be consistent with equals") {
    val anotherSword = new Sword("Excalibur", 30, 8.0, None)
    assertEquals(sword.hashCode, anotherSword.hashCode)
  }

  test("Sword's toString should return a proper string representation") {
    val expectedString = "Sword {name: Excalibur, attackPoints: 30, weight: 8.0, owner: None}"
    assertEquals(sword.toString, expectedString)
  }

}
