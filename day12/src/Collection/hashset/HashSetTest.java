package Collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		//hashSet.add(new String("������"));
		/*
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(new String("������"));
		treeSet.add(new String("������"));
		treeSet.add(new String("ȫ����"));
		treeSet.add(new String("������"));
		
		LinkedHashSet<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add(new String("������"));
		linkedhashSet.add(new String("������"));
		linkedhashSet.add(new String("ȫ����"));
		linkedhashSet.add(new String("������"));
		*/
		System.out.println(hashSet);
	}

}
