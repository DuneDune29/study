package Day6;

public class Eagle extends Animal { // extends뒤에 클래스 Animal을 붙혀서 연결
	int wings = 2;

	void fly() {
		System.out.println("fly()가 호출되었음.");
	}
}