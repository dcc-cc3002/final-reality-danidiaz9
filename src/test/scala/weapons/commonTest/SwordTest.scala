package weapons.commonTest

import gameunits.character.commons.{Ninja, Paladin, Warrior}
import gameunits.character.magics.BlackMage
import weapons.commons.Sword

class SwordTest extends munit.FunSuite {

  var sword: Sword = _
  var paladin: Paladin = _
  var warrior: Warrior = _
  var ninja: Ninja = _
  var blackWizard: BlackMage = _

  override def beforeEach(context: BeforeEach): Unit = {

    sword = new Sword("Excalibur", 30, 8.0, None)
    paladin = new Paladin("Arthur", 130, 20, 100.0, None)
    warrior = new Warrior("Conan", 120, 15, 90.0, None)
    ninja = new Ninja("Ryu", 100, 12, 80.0, None)
    blackWizard = new BlackMage("Voldemort", 150, 25, 95.0, 200, None)

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
    sword.setBlackMage(blackWizard)
    assertEquals(sword.owner, Some(blackWizard))
  }

}
