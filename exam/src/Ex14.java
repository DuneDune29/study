interface Drawable {
	public abstract void draw();
}
abstract class Shape {
	public double res = 0;
	public abstract double area();
	public void printArea() {
		System.out.println("������ " + res);
	}
}
class Rectangle extends Shape implements Drawable {
	public int w = 10, h =  10;
	@Override
	public double area() {
		res = w * h;		return res;
	}
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
}
public class Ex14 {
	public static void main(String[] args) {
		Rectangle ref = null;
		ref = new Rectangle();
		ref.area();
		ref.printArea();
		ref.draw();
	}
}