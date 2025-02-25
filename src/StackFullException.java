/**
 * An Exception class for Stacks, which are already full
 * and cannot be added more. This class is especially for
 * GenericStackClass and it is an unchecked Exception,
 * because a lot Java’s built-in collections and data structures
 * (like ArrayList, Stack) use unchecked exceptions. Therefore
 * it extends RuntimeException class.
 * @author Ramis Ekici
 * @version 16-02-2025
 */
public class StackFullException extends RuntimeException {
    /**
     * A constructure, which is for putting error or Exceptions
     * messages out. It has a parameter, which is the message itself
     * @param message the message, which is the output
     */
    public StackFullException(String message) {
        super(message);
    }

    /**
     * A default constructure without a parameter, which has
     * the output "The Stack is full, you cant add more!".
     */
    public StackFullException() {
        this("The Stack is full, you cant add more!");
    }

    /**
     * A constructor that takes both a custom message and a cause for the exception.
     * This can be used to provide more detailed error information, especially when
     * an exception occurs due to another underlying exception.
     * @param message the custom error message to be displayed
     * @param cause the underlying exception that caused this exception
     */
    public StackFullException(String message, Throwable cause) {
        super(message, cause);
    }

}
