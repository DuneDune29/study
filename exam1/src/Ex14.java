public class Ex14 {
	public static void main(String[] args) {
		System.out.println("10.12���� ũ�ų� ���� ���� : " + Math.ceil(10.12));
		System.out.println("10.92���� �۰ų� ���� ���� : " + Math.floor(10.92));
		System.out.println("10.52�� ���� �����  ���� : " + Math.rint(10.52));

		System.out.println("PI : " + Math.PI);
		System.out.println("10, 20�߿� ū �� : " + Math.max(10, 20));
		System.out.println("10, 20�߿� ���� �� : " + Math.min(10, 20));

		System.out.println("0 ~ 1 ������ ������ �Ǽ� : " + Math.random());
		System.out.println("0 ~ 10 ������ ������ �Ǽ� : " + Math.random() * 10);
		System.out.println("0 ~ 9 ������ ������ ���� : "
				+ (int) (Math.random() * 10));
		System.out.println("0 ~ 10 ������ ������ ���� : " 
				+ (int) (Math.random() * 10 + 1));
	}
} 