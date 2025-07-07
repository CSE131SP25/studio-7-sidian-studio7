package studio7;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public void area() {
		double a = this.width * this.length;
		System.out.println("Rectangle area: " + a);
	}
	
	public void perimeter() {
		double p = this.width * 2 + this.length * 2;
		System.out.println("Rectangle perimeter: " + p);
	}
	
	public boolean isSmallerThan(Rectangle other) {
		double thisArea = this.length * this.width;
		double otherArea = other.length * other.width;
		return thisArea < otherArea;
	}
	
	public boolean isSquare() {
		return this.length == this.width;
	}
	
	
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5,10);
		rect1.area();
		rect1.perimeter();
		
		Rectangle rect2 = new Rectangle(10,10);
		
		System.out.println("Is rect1 smaller than rect2? " + rect1.isSmallerThan(rect2));
		System.out.println("Is rect2 a square? " + rect2.isSquare());
		
	}
	
	
	
}
