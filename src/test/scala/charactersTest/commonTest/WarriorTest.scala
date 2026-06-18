package charactersTest.commonTest

import characters.common.Warrior

class WarriorTest extends munit.FunSuite {

  test("Warrior equality") {
    val warrior1 = new Warrior("Conan", 150, 100, 90.0)
    val warrior2 = new Warrior("Conan", 150, 100, 90.0)
    val warrior3 = new Warrior("Thor", 140, 95, 85.0)

    assertEquals(warrior1, warrior2)
    assertNotEquals(warrior1, warrior3)
  }

  test("Warrior hash code") {
    val warrior1 = new Warrior("Conan", 150, 100, 90.0)
    val warrior2 = new Warrior("Conan", 150, 100, 90.0)

    assertEquals(warrior1.hashCode(), warrior2.hashCode())
  }

  test("Warrior toString") {
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val expectedString = "Warrior {name: Conan, healthPoints: 150, defense: 100, weight: 90.0}"

    assertEquals(warrior.toString(), expectedString)
  }
}
