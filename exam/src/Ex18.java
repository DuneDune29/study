public class Ex18 {
	public static void main(String[] args) {
		Integer num1 = new Integer(13);
		Integer num2 = new Integer(13);
		Integer num3 = new Integer("13");
		System.out.println("num1�� �����ϰ� �ִ� ������ : " + num1.intValue());
		System.out.println("num2�� �����ϰ� �ִ� ������ : " + num2.intValue());
		System.out.println("num3�� �����ϰ� �ִ� ������ : " + num3.intValue());
		
		int hap = num1.intValue() + num2.intValue();
		System.out.println("�� = " + hap);
		System.out.println("���� 2�� ǥ�� : " + Integer.toBinaryString(hap));
		System.out.println("���� 8�� ǥ�� : " + Integer.toOctalString(hap));
		System.out.println(num1.equals(num2));
		System.out.println(num1.equals(num3));
		System.out.println(num1 == num2);
		System.out.println(num2 == num3);
	}
}