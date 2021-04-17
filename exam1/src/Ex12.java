public class Ex12 {
	public static void main(String[] args) {
		String str = "123";
		int a = Integer.parseInt(str);
		System.out.println(str + ", " + a);

		String str2 = "3.14F";
		float b = Float.parseFloat(str2);
		System.out.println(str2 + ", " + b);

		Integer num2 = new Integer(200);
		int num3 = num2.intValue();
		System.out.println(num2 + ", " + num3);

		Float f = new Float(23.3F);
		float f2 = f.floatValue();
		System.out.println(f + ", " + f2);
	}
} 