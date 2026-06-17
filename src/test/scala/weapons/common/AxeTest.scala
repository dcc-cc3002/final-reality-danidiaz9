package weapons.common

import gameunits.character.commons.{Paladin, Warrior}
import weapons.commons.Axe

class AxeTest extends munit.FunSuite {

  var axe: Axe = _
  var paladin: Paladin = _
  var warrior: Warrior = _

  override def beforeEach(context: BeforeEach): Unit = {

    axe = new Axe("Battle Axe", 20, 5.0, None)
    paladin = new Paladin("Arthur", 100, 100, 10, 80.0, None)
    warrior = new Warrior("Conan", 120, 120, 15, 90.0, None)

  }

  test("setPaladin should set the owner of the axe to a paladin character") {
    axe.setPaladin(paladin)
    assertEquals(axe.owner, Some(paladin))
  }

  test("setWarrior should set the owner of the axe to a warrior character") {
    axe.setWarrior(warrior)
    assertEquals(axe.owner, Some(warrior))
  }

}
