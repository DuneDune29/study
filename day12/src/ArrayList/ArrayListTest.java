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
		list.add(1, "APPLE"); // 인덱스 1에 "APPLE" 삽입
		list.set(2, "GRAPE"); // 인덱스 2의 원소를 "GRAPE" 대체
		list.remove(3); // 인덱스 3의 원소를 삭제

		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));

		System.out.println();
		
		//for (String s : list) // 리스트사이즈에 원소s를 하나씩 출력하라
			//System.out.println(s);
		
		String s;
		Iterator e = list.iterator(); // 반복좌
		while(e.hasNext()) {
			s = (String)e.next();
			System.out.println(s);
		}
	}
}