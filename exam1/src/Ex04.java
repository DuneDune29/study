class ThisTest {
	int x, y;

	public ThisTest() {
		this(10, 10);
	}

	public ThisTest(int x) {
		this(x, 10);
	}

	public ThisTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println(x + ", " + y);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		ThisTest tt01 = new ThisTest(10, 20);
		tt01.showPoint();
		ThisTest tt02 = new ThisTest(30);
		tt02.showPoint();
		ThisTest tt03 = new ThisTest();
		tt03.showPoint();
	}
} 