package gameunits

import gameunits.character.commons.Warrior
import gameunits.GameUnit
import gameunits.character.Party
import gameunits.character.magics.WhiteMage

import scala.collection.mutable.ArrayBuffer

class PartyTest extends munit.FunSuite {

  class TestParty extends Party

  test("Party adds gameunits correctly") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0, None)
    val wizard = new WhiteMage("Gandalf", 120, 80, 70.0, 100, None)

    party.addCharacter(warrior)
    party.addCharacter(wizard)

    assertEquals(party.characters, ArrayBuffer[GameUnit](warrior, wizard))
  }

  test("Party status: Alive") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0, None)
    val wizard = new WhiteMage("Gandalf", 120, 80, 70.0, 100, None)

    party.addCharacter(warrior)
    party.addCharacter(wizard)

    party.partyStatus()

   assertEquals(party.partyStatus(), println("Alive Party"))
  }

  test("Party status: Defeated") {
    val party = new Party()
    val warrior = new Warrior("Conan", 0, 100, 90.0, None)
    val wizard = new WhiteMage("Gandalf", 0, 80, 70.0, 100, None)

   party.addCharacter(warrior)
   party.addCharacter(wizard)

   party.partyStatus()

   assertEquals(party.partyStatus(), println("Defeated Party"))
  }

  test("Party equality") {
    val party1 = new Party()
    val party2 = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0, None)
    val wizard = new WhiteMage("Gandalf", 120, 80, 70.0, 100, None)

    party1.addCharacter(warrior)
    party1.addCharacter(wizard)
    party2.addCharacter(warrior)
    party2.addCharacter(wizard)

    assertEquals(party1, party2)
  }

  test("Party hash code") {
    val party1 = new Party()
    val party2 = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0, None)
    val wizard = new WhiteMage("Gandalf", 120, 80, 70.0, 100, None)

    party1.addCharacter(warrior)
    party1.addCharacter(wizard)
    party2.addCharacter(warrior)
    party2.addCharacter(wizard)
    assertEquals(party1.hashCode(), party2.hashCode())
  }

  test("Test party toString") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0, None)
    val wizard = new WhiteMage("Gandalf", 120, 80, 70.0, 100, None)

    party.addCharacter(warrior)
    party.addCharacter(wizard)
    assertEquals(party.toString(), s"Party {gameunits: ArrayBuffer(Warrior {name: Conan, healthPoints: 150, " +
      s"defense: 100, weight: 90.0, weapons: None}, WhiteMage {name: Gandalf, healthPoints: 120, defense: 80, weight: 70.0, " +
      s"manaPoints: 100, weapons: None})}")
  }
}