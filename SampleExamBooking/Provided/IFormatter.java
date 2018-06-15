package SampleExamBooking.Provided;

/**
 * This interface represents the concept of formatting of objects.
 * Implementing classes provide methods to create a formatted object.
 *
 * @param <T> the type of objects to be formatted
 */
public interface IFormatter<T> {

	/**
	 * Creates a string representation for an object.
	 * 
	 * @param t the object to be formatted
	 * @return the formatted string representing the object
	 */
	public abstract String format(T t);

}