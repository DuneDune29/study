public class Ex14 {
	public static void main(String[] args) {
		String s1 = "Java Korea"; // �����ʱ�ȭ�� ����
		String s2 = new String("Java Korea"); // new ������ ���
		String s3 = s2.intern(); // s2���ڿ��� canonical ���ڿ��� ��ȯ
		String s4 = "Java Corea"; // �����ʱ�ȭ�� ����
		
		System.out.println("String ���۷��� ������ �����ϴ� �ν��Ͻ��� ������ ��");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));
		
		System.out.println("String ������ ��(����)�� ������ ��");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.length());		
	}
}