import java.util.StringTokenizer;

public class Exam03 {
	static String s = "국적,대한민국,성명,홍길동,성별,남,주소,서울시";
	
	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer(s, ",");
		while (st1.hasMoreTokens()) {
			String first = st1.nextToken();
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
	}
}