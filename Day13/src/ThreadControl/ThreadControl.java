package ThreadControl;

public class ThreadControl {
	
	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}
	
	private static class MessageLoop implements Runnable{
		public void run() {
			String message[] = { "Pride will have a fall.",
					"Power is dangerous unless you have humility.",
					"Office changes manners.",
					"Empty vesels make the most sound."};
			
			try {
				for (int i = 0; i < message.length; i++) {
					print(message[i]);
					Thread.sleep(2000);
					
				// ���ͷ�Ʈ�Ǹ� �޽��� ���	
				}
			} catch (InterruptedException e) {
				print("���� ������ �ʾҾ��!");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int tries = 0;
		
		print("�߰����� �����带 �����մϴ�.");
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		print("�߰����� �����尡 �����⸦ ��ٸ��ϴ�.");
		
		//������ t�� �����ϱ⸦ 1�ʵ��� ��ٸ�
		while (t.isAlive()) {
			print("���� ��ٸ��ϴ�.");
			t.join(1000);
			tries++;
			if(tries > 2) {
				print("���� �� ���׿�!");
				
				//������ t�� ������ �ߴܽ�Ŵ
				t.interrupt();
				t.join();
			}
			
			// ������ t�� �����ϱ⸦ ��ٸ�.
		}
		print("���� ������ ����!");
	}
}