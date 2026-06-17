package model.effects

import model.gameunits.character.commons.Ninja
import model.gameunits.character.magics.{BlackMage, WhiteMage}
import model.gameunits.enemies.Enemy
import model.weapons.magics.Wand

class ParalyzedTest extends munit.FunSuite {

  var wand: Wand = _
  var ninja: Ninja = _
  var blackWizard: BlackMage = _
  var whiteWizard: WhiteMage = _
  var enemy: Enemy = _
  val paralyzed = new Paralyzed()

  override def beforeEach(context: BeforeEach): Unit = {

    wand = new Wand("Magic Wand", 20, 3.5, None, 25)
    ninja = new Ninja("Ryu", 120, 120, 15, 70.0, None)
    blackWizard = new BlackMage("Gandalf", 150, 150, 20, 80.0, 200, 200, None)
    whiteWizard = new WhiteMage("Saruman", 140, 140, 18, 75.0, 190, 190, None)
    enemy = new Enemy("Goblin", 100, 100, 20, 10, 50.0)

  }

  test("Paralyzed effect should apply paralyzed effect") {
    paralyzed.applyEffect(whiteWizard, enemy)

  }

}
