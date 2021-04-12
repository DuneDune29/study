package Day7;

class Point1 implements Cloneable {
	int x;
	int y;

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public Object Clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return obj;
	}
}

class CloneEx {
	public static void main(String[] args) {
		Point1 original = new Point1(3, 5);
		Point1 copy = (Point1) original.Clone();
		System.out.println(original);
		System.out.println(copy);
	}
}