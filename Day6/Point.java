package Day6;

public class Point {
	private int x, y; // 프라이빗 변수 x, y 선언

	public Point(int a, int b) { // 생성자는 class 명  
		x = a;
		y = b;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
