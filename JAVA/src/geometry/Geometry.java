package geometry;

public class Geometry {

	public static void main(String[] args){
		Figure frisbee = new Circle("Frisbee");
        System.out.println("The area for the frisbee is: "+ frisbee.calculateArea());
        System.out.println("The perimeter for the frisbee is"+ frisbee.calculatePerimeter());
        Figure square = new Rectangle("Square");
        System.out.println("The area of the square is: "+ square.calculateArea());
        System.out.println("The perimeter of the square is: "+ square.calculatePerimeter());
        Figure bikini = new Triangle("Triangle");
        System.out.println("The area of the bikini is: "+ bikini.calculateArea());
        System.out.println("The perimeter of the bikini is: "+ bikini.calculatePerimeter());
	}
}	
