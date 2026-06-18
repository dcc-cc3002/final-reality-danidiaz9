package weaponryTest

import weaponry.weapons.magics.AbstractMagicalW
import characters.player.TraitPlayer

class MagicalWeaponryTest extends munit.FunSuite {

  class TestMagicalWeapon(name: String,
                          attackPoints: Int,
                          weight: Double,
                          owner: Option[TraitPlayer],
                          magicAttackPoints: Int)
    extends AbstractMagicalW(name, attackPoints, weight, owner, magicAttackPoints)

  var weapon: TestMagicalWeapon = _

  override def beforeEach(context: BeforeEach): Unit = {
    weapon = new TestMagicalWeapon("Staff", 8, 4.0, None, 12)
  }

  test("getName returns correct name") {
    assertEquals(weapon.getName, "Staff")
  }

  test("getAttackPoints returns correct attack points") {
    assertEquals(weapon.getAttackPoints, 8)
  }

  test("getWeight returns correct weight") {
    assertEquals(weapon.getWeight, 4.0)
  }

  test("getOwner returns None by default") {
    assertEquals(weapon.getOwner, None)
  }

  test("getMagicAttackPoints returns correct magic attack points") {
    assertEquals(weapon.getMagicAttackPoints, 12)
  }

  test("toString returns expected string representation") {
    val expected = "MagicalWeapon {name: Staff, attackPoints: 8, weight: 4.0, owner: None, magicAttackPoints: 12}"
    assertEquals(weapon.toString, expected)
  }

  test("equals method works correctly") {
    val sameWeapon = new TestMagicalWeapon("Staff", 8, 4.0, None, 12)
    val differentWeapon = new TestMagicalWeapon("Wand", 8, 3.0, None, 10)

    assert(weapon.equals(sameWeapon))
    assert(!weapon.equals(differentWeapon))
  }

  test("hashCode method works correctly") {
    val sameWeapon = new TestMagicalWeapon("Staff", 8, 4.0, None, 12)

    assertEquals(weapon.hashCode(), sameWeapon.hashCode())
  }
}
