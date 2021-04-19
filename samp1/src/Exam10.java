import java.util.ArrayList;

public class Exam10 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");			
		list.add("오렌지");
		list.add("바나나");
		
		for(String element : list)
			System.out.print(element + "\t");
		System.out.println();
	}
}