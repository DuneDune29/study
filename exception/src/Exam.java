import java.util.HashMap;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("castello", "1234");
		map.put("asdf", "1111");
		map.put("lang", "1234");
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.\n");
			} else {
				if (!(map.get(id)).equals(password)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.\n");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		}
	}
}