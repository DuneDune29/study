class Point02{
	private int x;
	private int y;
	
	public void setX(int new_x) {
		x = new_x;
	}
	public void setY(int new_y) {
		y = new_y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Point02 pt02 = new Point02();
		pt02.setX(10);			pt02.setY(20);
		System.out.println(pt02.getX() + ", " + pt02.getY());
	}
}