package FlyingCar2;

interface Flyable {
	void fly();
}

class Car {
	int speed;

	void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
}

public class FlyingCar extends Car implements Flyable {
	@Override
	public String toString() {
		return "FlyingCar [speed=" + speed + "]";
	}

	public void fly() {
		System.out.println("하늘을 날고 있음!");
	}

	public static void main(String[] args) {
		FlyingCar obj = new FlyingCar();
		obj.setSpeed(300);
		System.out.println(obj);
		System.out.println(obj.getSpeed());
		obj.fly();
	}
}
