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
		super(t1); // ���� Ŭ������ �����ڸ� �ݵ�� ��������� ȣ��
		t = t1;
		d2 = t * t;
	}
}
public class Ex08 {
	public static void main(String[] args) {
		Two super2 = new Two(10, 20);
		System.out.println("10�� ���� : " + super2.d1);
		System.out.println("20�� ���� : " + super2.d2);
	}
}