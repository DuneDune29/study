class One {
	int d1, s;
	One(int s1){
		s = s1;
		d1 = s * s;
	}
}
class Two extends One {
	int d2, t;
	Two(int s1, int t1){
		super(t1); // 상위 클래스의 생성자를 반드시 명시적으로 호출
		t = t1;
		d2 = t * t;
	}
}
public class Ex08 {
	public static void main(String[] args) {
		Two super2 = new Two(10, 20);
		System.out.println("10의 제곱 : " + super2.d1);
		System.out.println("20의 제곱 : " + super2.d2);
	}
}