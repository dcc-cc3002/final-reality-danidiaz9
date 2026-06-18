package charactersTest.magicTest

import characters.magic.WhiteWizard

class WhiteWizardTest extends munit.FunSuite {

  test("WhiteWizard equality") {
    val wizard1 = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)
    val wizard2 = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)
    val wizard3 = new WhiteWizard("Saruman", 110, 75, 65.0, 90)

    assertEquals(wizard1, wizard2)
    assertNotEquals(wizard1, wizard3)
  }

  test("WhiteWizard hash code") {
    val wizard1 = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)
    val wizard2 = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    assertEquals(wizard1.hashCode(), wizard2.hashCode())
  }

  test("WhiteWizard toString") {
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)
    val expectedString = "WhiteWizard {name: Gandalf, healthPoints: 120, defense: 80, " +
      "weight: 70.0, manaPoints: 100}"

    assertEquals(wizard.toString(), expectedString)
  }
}
