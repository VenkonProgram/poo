
//Rectangle is a class
// The class Rectangle describes the concept of what a car is
public class Rectangle {
	// Length and width are the attributes both are variables declared inside a class
	private int length;
	private int width;
	
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}
	//area and perimeter are both methods that return something
	public int area(){
		return this.length * this.width;
	}
	public int perimeter(){
		return this.length*2 + this.width*2;
	}
	
	public static void main(String[] args){
		// Stitch is an object and it's an instance of a the class Rectangle
		Rectangle stitch = new Rectangle (2, 3);
		System.out.println(stitch.area());
		System.out.println(stitch.perimeter());		
	}
}
