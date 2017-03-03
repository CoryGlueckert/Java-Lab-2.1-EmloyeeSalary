
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee ("Cory", "Glueckert", 3000d );
		Employee employee2 = new Employee ("Jack", "Frost", 5000d );
		System.out.printf("employee1 name is: %s %s $%.2f \n", employee1.getFirstName(),employee1.getLastName(), employee1.yearlySalary() + employee1.raise());
		System.out.printf("employee2 name is: %s %s $%.2f", employee2.getFirstName(),employee2.getLastName(), employee2.yearlySalary() + employee2.raise());
	}

}
