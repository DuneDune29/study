package Scheduler;

public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭�� �����Ɉ���.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ���� ���� �������� �Ҵ��մϴ�.");
	}
}