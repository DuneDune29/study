interface Drawable2 {
	public abstract void draw();
}

class Circle3 implements Drawable2 {
	public void draw() {
		System.out.println("���� �׸���");
	}
}
public class Ex13 {
	public static void main(String[] args) {
		Drawable2 ref;
		ref = new Circle3();
		ref.draw();
		// ����ȯ(ĳ����) �� Circle Ŭ������ draw �޼ҵ� ȣ��
	}
}