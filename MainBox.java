/*1. Create class Box and Box3d. Box3d is extended class of Box. 
The above two classes going to fulfill the following requirement. 
Include constructor, set value of length, breadth, height. Find out area and volume.*/

class Box{
	double length;
	double breadth;
	public Box(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public double getBox(){
		return(length*breadth);
	}
}
class Box3d extends Box{
	double height;
	public Box3d(double length,double breadth,double height){

		super(length,breadth);
		this.height = height;
	}
	public void getBox3d(){
		double getBox = getBox();
		double volume = getBox*height;
		System.out.println("Volume = "+ volume);
	}
}

public class MainBox{
	public static void main(String[] args) {
		Box b = new Box(25,26);
		System.out.println("Box area = " + b.getBox());

		Box3d b1 = new Box3d(26,25,26);
		b1.getBox3d();
	}
	
}