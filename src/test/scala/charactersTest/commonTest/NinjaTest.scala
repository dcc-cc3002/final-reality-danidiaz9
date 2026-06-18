package charactersTest.commonTest

import characters.player.commons.Ninja

class NinjaTest extends munit.FunSuite {

  test("Ninja equality") {
    val ninja1 = new Ninja("Hattori", 100, 80, 70.0)
    val ninja2 = new Ninja("Hattori", 100, 80, 70.0)
    val ninja3 = new Ninja("Kasumi", 90, 75, 65.0)

    assertEquals(ninja1, ninja2)
    assertNotEquals(ninja1, ninja3)
  }

  test("Ninja hash code") {
    val ninja1 = new Ninja("Hattori", 100, 80, 70.0)
    val ninja2 = new Ninja("Hattori", 100, 80, 70.0)

    assertEquals(ninja1.hashCode(), ninja2.hashCode())
  }

  test("Ninja toString") {
    val ninja = new Ninja("Hattori", 100, 80, 70)
    val expectedString = "Ninja {name: Hattori, healthPoints: 100, defense: 80, weight: 70.0}"

    assertEquals(ninja.toString(), expectedString)
  }
}
