class Pa3 {
	int x = 1000;
	void display() {
		System.out.println("����Ŭ���� display()");
	}
}
class Ch3 extends Pa3 {
	int x = 2000;
	void display() {
		System.out.println("����Ŭ���� display()");
	}
	void write() {
		this.display();			super.display();
		System.out.println("this.x : " + x);
		System.out.println("super.x : " + super.x);
	}
}
public class Ex06 {
	public static void main(String[] args) {
		Ch3 d = new Ch3();
		d.write();
	}
}