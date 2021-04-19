import java.util.StringTokenizer;

public class Exam04 {
	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression,
				"+-*/=()", false);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}