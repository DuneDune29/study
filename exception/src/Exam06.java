public class Exam06 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main()에서 예외 처리");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception {
		throw new Exception();// 강제 예외 발생
	}
}