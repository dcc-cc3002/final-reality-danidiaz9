package model.gameunits

import model.gameunits.enemies.Enemy

class EnemyTest extends munit.FunSuite {

  class TestEnemy(name: String, maxHealthPoints: Int, currentHealthPoints: Int,
                  attackPoints: Int, defense: Int, weight: Double)
    extends Enemy(name, maxHealthPoints, currentHealthPoints, attackPoints, defense, weight)

  var enemy: TestEnemy = _

  override def beforeEach(context: BeforeEach): Unit = {
    enemy = new TestEnemy("Goblin", 100, 100, 20, 10, 50.0)
  }

  test("getName returns correct name") {
    assertEquals(enemy.getName, "Goblin")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(enemy.getHealthPoints, 100)
  }

  test("getAttackPoints returns correct attackCharacter points") {
    assertEquals(enemy.getAttackPoints, 20)
  }

  test("getDefense returns correct defense points") {
    assertEquals(enemy.getDefense, 10)
  }

  test("getWeight returns correct weight") {
    assertEquals(enemy.getWeight, 50.0)
  }

  test("toString returns expected string representation") {
    val expected = "Enemy {name: Goblin, currentHealthPoints: 100, attackPoints: 20, defense: 10, weight: 50.0}"
    assertEquals(enemy.toString, expected)
  }

  test("equals method works correctly") {
    val sameEnemy = new TestEnemy("Goblin", 100, 100, 20, 10, 50.0)
    val differentEnemy = new TestEnemy("Orc", 120, 120, 30, 15, 70.0)

    assert(enemy.equals(sameEnemy))
    assert(!enemy.equals(differentEnemy))
  }

  test("hashCode method works correctly") {
    val sameEnemy = new TestEnemy("Goblin", 100, 100, 20, 10, 50.0)

    assertEquals(enemy.hashCode(), sameEnemy.hashCode())
  }

}
