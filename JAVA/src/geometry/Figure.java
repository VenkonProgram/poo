package geometry;
/*The Figure class is the superclass so it's the parent
  actually it's also an abstract class */
public abstract class Figure {
	private String figureName;
	private double area;
	
	public Figure(){
		figureName = "generic figure";
	}
	public Figure(String figureName){
		this.figureName = figureName;
		area = 0;
	}
	public Figure(String figureName, double area){
		this.figureName = figureName;
		this.area = area;
	}
	public String getFigureName(){
		return figureName;
	}
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}
