package FlyingCar;

interface Drivable {
	void drive();
}

interface Flyable {
	void fly();
}

public class FlyingCar implements Drivable, Flyable { //두개의 추상메소드를 구현
	public void drive() {
		System.out.println("운전하고 있음!");
	}

	public void fly() {
		System.out.println("하늘을 날고 있음!");
	}

	public static void main(String[] args) {
		FlyingCar obj = new FlyingCar();
		obj.drive();
		obj.fly();
	}
}