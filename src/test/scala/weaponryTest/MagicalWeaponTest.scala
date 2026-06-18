package weaponryTest

import weaponry.MagicalWeapon

class MagicalWeaponTest extends munit.FunSuite {

  test("MagicalWeapon equality") {
    val weapon1 = new MagicalWeapon("Staff of Fire", 40, 5.0, null, 20)
    val weapon2 = new MagicalWeapon("Staff of Fire", 40, 5.0, null, 20)
    val weapon3 = new MagicalWeapon("Wand of Ice", 30, 3.0, null, 15)

    assertEquals(weapon1, weapon2)
    assertNotEquals(weapon1, weapon3)
  }

  test("MagicalWeapon hash code") {
    val weapon1 = new MagicalWeapon("Staff of Fire", 40, 5.0, null, 20)
    val weapon2 = new MagicalWeapon("Staff of Fire", 40, 5.0, null, 20)

    assertEquals(weapon1.hashCode(), weapon2.hashCode())
  }

  test("MagicalWeapon toString") {
    val weapon = new MagicalWeapon("Staff of Fire", 40, 5.0, null, 20)
    val expectedString = "MagicalWeapon {name: Staff of Fire, attackPoints: 40, weight: 5.0, " +
      "owner: null, magicAttackPoints: 20}"

    assertEquals(weapon.toString(), expectedString)
  }
}
