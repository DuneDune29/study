class One {
	int value;

	public One() {
		this(100); // 자신 클래스의 다른 생성자를 호출
	}

	public One(int value) {
		this.value = value;
	}
}
public class Ex05 {
	public static void main(String[] args) {
		One t1 = new One();
		System.out.println(t1.value);
	}
} 