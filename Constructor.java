//Demonstrate calling the constructor of the base class from the constructor of the derived class. 
//Create objects of person and employee classes to show the order of invocation of constructors.

class Person{
	private String name;
	private String city;

	public Person(String name, String city){
		this.name = name;
		this.city = city;
	}

	public void getPerson(){
		System.out.println("Name " + name + " city " + city);
	}

}

class Employee extends Person{
	private int empid;
	private String role;

	public Employee(String name, String city,int empid, String role){
		super(name, city);
		this.empid = empid;
		this.role = role;
	}

	public void getEmployee(){
		System.out.println("Empid " + empid + " role " + role);
	}
}



class Constructor{
	public static void main(String[] args) {
		Person p1 = new Person("Abc", "Hyd");
		p1.getPerson();

		Employee e1 = new Employee("Abc", "Hyd", 123, "Dev");
		e1.getEmployee();
		
	}
}