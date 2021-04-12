package Collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		//hashSet.add(new String("강감찬"));
		/*
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(new String("임정순"));
		treeSet.add(new String("박현정"));
		treeSet.add(new String("홍연의"));
		treeSet.add(new String("강감찬"));
		
		LinkedHashSet<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add(new String("임정순"));
		linkedhashSet.add(new String("박현정"));
		linkedhashSet.add(new String("홍연의"));
		linkedhashSet.add(new String("강감찬"));
		*/
		System.out.println(hashSet);
	}

}
