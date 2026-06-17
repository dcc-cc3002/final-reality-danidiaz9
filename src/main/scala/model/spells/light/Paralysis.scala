package model.spells.light

import model.effects.{Effects, Effect, Paralyzed}
import model.gameunits.GameUnit
import model.gameunits.character.Character

/**
 * A class representing a paralysis spell in the game.
 *
 * Provides functionality to apply a paralysis effect to a target game unit using mana from the casting character.
 */
class Paralysis extends AbstractLight {

  /**
   * The mana cost of the paralysis spell.
   */
  override val manaCost: Int = 25
  /**
   * The effect applied by the paralysis spell.
   */
  override val effect: Effect = new Effects(List[Paralyzed]())

  /**
   * Applies paralysis to a target game unit.
   *
   * @param target The game unit to be paralyzed.
   * @param from The character casting the paralysis spell.
   */
  def applyParalysisTo(target: GameUnit, from: Character): Unit = {
    effect.applyEffect(from, target)
  }

}
