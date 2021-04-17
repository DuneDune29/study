public class Ex14 {
	public static void main(String[] args) {
		System.out.println("10.12보다 크거나 같은 정수 : " + Math.ceil(10.12));
		System.out.println("10.92보다 작거나 같은 정수 : " + Math.floor(10.92));
		System.out.println("10.52에 가장 가까운  정수 : " + Math.rint(10.52));

		System.out.println("PI : " + Math.PI);
		System.out.println("10, 20중에 큰 값 : " + Math.max(10, 20));
		System.out.println("10, 20중에 작은 값 : " + Math.min(10, 20));

		System.out.println("0 ~ 1 사이의 임의의 실수 : " + Math.random());
		System.out.println("0 ~ 10 사이의 임의의 실수 : " + Math.random() * 10);
		System.out.println("0 ~ 9 사이의 임의의 정수 : "
				+ (int) (Math.random() * 10));
		System.out.println("0 ~ 10 사이의 임의의 정수 : " 
				+ (int) (Math.random() * 10 + 1));
	}
} 