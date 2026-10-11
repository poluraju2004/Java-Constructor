//Write a program to give example for multilevel inheritance in Java.

class Person{
	private int pid;
	private String name;

	public void setPerson(int pid,String name){
		this.pid = pid;
		this.name = name;
	}
	public void getPerson(){
		System.out.println(" pid " + pid + " name " + name);
	}
}
class Employee extends Person {
	private int empid;
	private String ename;

	public void setEmployee(int empid, String ename){
		this.empid = empid;
		this.ename = ename;
	}
	public void getEmployee(){
		System.out.println(" empid " + empid + " ename " + ename);
	}
}
class Manager extends Employee {
	private int mangid;
	private String managename;

	public void setManager(int mangid, String managename){
		this.mangid = mangid;
		this.managename = managename;
	}
	public void getManager(){
		System.out.println(" empid " + mangid + " ename " + managename);
	}	
}

public class MultilevelInheritance{
	public static void main(String[] args) {

		Manager c = new Manager();

		c.setPerson(101,"Persons");
		c.getPerson();

		c.setEmployee(201,"Employee");
		c.getEmployee();

		c.setManager(101,"Manager");
		c.getManager();	
	}	
}