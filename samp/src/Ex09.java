
public class Ex09 {
	public static void main(String[] args) {
		int total = 0;
		
		for (int n = 1;  n <= 10;  n++) {
			if (n == 7) break;
			total += n;
		}
		
		System.out.println("ÇÕ°è´Â " + total);
	}
}
