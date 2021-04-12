package Day7;

public class Child extends Parent {
	public void print() {
		super.print(); // 부모 클래스의 print 메서드 호출
		System.out.println("자식 클래스의 print() 메소드");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
}