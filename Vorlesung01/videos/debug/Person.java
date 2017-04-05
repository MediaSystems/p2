package debug;

/**
 * This class represents a person with main attributes like first and last name.
 * 
 * @author Stephanie Boehning
 *
 */
public class Person {

	private String firstName;
	private String lastName;
	
	/**
	 * A person is created with a first and a last name
	 * @param firstName of the person
	 * @param lastName of the person
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Returns the first name of the person
	 * @return first name as a string
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Returns the last name of the person
	 * @return last name as a string
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * The toString method is overridden and returns the name of the person
	 * @return A string with the first name and last name is returned 
	 */
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
