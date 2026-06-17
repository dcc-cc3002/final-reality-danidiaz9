package exceptions

class EquipTest extends munit.FunSuite {

  private val character = "Character"
  private val weapon = "Weapon"
  private val equipExceptionMessage = s"Cannot equip $weapon to $character."

  test("EquipException should contain correct message") {
    val exception = intercept[InvalidEquipException] {
      throw new InvalidEquipException("character, weapon")
    }
    assertEquals(exception.getMessage, equipExceptionMessage)
  }

}
