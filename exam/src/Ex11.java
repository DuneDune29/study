abstract class Shape1 { //추상(가상)클래스
	public abstract void draw();
}
class Circle1 extends Shape1 {
	@Override // 어노테이션 // 재정의
	public void draw() {
		System.out.println("원을 그리다.");
	}
}
public class Ex11 {
	public static void main(String[] args) {
		Shape1 ref;
		ref = new Circle1();
		ref.draw();
	}
}