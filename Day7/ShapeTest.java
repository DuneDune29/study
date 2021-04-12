package Day7;

class Shape2 {
	protected int x, y;

	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle2 extends Shape2 {
	private int width, height;

	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle2 extends Shape2 {
	private int base, height;

	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle2 extends Shape2 {
	private int radius;

	public void draw() {
		System.out.println("Circle Draw");
	}
}

class Cylinder2 extends Shape2 {
	private int radius;

	public void draw() {
		System.out.println("Cylinder Draw");
	}
}
public class ShapeTest {
	//private static Shape arrayOfShapes[]; // 배열의 선언
	private  static Shape2[] arrayOfShapes;
	
	public static void main(String[] args) {
		init();
		drawALL();
	}
	
	public static void init() {
		//Shape[] arrayOfShapes = new Shape[4];
		arrayOfShapes = new Shape2[4]; // 배열의 생성
		arrayOfShapes[0] = new Rectangle2();
		arrayOfShapes[1] = new Triangle2();
		arrayOfShapes[2] = new Circle2();
		arrayOfShapes[3] = new Cylinder2();
		
	}
	
	public static void drawALL() {
		for(int i = 0; i<arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		
		}	
	}
}