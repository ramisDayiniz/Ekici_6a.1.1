/**
 * An Exception class for Stacks, which are empty (null)
 * and cannot return anything. This class is especially for
 * GenericStackClass and it is an unchecked Exception,
 * because a lot of Java’s built-in collections and data structures
 * (like ArrayList, Stack) use unchecked exceptions. Therefore
 * it extends RuntimeException class.
 * @author Ramis Ekici
 * @version 16-02-2025
 */

public class StackEmptyException extends RuntimeException {


    /**
     * A constructure, which is for putting error or Exceptions
     * messages out. It has a parameter, which is the message itself
     * @param message the message, which is the output
     */
    public StackEmptyException(String message) {
        super(message);
    }

    /**
     * A default constructure without a parameter, which has
     * "The Stack is empty, you cant return anything!".
     */
    public StackEmptyException() {
        this("The Stack is empty, you cant return anything!");
    }

    /**
     * A constructor that takes both a custom message and a cause for the exception.
     * This can be used to provide more detailed error information, especially when
     * an exception occurs due to another underlying exception.
     * @param message the custom error message to be displayed
     * @param cause the underlying exception that caused this exception
     */
    public StackEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

}
