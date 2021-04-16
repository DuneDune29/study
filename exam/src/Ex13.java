interface Drawable2 {
	public abstract void draw();
}

class Circle3 implements Drawable2 {
	public void draw() {
		System.out.println("원을 그리다");
	}
}
public class Ex13 {
	public static void main(String[] args) {
		Drawable2 ref;
		ref = new Circle3();
		ref.draw();
		// 형변환(캐스팅) 후 Circle 클래스의 draw 메소드 호출
	}
}