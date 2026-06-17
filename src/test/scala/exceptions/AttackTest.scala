package exceptions

class AttackTest extends munit.FunSuite {

  private val attacker = "Attacker"
  private val target = "Target"
  private val damage = 50
  private val attackExceptionMessage = s"$attacker cannot attack $target with $damage damage."

  test("AttackException should contain correct message") {
    val exception = intercept[InvalidAttackException] {
      throw new InvalidAttackException("attacker, target, damage")
    }
    assertEquals(exception.getMessage, attackExceptionMessage)
  }

}
