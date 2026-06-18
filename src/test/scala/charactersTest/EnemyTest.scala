package charactersTest

import characters.Enemy

class EnemyTest extends munit.FunSuite {

  test("Enemy equality") {
    val enemy1 = new Enemy("Orc", 100, 30, 20, 80.0)
    val enemy2 = new Enemy("Orc", 100, 30, 20, 80.0)
    val enemy3 = new Enemy("Goblin", 80, 25, 15, 60.0)

    assertEquals(enemy1, enemy2)
    assertNotEquals(enemy1, enemy3)
  }

  test("Enemy hash code") {
    val enemy1 = new Enemy("Orc", 100, 30, 20, 80.0)
    val enemy2 = new Enemy("Orc", 100, 30, 20, 80.0)

    assertEquals(enemy1.hashCode(), enemy2.hashCode())
  }

  test("Enemy toString") {
    val enemy = new Enemy("Orc", 100, 30, 20, 80.0)
    val expectedString = "Enemy {name: Orc, healthPoints: 100, attackPoints: 30, defense: 20, weight: 80.0}"

    assertEquals(enemy.toString(), expectedString)
  }
}
