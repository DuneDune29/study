class Point6 {
	int x, y; // �������
	
	public Point6() { // ������(Constructor)
		System.out.println("default ������");
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