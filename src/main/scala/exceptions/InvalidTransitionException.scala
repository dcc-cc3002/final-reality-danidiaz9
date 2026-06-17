package exceptions

/**
 * Exception thrown when an invalid transition is encountered.
 *
 * @param details Details about the invalid transition.
 */
class InvalidTransitionException(details: String) extends Exception(s"An invalid transition was found -- $details")
