package Day6;

public class Point {
	private int x, y; // �����̺� ���� x, y ����

	public Point(int a, int b) { // �����ڴ� class ��  
		x = a;
		y = b;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
