package weaponryTest

import weaponry.weapons.commons.AbstractCommonW

class AbstractCommonPWTest extends munit.FunSuite {

  test("Weapon equality") {
    val weapon1 = new AbstractCommonW("Sword", 50, 10.0, null)
    val weapon2 = new AbstractCommonW("Sword", 50, 10.0, null)
    val weapon3 = new AbstractCommonW("Axe", 60, 12.0, null)

    assertEquals(weapon1, weapon2)
    assertNotEquals(weapon1, weapon3)
  }

  test("Weapon hash code") {
    val weapon1 = new AbstractCommonW("Sword", 50, 10.0, null)
    val weapon2 = new AbstractCommonW("Sword", 50, 10.0, null)

    assertEquals(weapon1.hashCode(), weapon2.hashCode())
  }

  test("Weapon toString") {
    val weapon = new AbstractCommonW("Sword", 50, 10.0, null)
    val expectedString = "Weapon {name: Sword, attackPoints: 50, weight: 10.0, owner: null}"

    assertEquals(weapon.toString(), expectedString)
  }
}
