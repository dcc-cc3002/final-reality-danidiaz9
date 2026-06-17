package exceptions

class SpellTest extends munit.FunSuite {

  private val spellName = "SpellName"
  private val spellExceptionMessage = s"Spell '$spellName' is invalid."

  test("SpellException should contain correct message") {
    val exception = intercept[InvalidSpellException] {
      throw new InvalidSpellException("spellName")
    }
    assertEquals(exception.getMessage, spellExceptionMessage)
  }

}
