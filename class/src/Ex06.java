class Point6 {
	int x, y; // 멤버변수
	
	public Point6() { // 생성자(Constructor)
		System.out.println("default 생성자");
	}

	public void showPoint() {
		System.out.println( x + ", " + y );
	}
}

public class Ex06 {
	public static void main(String[] args) {
				Point6 pt6 = new Point6();
		pt6.showPoint();
	}
}