package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(30);
		pq.add(80);
		pq.add(20);
	
		for(Integer o : pq)
			System.out.println(o);
		System.out.println("원소 삭제");
		while (!pq.isEmpty())
			System.out.println(pq.remove());
	}	//remove는 삭제를하지만 그값을 반환한다.
	//PriorityQueue는 들어갈때는 무작위지만 정렬이 되서 나온다.
// 20 80 30으로 무작위로 들어갔다가 remove로 삭제됫다가 다시 나올때 정렬
}
