import java.util.ArrayList;

public class Exam10 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("�ٳ���");
		list.add("��");			
		list.add("������");
		list.add("�ٳ���");
		
		for(String element : list)
			System.out.print(element + "\t");
		System.out.println();
	}
}