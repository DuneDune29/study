package Day7;

public class CarTest2 {
	public static void main(String[] args) {
		Car2 firstCar = new Car2("HMW520");
		Car2 secondCar = new Car2("HMW520");
		if (firstCar.equals(secondCar)) {
			System.out.println("������ ������ �ڵ����Դϴ�.");
		} else {
			System.out.println("������ ������ �ڵ����� �ƴմϴ�.");
		}
	}
}