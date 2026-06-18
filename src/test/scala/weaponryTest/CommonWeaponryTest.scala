package weaponryTest

import weaponry.weapons.commons.AbstractCommonW
import characters.player.TraitPlayer

class CommonWeaponryTest extends munit.FunSuite {

  class TestCommonWeapon(name: String, attackPoints: Int, weight: Double, owner: Option[TraitPlayer])
    extends AbstractCommonW(name, attackPoints, weight, owner)

  var weapon: TestCommonWeapon = _

  override def beforeEach(context: BeforeEach): Unit = {
    weapon = new TestCommonWeapon("Sword", 10, 5.0, None)
  }

  test("getName returns correct name") {
    assertEquals(weapon.getName, "Sword")
  }

  test("getAttackPoints returns correct attack points") {
    assertEquals(weapon.getAttackPoints, 10)
  }

  test("getWeight returns correct weight") {
    assertEquals(weapon.getWeight, 5.0)
  }

  test("getOwner returns None by default") {
    assertEquals(weapon.getOwner, None)
  }

  test("toString returns expected string representation") {
    val expected = "Weapon {name: Sword, attackPoints: 10, weight: 5.0, owner: None}"
    assertEquals(weapon.toString, expected)
  }

  test("equals method works correctly") {
    val sameWeapon = new TestCommonWeapon("Sword", 10, 5.0, None)
    val differentWeapon = new TestCommonWeapon("Axe", 8, 4.0, None)

    assert(weapon.equals(sameWeapon))
    assert(!weapon.equals(differentWeapon))
  }

  test("hashCode method works correctly") {
    val sameWeapon = new TestCommonWeapon("Sword", 10, 5.0, None)

    assertEquals(weapon.hashCode(), sameWeapon.hashCode())
  }
}
