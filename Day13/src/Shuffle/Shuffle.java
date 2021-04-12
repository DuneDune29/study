package Shuffle;

import java.util.*;

public class Shuffle {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++)
			list.add(i);
		Collections.shuffle(list);
		//for (int i = 1; i <= 6; i++)
		System.out.println(list);
	}

}
