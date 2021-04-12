package Day6;

public class ArrayProcTest1 {
	final static int STUDENTS = 5; // static 전역변수 final 상수 
 
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc1 obj = new ArrayProc1();
		obj.getValues(scores);
		System.out.println("평균은 = " + obj.getAverage(scores));
	}
}