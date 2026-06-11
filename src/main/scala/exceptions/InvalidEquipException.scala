package exceptions

/**
 * Custom exception to signal an invalid equipment action.
 *
 * This exception is designed to provide more specific feedback about
 * invalid equipment actions. For instance, if a character tries to equip
 * an incompatible weapon, this exception could be thrown with a detailed
 * message indicating the nature of the problem.
 *
 * @example To throw the exception with specific details:
 * {{{
 * throw new InvalidEquipException("Player cannot has this weapon.")
 * // => InvalidEquipException: An invalid equip was found -- Player must has a valid weapon.
 * }}}
 *
 * @param details A descriptive message detailing the nature of the invalid equipment action.
 */

class InvalidEquipException(details: String) extends Exception(s"An invalid equip was found -- $details")
