/*5. Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
			1 - method of parent class by object of parent class
			2 - method of child class by object of child class
			3 - method of parent class by object of child class*/


class Parent{

	public void getParent(){
		System.out.println(" This is Parent");
	}
}

class Child extends Parent {

	public void getChild(){
		System.out.println(" This is Child Class");
	}	
}

public class MainParentClass{
	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();

		p.getParent();
		c.getChild();
		c.getParent();
			
	}	
}