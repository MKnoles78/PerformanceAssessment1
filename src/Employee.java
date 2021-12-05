//Unit 1.11: Performance Assessment
//Author: Mike Knoles

public class Employee {
	private String fname; //instance variable
	private String lname; //instance variable
	private double salary; //instance variable
	
	//Employee constructor that initializes the three variables
	public Employee (String fname, String lname, double salary) {
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	
	//Provide a set and get method for each instance variable
	public double setSalary(double salary)
	{
		return this.salary = salary;
	}
	public void setFname (String fname)
	{
		this.fname = fname;
	}
	public void setLname (String lname)
	{
		this.lname = lname;
	}
	//get methods return the values
	public String getFname()
	{
		return fname;
	}
	public String getLname()
	{
		return lname;
	}
	public double getSalary()
	{
		return salary;
	}

}
