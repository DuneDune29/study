package DefaultMethodTest2;
interface OperateCar{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
	
	default public void fly() {
		System.out.println("�ϴ��� ���� ����!");
	}
}
class OldCar implements OperateCar{
	public void start() {  }
	public void stop() {  }
	public void setSpeed(int speed) {  }
	public void turn(int degree) {  }
	}

public class DefaultMethodTest {
	public static void main(String[] args) {
		OldCar obj = new OldCar();
		obj.fly();
	}
} 