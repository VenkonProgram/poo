//Encapsulation
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int l, int w, int x, int y) {
		this.length = l;
		this.width = w;
	}
	public int area(){
		return length * width;
	}
	public int perimeter(){
		return length*2 + width*2;
	}
	
	public static void main(String[] args){
		Rectangle stitch = new Rectangle (2, 3, 4, 5);
		System.out.println(stitch.area());
		System.out.println(stitch.perimeter());		
	}
}
