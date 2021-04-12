package Day7;

public class Rectangle extends Shape { // Shape 클래스 상속
	int width; // 변수 가로
	int height; // 변수 세로

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		System.out.println("Rectangle()");
		this.width = width;
		this.height = height;
	}

	double calcArea() {
		return width * height;
	}
}