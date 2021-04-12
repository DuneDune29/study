package Day7;

abstract class Shape1 {  // abstract 는 추상클래스 의미
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // 추상메소드 abstract 추가
}

class Rectangle1 extends Shape1 {
	int width, height;

	public void draw() {              // 추상 메소드 구현
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle1 extends Shape1 {
	int radius;

	public void draw() {
		System.out.println("원 그리기 메소드");
	}
}

public class ColoredRectangle1 {

	public static void main(String[] args) {
		Rectangle1 obj1 = new Rectangle1();
		Circle1 obj2 = new Circle1();
		obj1.draw();
		obj2.draw();

	}
}