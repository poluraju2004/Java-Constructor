/*Define a base class Person and a derived class employee with single inheritance.Define SetData() member functions in each of the class with different signatures to set the data members and demonstrate overloading of member functions.
  Define GetData() member functions in each of the class with same signatures to display data and demonstrate overriding of member functions.*/

class Person{
	int pid;
	String name;
	String city;

	public void setData(int pid,String name,String city){
		this.pid = pid;
		this.name = name;
		this.city = city;
	}
	public void setData(int pid,String name){
		this.pid = pid;
		this.name = name;
	}
	public void getData(){
		System.out.println(" pid = "+ pid + " name = "+ name + " city = " + city); 
	}	
}

class Employee extends Person{
	int empid;
	String name;
	String gender;
	public void setData(int empid,String name,String gender){
		this.empid = empid;
		this.name = name;
		this.gender = gender;
	}
	public void getData(){
		System.out.println(" empid = " + empid + " name =  " + name + " gender =  " + gender);
	}
}

public class SingleInheritance{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		//e1.Data();
		e1.setData(205,"ABC","Male");
		e1.getData();

		Person p1 = new Person();
		p1.setData(405,"Person name" ,"Hyd");
		p1.getData();
	}

}