public class Exam05 {
	public static void main(String[] args) {
		try {
			String c = null;
			System.out.println("문자열 값 : " + c.toString());
		} catch (Exception e) {
			System.out.println(">> e <<");
			System.out.println(e);
			System.out.println(">> e.toString() <<");
			System.out.println(e.toString());
			System.out.println(">> e.getMessage() <<");
			System.out.println(e.getMessage());
			// 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻어옴
			System.out.println(">> e.printStackTrace() <<");
			e.printStackTrace();
			// 예외 발생 당시의 호출 스택에 있었던 메소드의 정보와 예외 메시지를 출력
		}
	}
}