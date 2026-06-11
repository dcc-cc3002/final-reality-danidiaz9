package weapons.common

import gameunits.character.commons.{Ninja, Warrior}
import gameunits.character.magics.WhiteMage
import weapons.commons.Bow

class BowTest extends munit.FunSuite {

  var bow: Bow = _
  var warrior: Warrior = _
  var ninja: Ninja = _
  var whiteWizard: WhiteMage = _

  override def beforeEach(context: BeforeEach): Unit = {

    bow = new Bow("Longbow", 25, 6.0, None)
    warrior = new Warrior("Conan", 120, 15, 90.0, None)
    ninja = new Ninja("Ryu", 100, 12, 80.0, None)
    whiteWizard = new WhiteMage("Gandalf", 150, 20, 100.0, 200, None)

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
    bow.setWhiteMage(whiteWizard)
    assertEquals(bow.owner, Some(whiteWizard))
  }

}
