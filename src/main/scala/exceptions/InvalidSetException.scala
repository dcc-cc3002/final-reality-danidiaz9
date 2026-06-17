package exceptions

/**
 * Custom exception to signal an invalid weapon assignment action.
 *
 * This exception is designed to provide more specific feedback about
 * invalid weapon assignment actions. For instance, if a character tries to assign
 * an incompatible weapon, this exception could be thrown with a detailed
 * message indicating the nature of the problem.
 *
 * @example To throw the exception with specific details:
 * {{{
 * throw new InvalidSetException("Weapon cannot be setting in this character.")
 * // => InvalidSetException: An invalid set was found -- Weapon must be setting in a valid character.
 * }}}
 *
 * @param details A descriptive message detailing the nature of the invalid weapon assignment action.
 */

class InvalidSetException(details: String) extends Exception(s"An invalid set was found -- $details")