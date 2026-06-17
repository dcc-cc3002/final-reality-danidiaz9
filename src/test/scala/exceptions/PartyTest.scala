package exceptions

class PartyTest extends munit.FunSuite {

  private val partyName = "PartyName"
  private val partyExceptionMessage = s"Party '$partyName' is invalid."

  test("PartyException should contain correct message") {
    val exception = intercept[InvalidPartyException] {
      throw new InvalidPartyException("partyName")
    }
    assertEquals(exception.getMessage, partyExceptionMessage)
  }

}
