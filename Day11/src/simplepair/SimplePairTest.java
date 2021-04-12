package simplepair;

public class SimplePairTest {

	public static void main(String[] args) {
		//SimplePair<String> pair = new SimplePair<String>("apple", "tomato");
		SimplePair<Integer> pair = new SimplePair<Integer>(1, 2);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
	} // 문자는<String> 숫자는<Integer>

}
