public class Ex10 {
	public static void main(String[] args) {
		char a[] = { 'b', ' ', 'A', '5', '��' };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] ��� = " + a[i]);
			if (Character.isDigit(a[i]))
				System.out.println(" : ����");
			if (Character.isLetter(a[i]))
				System.out.println(" : ����");
			if (Character.isWhitespace(a[i]))
				System.out.println(" : ���鹮��");
			if (Character.isUpperCase(a[i]))
				System.out.println(" : �빮��");
			if (Character.isLowerCase(a[i]))
				System.out.println(" : �ҹ���");
		}
	}
} 