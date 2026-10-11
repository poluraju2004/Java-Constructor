/*1. Create class Box and Box3d. Box3d is extended class of Box. The above two classes going to fulfill the following requirement. Box. 
Include constructor, set value of length, breadth, height. Find out area and volume
*/

class Box{
	private int length;
	private int breadth;

	public Box(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public int getArea(){
		System.out.println( "Area "+ (length * breadth));
		return(length * breadth);
	}
	public int area(){
		return (length * breadth);
	}
}

 class Box3d extends Box{
 	private int height;
 	public Box3d(int length, int breadth, int height){
 		super(length, breadth);
 		this.height = height;
	}
	public void getVolume(){
		int area = area();
		System.out.println("Volume " + (area*height) );
	}
}

public class Main{
	public static void main(String[] args) {
		Box b = new Box(10, 20);
		b.getArea();

		Box3d b1 = new Box3d(10, 20, 30);
		b1.getVolume();	
	}
}