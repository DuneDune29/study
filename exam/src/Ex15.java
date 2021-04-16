interface Color {
	int RED = 1; // public static final 생략된것이므로 상수
	int GREEN = 2;
	int BLUE = 3;
	void setColor(int c); // public abstract 생략된 것이므로 추상메서드
	int getColor();
}
class Triangle implements Color {
	int color = 0;
	public int getColor() { // 반드시 재정의
		return color;
	}
	public void setColor(int c) { // 반드시 재정의
		color = c;
	}
}
public class Ex15 {
	public static void main(String[] args) {
		Triangle ref = new Triangle();
		ref.setColor(Color.RED);
		switch (ref.getColor()) {
		case 1: System.out.print("  빨간색");	break;
		case 2: System.out.print("  초록색");	break;
		case 3: System.out.print("  파란색");	break;
		}
		System.out.println(" 삼각형이다.");
	}
}