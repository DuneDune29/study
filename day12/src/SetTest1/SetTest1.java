package SetTest1;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();

		s1.add("A");
		s1.add("B");
		s1.add("C");

		s2.add("A");
		s2.add("D");

		Set<String> union = new HashSet<String>(s1);
		union.addAll(s2);

		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2);

		Set<String> removeall = new HashSet<String>(s1);
		removeall.removeAll(s2);
		 
		System.out.println("합집합 " + union);
		System.out.println("교집합 " + intersection);
		System.out.println("차집합 " + removeall);
		// 차집합은 순서에 따라 결과바뀜 s1 - s2, s2 - s1
	}
}