package charactersTest

import characters.{Party, TCharacter}
import characters.common.Warrior
import characters.magic.WhiteWizard

import scala.collection.mutable.ArrayBuffer

class PartyTest extends munit.FunSuite {

  test("Party adds characters correctly") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    party.addCharacter(warrior)
    party.addCharacter(wizard)

    assertEquals(party.characters, ArrayBuffer[TCharacter](warrior, wizard))
  }

  test("Party status: Alive") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    party.addCharacter(warrior)
    party.addCharacter(wizard)

    party.partyStatus()

   assertEquals(party.partyStatus(), println("Alive Party"))
  }

  test("Party status: Defeated") {
    val party = new Party()
    val warrior = new Warrior("Conan", 0, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 0, 80, 70.0, 100)

   party.addCharacter(warrior)
   party.addCharacter(wizard)

   party.partyStatus()

   assertEquals(party.partyStatus(), println("Defeated Party"))
  }

  test("Party equality") {
    val party1 = new Party()
    val party2 = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    party1.addCharacter(warrior)
    party1.addCharacter(wizard)
    party2.addCharacter(warrior)
    party2.addCharacter(wizard)

    assertEquals(party1, party2)
  }

  test("Party hash code") {
    val party1 = new Party()
    val party2 = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    party1.addCharacter(warrior)
    party1.addCharacter(wizard)
    party2.addCharacter(warrior)
    party2.addCharacter(wizard)
    assertEquals(party1.hashCode(), party2.hashCode())
  }

  test("Test party toString") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    party.addCharacter(warrior)
    party.addCharacter(wizard)
    assertEquals(party.toString(), s"Party {characters: ArrayBuffer(Warrior {name: Conan, healthPoints: 150, " +
      s"defense: 100, weight: 90.0}, WhiteWizard {name: Gandalf, healthPoints: 120, defense: 80, weight: 70.0, " +
      s"manaPoints: 100})}")
  }
}