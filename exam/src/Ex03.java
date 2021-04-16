class AA {
	int i, j;
	public void setij(int x, int y) {
		i = x;		j = y;
	}
}

class BB extends AA {
	int total;
	public void sum() { total = i + j; }
}
public class Ex03 {
	public static void main(String[] args) {
		BB subOb = new BB();
		subOb.setij(10, 12);
		subOb.sum();
		System.out.println("гу╟Х : " + subOb.total);
	}
}