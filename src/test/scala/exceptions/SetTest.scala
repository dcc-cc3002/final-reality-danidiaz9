package exceptions

class SetTest extends munit.FunSuite {

  private val setName = "SetName"
  private val setExceptionMessage = s"Set '$setName' is invalid."

  test("SetException should contain correct message") {
    val exception = intercept[InvalidSetException] {
      throw new InvalidSetException("setName")
    }
    assertEquals(exception.getMessage, setExceptionMessage)
  }

}
