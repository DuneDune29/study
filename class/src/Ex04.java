public class Ex04 {
	static void printstr(String str) {
		System.out.println(str);
	}
	
	static void printstr(char ch, int cnt) {
		for(int i = 0; i < cnt; i++)
			System.out.print(ch);
		System.out.println();
	}
	
	public static void main(String[] args) {
		printstr("슬프도록 아름다운");
		printstr('A', 10);
	}
}