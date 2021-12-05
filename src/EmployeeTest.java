//Unit 1.11: Performance Assessment
//Author: Mike Knoles

public class EmployeeTest {

	public static void main(String[] args) {	
		//create two Employee objects
		Employee employee1 = new Employee ("Mark", "Smith", 50000.00);
		Employee employee2 = new Employee ("Angie", "Taylor", 55000.00);
		
		
		//display the yearly salary for each object
		System.out.printf("The salary for %s %s is: $%.2f%n",
				employee1.getFname(), employee1.getLname(), employee1.getSalary());
		System.out.printf("The salary for %s %s is: $%.2f%n",
				employee2.getFname(), employee2.getLname(), employee2.getSalary());
	}

}
