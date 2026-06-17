package model.weapons.common

import exceptions.{InvalidSetException, InvalidStatException}
import model.gameunits.character.commons.{Ninja, Paladin, Warrior}
import model.gameunits.character.magics.{BlackMage, WhiteMage}
import model.weapons.commons.Bow

class BowTest extends munit.FunSuite {

  var bow: Bow = _
  var ninja: Ninja = _
  var paladin: Paladin = _
  var warrior: Warrior = _
  var blackMage: BlackMage = _
  var whiteMage: WhiteMage = _

  override def beforeEach(context: BeforeEach): Unit = {

    bow = new Bow("Longbow", 25, 6.0, None)
    warrior = new Warrior("Conan", 120, 120, 15, 90.0, None)
    ninja = new Ninja("Ryu", 100, 100, 12, 80.0, None)
    whiteMage = new WhiteMage("Gandalf", 150, 150, 20, 100.0, 200, 200, None)

  }

  test("getName should return the name of the weapon") {
    assertEquals(bow.getName, "Longbow")
  }

  test("getAttackPoints should return the attack points of the weapon") {
    assertEquals(bow.getAttackPoints, 25)
  }

  test("getMagicAttackPoints should throw InvalidStatException") {
    intercept[InvalidStatException] {
      bow.getMagicAttackPoints
    }
  }

  test("getWeight should return the weight of the weapon") {
    assertEquals(bow.getWeight, 6.0)
  }

  test("getOwner should return None when no owner is set") {
    assertEquals(bow.getOwner, None)
  }

  test("setOwner should set the owner if not already set") {
    bow.setOwner(ninja)
    assertEquals(bow.getOwner, Some(ninja))
  }

  test("setOwner should throw InvalidSetException if owner is already set") {
    bow.setOwner(ninja)
    intercept[InvalidSetException] {
      bow.setOwner(paladin)
    }
  }

  test("setPaladin should throw InvalidSetException") {
    intercept[InvalidSetException] {
      bow.setPaladin(paladin)
    }
  }

  test("setBlackMage should throw InvalidSetException") {
    intercept[InvalidSetException] {
      bow.setBlackMage(blackMage)
    }
  }

  test("setWarrior should set the owner of the bow to a warrior character") {
    bow.setWarrior(warrior)
    assertEquals(bow.owner, Some(warrior))
  }

  test("setNinja should set the owner of the bow to a ninja character") {
    bow.setNinja(ninja)
    assertEquals(bow.owner, Some(ninja))
  }

  test("setWhiteMage should set the owner of the bow to a white wizard character") {
    bow.setWhiteMage(whiteMage)
    assertEquals(bow.owner, Some(whiteMage))
  }

  test("Bow should equal another bow with the same attributes") {
    val anotherBow = new Bow("Longbow", 25, 6.0, None)
    assert(bow == anotherBow)
  }

  test("Bow should not equal another bow with different attributes") {
    val differentBow = new Bow("Short Bow", 30, 6.0, None)
    assert(bow != differentBow)
  }

  test("Bow's hashCode should be consistent with equals") {
    val anotherBow = new Bow("Longbow", 25, 6.0, None)
    assertEquals(bow.hashCode, anotherBow.hashCode)
  }

  test("Bow's toString should return a proper string representation") {
    val expectedString = "Bow {name: Longbow, attackPoints: 25, weight: 6.0, owner: None}"
    assertEquals(bow.toString, expectedString)
  }

}
