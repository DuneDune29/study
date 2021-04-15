public class Ex18 {
	public static void main(String[] args) {
		Integer num1 = new Integer(13);
		Integer num2 = new Integer(13);
		Integer num3 = new Integer("13");
		System.out.println("num1이 포장하고 있는 정수는 : " + num1.intValue());
		System.out.println("num2이 포장하고 있는 정수는 : " + num2.intValue());
		System.out.println("num3이 포장하고 있는 정수는 : " + num3.intValue());
		
		int hap = num1.intValue() + num2.intValue();
		System.out.println("합 = " + hap);
		System.out.println("합의 2진 표현 : " + Integer.toBinaryString(hap));
		System.out.println("합의 8진 표현 : " + Integer.toOctalString(hap));
		System.out.println(num1.equals(num2));
		System.out.println(num1.equals(num3));
		System.out.println(num1 == num2);
		System.out.println(num2 == num3);
	}
}