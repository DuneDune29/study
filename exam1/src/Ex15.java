import java.util.Random;

public class Ex15 {
	public static void main(String[] args) {
		Random random = new Random(); // Ctrl + Shift + o
		int num = random.nextInt(11);
		System.out.println("0 ~ 10 : " + num);
	}
} 