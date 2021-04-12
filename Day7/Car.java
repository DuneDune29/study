package Day7;

public abstract class Car { // 추상클래스

	public abstract void drive(); // 추상

	public abstract void stop(); // 추상

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	final public void run() { // p.291 템플릿메서드
		startCar();
		drive();
		stop();
		turnOff();
	}
}
