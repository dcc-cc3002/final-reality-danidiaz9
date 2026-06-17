package model.weapons.magic

import model.gameunits.character.magics.{BlackMage, WhiteMage}
import model.weapons.magics.Staff

class StaffTest extends munit.FunSuite {

  var staff: Staff = _
  var blackWizard: BlackMage = _
  var whiteWizard: WhiteMage = _

  override def beforeEach(context: BeforeEach): Unit = {

    staff = new Staff("Magic Staff", 25, 6.0, None, 30)
    blackWizard = new BlackMage("Gandalf", 150, 150, 20, 80.0, 200, 200, None)
    whiteWizard = new WhiteMage("Saruman", 140, 140, 18, 75.0, 190, 190, None)

  }

  test("setBlackMage should set the owner of the staff to a black wizard character") {
    staff.setBlackMage(blackWizard)
    assertEquals(staff.owner, Some(blackWizard))
  }

  test("setWhiteMage should set the owner of the staff to a white wizard character") {
    staff.setWhiteMage(whiteWizard)
    assertEquals(staff.owner, Some(whiteWizard))
  }

}
