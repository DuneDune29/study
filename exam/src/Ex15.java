public class Ex15 {
	public static void main(String[] args) {
		String str = new String("����");
		System.out.println(str);
		String str1 = str.concat("�㵥��"); // ���ڿ� ����(����)
		System.out.println(str1);
		str1 = str1.replace("�㵥��", "���̷���");
		System.out.println(str1);
		str1 = "  " + str1 + "   "; // �տ� 2��, �ڿ� 3���� ���� �߰�
		System.out.println("���� �߰��� str1�� ���� : " + str1.length());
		str1 = str1.trim();
		System.out.println("���� ���ŵ� str1�� ���� : " + str1.length());
		int len = (str1.length() + 1) * 2;
		System.out.println(str1 + "�� �޸� �뷮 : " + len + "Bytes");
		char ch = str1.charAt(2); // Ư�� ��ġ�� �ִ� ����
		System.out.println(str1 + "�� charAt(2) : " + ch);
		String str2 = str1.substring(3);
		System.out.println(str1 + "�� substring(3) : " + str2);
		String str3 = str1.substring(2, 4);
		System.out.println(str1 + "�� substring(2, 4) : " + str3);
	}

}
