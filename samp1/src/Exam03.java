import java.util.StringTokenizer;

public class Exam03 {
	static String s = "����,���ѹα�,����,ȫ�浿,����,��,�ּ�,�����";
	
	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer(s, ",");
		while (st1.hasMoreTokens()) {
			String first = st1.nextToken();
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
	}
}