package Day7;

public class Rectangle extends Shape { // Shape Ŭ���� ���
	int width; // ���� ����
	int height; // ���� ����

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