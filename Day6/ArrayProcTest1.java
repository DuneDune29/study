package Day6;

public class ArrayProcTest1 {
	final static int STUDENTS = 5; // static �������� final ��� 
 
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc1 obj = new ArrayProc1();
		obj.getValues(scores);
		System.out.println("����� = " + obj.getAverage(scores));
	}
}