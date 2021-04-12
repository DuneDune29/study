package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		//Collections.synchronizedList<String> list = Collection.synchronizedList<String>();
		Vector<String> list = new Vector<String>();
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE"); // �ε��� 1�� "APPLE" ����
		list.set(2, "GRAPE"); // �ε��� 2�� ���Ҹ� "GRAPE" ��ü
		list.remove(3); // �ε��� 3�� ���Ҹ� ����

		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));

		System.out.println();
		
		//for (String s : list) // ����Ʈ����� ����s�� �ϳ��� ����϶�
			//System.out.println(s);
		
		String s;
		Iterator e = list.iterator(); // �ݺ���
		while(e.hasNext()) {
			s = (String)e.next();
			System.out.println(s);
		}
	}
}