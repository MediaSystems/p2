package debug;

/**
 * 
 * This class represents a student with main attributes 
 * like matriculation number and a user name.
 * A student has also properties from Person like first and last name
 * 
 * @author Stephanie Boehning
 * @see Person
 */
public class Student extends Person {
	
	private String matrNum;
	private String userName;

	/**
	 * A student is created with a first and a last name, 
	 * a matriculation number and a user name.
	 * 
	 * @param firstName of the person
	 * @param lastName of the person
	 * @param matrNum of the student
	 * @param userName of the student to log in into systems
	 */
	public Student(String firstName, String lastName, String matrNum, String userName) {
		super(firstName, lastName);
		this.userName = userName;
		this.matrNum = matrNum;
	}
	
	/**
	 * Returns the matriculation number of the student
	 * @return matriculation number as a string
	 */
	public String getMatrNum() {
		return matrNum;
	}
	
	/**
	 * Returns the user name of the student, with which the student can log in into systems
	 * @return user name as a string
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * The toString method is overridden and returns the name of the person, 
	 * the matriculation number and the user name
	 * @return A string is returned in this format: 
	 * "first name last name (matriculation number) : user name"
	 */
	@Override
	public String toString() {
		return super.toString() + " (" + matrNum + ") : " + userName; 
	}

}
