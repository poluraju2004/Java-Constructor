/* 6. Create a class named 'Member' having the following members: Data members: 1 – Name, 2 – Age, 3 - Phone number, 4 – Address, 5 - SalaryIt also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.The 'Employee' and 'Manager' classes have data members'specialization' and 'department' respectively.Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/
class Member{
	private String name;
	private int age;
	private long phnum;
	private String address;
	private double salary;
	public Member(String name, int age, long phnum, String address, double salary){
		this.name = name;
		this.age = age;
		this.phnum = phnum;
		this.address = address;
		this.salary = salary;
	}
	public void printSalary(){
		System.out.println("Name = " + name + " Age = " + age + " Phone Number = " + phnum + " Address = " + address + " Salary = " + salary);
	}
}
class Employee extends Member{
	private String specialization;
	public Employee(String name, int age, long phnum, String address, double salary, String specialization){
		super(name, age, phnum, address, salary);
		this. specialization = specialization;
	}

	public void printSalary(){
		super.printSalary();
		System.out.println("Specialization = "+ specialization);
	}
}
class Manager extends Member{
	private String department;
	public Manager(String name, int age, long phnum, String address, double salary, String department){
		super(name, age, phnum, address, salary);
		this.department = department;
	}

	public void printSalary(){
		super.printSalary();
		System.out.println( "Department" + department);
	}
}

class driver{
	public static void main(String[] args) {
		Member m = new Member("abc", 102, 987654321, "HYD", 20300.0);
		m.printSalary();
		Employee e = new Employee("bob", 202, 876543219, "CHN", 30000.0, "AI");
		e.printSalary();
		Manager m1 = new Manager("xyz", 3, 176543219, "VIZAG", 5000.0, "AC");
		m1.printSalary();
	}
}