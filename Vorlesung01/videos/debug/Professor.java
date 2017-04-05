package debug;

/**
 * 
 * This class represents a professor with main attributes like employee number and an acronym.
 * A professor has also properties from Person like first and last name
 * 
 * @author Stephanie Boehning
 * @see Person
 */
public class Professor extends Person {
	
	private String employeeNum;
	private String acronym;
	
	/**
	 * 
	 * A professor is created with a first and a last name, a employee number and an acronym.
	 * 
	 * @param firstName of the person
	 * @param lastName of the person
	 * @param employeeNum of the professor, it has to be unique
	 * @param acronym of the professor, it has to be unique
	 */
	public Professor(String firstName, String lastName, String employeeNum, String acronym) {
		super(firstName, lastName);
		this.acronym = acronym;
		this.employeeNum = employeeNum;
	}
	
	/**
	 * Returns the acronym of the professor, with which is unique
	 * @return acronym as a string
	 */
	public String getAcronym() {
		return acronym;
	}
	
	/**
	 * Returns the employee number of the professor
	 * @return employee number as a string
	 */
	public String getEmployeeNum() {
		return employeeNum;
	}
	
	/**
	 * The toString method is overridden and returns the name of the person, 
	 * the employee number and the acronym
	 * @return A string is returned in this format: 
	 * "first name last name (employee number) : acronym"
	 */
	@Override
	public String toString() {
		return super.toString() + " (" + employeeNum + ") : " + acronym;
	}

}
