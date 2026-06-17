package model.weapons.magic

import model.gameunits.character.commons.Ninja
import model.gameunits.character.magics.{BlackMage, WhiteMage}
import model.weapons.magics.Wand

class WandTest extends munit.FunSuite {

  var wand: Wand = _
  var ninja: Ninja = _
  var blackWizard: BlackMage = _
  var whiteWizard: WhiteMage = _

  override def beforeEach(context: BeforeEach): Unit = {

    wand = new Wand("Magic Wand", 20, 3.5, None, 25)
    ninja = new Ninja("Ryu", 120, 120, 15, 70.0, None)
    blackWizard = new BlackMage("Gandalf", 150, 150, 20, 80.0, 200, 200, None)
    whiteWizard = new WhiteMage("Saruman", 140, 140, 18, 75.0, 190, 190, None)

  }

  test("setNinja should set the owner of the wand to a ninja character") {
    wand.setNinja(ninja)
    assertEquals(wand.owner, Some(ninja))
  }

  test("setBlackMage should set the owner of the wand to a black wizard character") {
    wand.setBlackMage(blackWizard)
    assertEquals(wand.owner, Some(blackWizard))
  }

  test("setWhiteMage should set the owner of the wand to a white wizard character") {
    wand.setWhiteMage(whiteWizard)
    assertEquals(wand.owner, Some(whiteWizard))
  }

}
