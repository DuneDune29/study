
public class Ex03 {
	static int abs(int x) {
		int y;
		if (x < 0) y = -x;	else y = x;
		return y;
	}
	
	public static void main(String[] args) {
		int a = -5, result;
		result = abs(a);
		
		System.out.println(a + "의 절대값은 " + result);
		System.out.println(10 + "의 절대값은 " + abs(10));
	}
}