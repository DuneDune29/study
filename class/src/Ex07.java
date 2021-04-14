class Point7{
	int x, y;
	public Point7() {
		System.out.println("default »ý¼ºÀÚ");
	}
	public Point7(int new_x, int new_y) {
		x = new_x;		y = new_y;
	}
	public void showPoint() {
		System.out.println(x + ", " + y);
	}
}
public class Ex07 {
	public static void main(String[] args) {
		Point7 pt7 = new Point7();
		System.out.println(pt7.x + ", " + pt7.y);
		Point7 pt8 = new Point7(300, 400);
		System.out.println(pt8.x + ", " + pt8.y);
	}
}