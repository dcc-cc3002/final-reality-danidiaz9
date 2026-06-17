package exceptions

/** Custom exception to signal an invalid party encountered.
 *
 * This exception is designed to provide specific feedback about
 * invalid parties in the game. For instance, if a party contains
 * more than the allowable number of characters, this exception could
 * be thrown with a detailed message indicating the nature of the problem.
 *
 * @example To throw the exception with specific details:
 * {{{
 * throw new InvalidPartyException("A party cannot contain more than 3 characters.")
 * // => InvalidPartyException: An invalid party was found -- A party cannot contain more than 3 characters.
 * }}}
 *
 * @param details A descriptive message detailing the nature of the invalid party.
 */

class InvalidPartyException(details: String) extends Exception(s"An invalid party was found -- $details")