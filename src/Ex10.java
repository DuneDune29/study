class AB1 {
	int i, j;

	
	public AB1() {  } // default 생성자
}
class AB2 extends AB1 {
	int k;
}
class AB3 extends AB2{
	int l;
}
public class Ex10 {
	public static void main(String[] args) {
		AB1 a = new AB1();
		AB2 b = new AB2();
		AB3 c = new AB3();
		if (a instanceof AB1) System.out.println("a는 AB1 클래스의 객체");
		if (b instanceof AB2) System.out.println("b는 AB2 클래스의 객체");
		if (c instanceof AB3) System.out.println("c는 AB3 클래스의 객체");
		if (c instanceof AB1) System.out.println("c는 AB1 클래스의 객체 : 형변환");
		if (a instanceof AB3) System.out.println("a는 AB3 클래스의 객체 : 형변환");
		else  System.out.println("a는 AB3 클래스의 객체가 아님 : 형변환 불가");
	}
}