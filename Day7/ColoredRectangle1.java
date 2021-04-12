package Day7;

abstract class Shape1 {  // abstract �� �߻�Ŭ���� �ǹ�
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // �߻�޼ҵ� abstract �߰�
}

class Rectangle1 extends Shape1 {
	int width, height;

	public void draw() {              // �߻� �޼ҵ� ����
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle1 extends Shape1 {
	int radius;

	public void draw() {
		System.out.println("�� �׸��� �޼ҵ�");
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