package exceptions

/** Custom exception to signal an invalid attack encountered.
 *
 * This exception is designed to provide specific feedback about
 * invalid attacks in the game. For instance, if a character attempts to
 * attack an ally of the same type, this exception could be thrown with a
 * detailed message indicating the nature of the problem.
 *
 * @example To throw the exception with specific details:
 * {{{
 * throw new InvalidAttackException("A character cannot attack an ally of the same type.")
 * // => InvalidAttackException: An invalid attack was found -- A character cannot attack an ally of the same type.
 * }}}
 *
 * @param details A descriptive message detailing the nature of the invalid attack.
 */

class InvalidAttackException(details: String) extends Exception(s"An invalid attack was found -- $details")