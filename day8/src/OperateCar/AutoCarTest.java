package OperateCar;

class AutoCar implements OperateCar {
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}

	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}

	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿉니다.");
	}

	public void turn(int degree) {
		System.out.println("자동차가 방향을 " + degree + "도 만큼 바꿉니다.");
	}
}

public class AutoCarTest {
	public static void main(String[] args) {
		OperateCar obj = new AutoCar();
		//AutoCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();
	}
}