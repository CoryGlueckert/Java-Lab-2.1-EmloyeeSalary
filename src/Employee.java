
public class Employee 
{
	private String firstName;
	
	private String lastName;
	
	private Double monthlySalary;

	public Employee() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param monthlySalary
	 */
	
	public Employee(String firstName, String lastName, Double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		setMonthlySalary(monthlySalary);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the monthlySalary
	 */
	public Double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(Double monthlySalary) {
		if(monthlySalary > 0.0)
		{
			this.monthlySalary = monthlySalary;
		}
	}
	
	public double yearlySalary(){
		
		return monthlySalary * 12;
	}	
	
	public double raise(){
		
		return yearlySalary() * .10d;
	}
	
}
