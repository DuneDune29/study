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
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
			} else {
				if (!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}
}