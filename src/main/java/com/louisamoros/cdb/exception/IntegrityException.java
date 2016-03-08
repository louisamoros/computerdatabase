package com.louisamoros.cdb.exception;

/**
 * Integrity exception class used for non valid attributes.
 */
public class IntegrityException extends RuntimeException {

    private static final long serialVersionUID = -4752871327020390873L;

    /**
     * Thrown an integrity runtime exception.
     *
     * @param message
     */
    public IntegrityException(final String message) {
        super(message);
    }

}
