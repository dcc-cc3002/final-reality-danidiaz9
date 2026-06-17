package gameunits.character

import gameunits.GameUnit

import java.util.Objects
import scala.collection.mutable.ArrayBuffer

/** A class representing a party of gameunits in the game.
 *
 *  @constructor Creates a new party with an empty list of gameunits.
 */

class Party extends Equals {

  /** The list of gameunits in the party. */
  val characters: ArrayBuffer[GameUnit] = new ArrayBuffer()

  /** Adds a character to the party.
   *
   *  @param c The character to add to the party.
   */
  def addCharacter(c: GameUnit): Unit = {
    characters += c
  }

  /** Prints the status of the party, indicating whether it's defeated or alive based on
   * the total health points of its members. */
  def partyStatus(): Unit = {
    var partyHealthPoints: Int = 0
    for (character <- characters) {
      partyHealthPoints += character.getHealthPoints
    }
    if (partyHealthPoints == 0) {
      println("Defeated Party")
    }
    else
      println("Alive Party")
  }

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Party]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Party]
      characters == other.characters
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Party], characters)

  override def toString: String = s"Party {" +
    s"gameunits: $characters" +
    s"}"
}