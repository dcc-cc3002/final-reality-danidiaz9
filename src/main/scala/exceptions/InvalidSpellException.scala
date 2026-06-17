package exceptions

/**
 * Custom exception to signal an invalid spell action in the game.
 *
 * This exception is designed to provide specific feedback about
 * invalid spell actions. For instance, if a character attempts to cast
 * a spell without sufficient mana, or if a spell is cast on an invalid target,
 * this exception could be thrown with a detailed message indicating the nature of the problem.
 *
 * @example To throw the exception with specific details:
 * {{{
 * throw new InvalidSpellException("Not enough mana to cast the spell.")
 * // => InvalidSpellException: An invalid spell was found -- Not enough mana to cast the spell.
 * }}}
 *
 * @param details A descriptive message detailing the nature of the invalid spell action.
 */

class InvalidSpellException(details: String) extends Exception(s"An invalid spell was found -- $details")