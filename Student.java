/**
 * Reading exercise for 2/1/2016
 * 
 * @author An
 *
 */

public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int age;

	/**
	 * 
	 * @param firstName, non empty string
	 * @param lastName, non empty string
	 * @param id non-negative integer
	 * @param age non-negative integer
	 * @return nothing
	 */
	public Student(String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}

	/**
	 * 
	 * @param firstName,
	 *            a non empty string
	 * @param lastName,
	 *            a non empty string
	 */
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return First and last name of student in format "<first> <last>" 
	 */
	
	public String getName() {
		return (this.firstName + this.lastName);
	}

	/**
	 * 
	 * @param id, non-negative integer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return id, non-negative integer
	 */
	public int getID() {
		return this.id;
	}

	/**
	 * 
	 * @param age, non-negative integer
	 * @throw IllegalArgumentException if an integer value less than 1 is given
	 */
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * 
	 * @return age of student, a non-negative, non-zero integer
	 */
	public int getAge() {
		return this.age;
	}

}
