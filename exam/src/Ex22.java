import java.util.Random;

public class Ex22 {
	public static void main(String[] args) {
		Random random = new Random(); // Ctrl + Shift + o
		int num = random.nextInt(11);
		System.out.println("0 ~ 10 사이의 임의의 정수 : " + num);
	}
}