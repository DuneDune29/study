package Day7;

public abstract class Car { // �߻�Ŭ����

	public abstract void drive(); // �߻�

	public abstract void stop(); // �߻�

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	final public void run() { // p.291 ���ø��޼���
		startCar();
		drive();
		stop();
		turnOff();
	}
}
