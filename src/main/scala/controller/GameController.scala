package controller

import controller.states.{ActionBarState, GameState}
import controller.TurnScheduler
import model.gameunits.GameUnit
import model.gameunits.character.Character
import model.gameunits.character.commons.{Ninja, Paladin, Warrior}
import model.gameunits.character.magics.{BlackMage, WhiteMage}
import model.gameunits.enemies.Enemy
import model.weapons.commons.{Axe, Bow, Sword}
import model.weapons.magics.{Staff, Wand}

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class GameController {

  var state: GameState = _
  private val ai = new Random()

  //Characters
  val Hanzo = new Ninja("Hanzo", 100, 100, 20, 70.0, None)
  val Arthur = new Paladin("Arthur", 150, 150, 30, 80.0, None)
  val Conan = new Warrior("Conan", 200, 200, 40, 100.0, None)
  val Gandalf = new BlackMage("Gandalf", 150, 150, 30, 80.0, 100, 100, None)
  val Saruman = new WhiteMage("Saruman", 150, 50, 30, 80.0, 100, 100, None)

  //Enemies
  val enemy1 = new Enemy("Goblin", 100, 100, 20, 10, 50.0)
  val enemy2 = new Enemy("Orc", 120, 120, 30, 15, 70.0)
  val enemy3 = new Enemy("Ogre", 150, 150, 40, 25, 100.0)
  val enemy4 = new Enemy("Troll", 120, 120, 20, 15, 60.0)
  val enemy5 = new Enemy("Undead", 200, 200, 10, 10, 30.0)

  //Axes
  val Battleaxe1 = new Axe("Battleaxe", 40, 7.0, None)
  val Battleaxe2 = new Axe("Battleaxe", 50, 15.0, None)

  //Bows
  val Longbow1 = new Bow("Longbow", 25, 3.0, None)
  val Longbow2 = new Bow("Longbow", 40, 8.0, None)
  val ElvenBow = new Bow("Elven Bow", 100, 8.0, None)

  //Swords
  val Katana = new Sword("Katana", 30, 2.5, None)
  val Excalibur = new Sword("Excalibur", 50, 5.0, None)
  val BroadSword = new Sword("Broad Sword", 60, 10.0, None)
  val DarkSword = new Sword("Dark Sword", 70, 12.0, None)

  //Staves
  val DarkStaff = new Staff("Dark Staff", 90, 15.0, None, 120)
  val HolyStaff = new Staff("Holy Staff", 150, 12.0, None, 180)

  //Wands
  val MagicWand1 = new Wand("Magic Wand", 20, 2.0, None, 30)
  val MagicWand2 = new Wand("Magic Wand", 120, 7.0, None, 150)
  val ElderWand = new Wand("Elder Wand", 80, 10.0, None, 100)

  private val l: List[GameUnit] = List(Hanzo,Arthur,Conan,Gandalf,Saruman,
    enemy1,enemy2,enemy3,enemy4,enemy5)

  def start(): Unit = {}


  def turn(): Unit = {

    state = new ActionBarState(GameController.this)

  }
}
