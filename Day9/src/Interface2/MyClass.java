package Interface2;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	} // X 인터페이스에서 상속받은 x()메서드 구현

	@Override
	public void y() {
		System.out.println("y()");
	} // Y 인터페이스에서 상속받은 y()메서드 구현

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	} // MyInterface 인터페이스에서 상속받은 myMethod()메서드 구현
}