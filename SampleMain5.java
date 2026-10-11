/*5. Create a class with a method that prints "This is parent class" and its subclass with another
method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/

class Parent {

    void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    void childMethod() {
        System.out.println("This is child class");
    }
}

public class SampleMain5 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentMethod();

        System.out.println();

        Child c = new Child();
        c.childMethod();

        System.out.println();

        c.parentMethod();
    }
}