abstract class Shape1 { //�߻�(����)Ŭ����
	public abstract void draw();
}
class Circle1 extends Shape1 {
	@Override // ������̼� // ������
	public void draw() {
		System.out.println("���� �׸���.");
	}
}
public class Ex11 {
	public static void main(String[] args) {
		Shape1 ref;
		ref = new Circle1();
		ref.draw();
	}
}