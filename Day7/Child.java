package Day7;

public class Child extends Parent {
	public void print() {
		super.print(); // �θ� Ŭ������ print �޼��� ȣ��
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ�");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
}