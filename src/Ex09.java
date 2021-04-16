class Th {
	int i, j;
	Th(int a, int b){
		i = a;		j = b;
	}
	void show() {
		System.out.println("상위클래스 show()");
	}
}
class Fo extends Th{
	int k;
	Fo(int a, int b, int c){
		super(a, b);
		k = c;
	}
	void show() {
		System.out.println("하위클래스 show()");
		System.out.println("super를 이용한 상위클래스 메소드 호출");
		super.show();
	}
}
public class Ex09 {
	public static void main(String[] args) {
		Fo over1 = new Fo(10, 20, 30);
		System.out.println("i, j, k : " 
				+ over1.i + ", " + over1.j + ", " + over1.k);
		over1.show();
	}
}