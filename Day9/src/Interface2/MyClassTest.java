package Interface2;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		X xClass = mClass;
		xClass.x(); // ���� �������̽� X������ �����ϸ� X�� ������ �޼��常 ȣ�� ����

		Y yClass = mClass;
		yClass.y(); // ���� �������̽� Y������ �����ϸ� Y�� ������ �޼��常 ȣ�� ����

		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		// ������ �������̽��� ������ �����ϸ� �������̽��� ����� ��� �޼��� ȣ�� ����
	}
}