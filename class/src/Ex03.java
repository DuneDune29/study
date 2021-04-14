public class Ex03 { // 메소드 오버로딩(중복정의)
	static void prn(int x, int y, int z) {
		System.out.println(x + "\t" + y + "\t" + z);
	}
	
	static void prn(int x, int y) {
		System.out.println(x + "\t" + y);
	}
	
	static void prn(int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		prn(10, 20, 30);
		prn(40, 50);
		prn(60);
	}
}