abstract class Shape2 {
	public double res = 0;
	public abstract double area();
	public void printArea() {
		System.out.println( "¸éÀûÀº " + res);
	}
}
class Circle extends Shape2 {
	public int r = 5;
	@Override
	public double area() {
		res = r * r * Math.PI;	return res;
	}
}
class Rectangle1 extends Shape2 {
	public int w = 10, h =  10;
	@Override
	public double area() {
		res = w * h;		return res;
	}
}
public class Ex12 {
	public static void main(String[] args) {
		Shape2 ref = null;
		ref = new Circle();
		ref.area();
		ref.printArea();
		ref = new Rectangle1();
		ref.area();
		ref.printArea();
	}
}
