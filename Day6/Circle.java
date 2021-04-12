package Day6;

public class Circle {
	private int radius; // 변수 선언
	private Point center; // 

	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}

}
