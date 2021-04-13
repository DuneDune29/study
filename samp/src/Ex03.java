
public class Ex03 {
	public static void main(String[] args) {
		int a = 12, b = 4, c = 19;
		
		int max = ( a > b ) ? a : b;
		max = ( max > c ) ? max : c;
		System.out.println( "최대값은 " + max );
	}
}
