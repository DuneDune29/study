package RemoteControl;

public class Television implements RemoteControl{
	boolean onOff = false;
	public void turnOn() {
		// TV�� ������ �ѱ� ���� �ڵ尡 ��
		onOff = true;
		System.out.println("TV is ON");
	}
	
	public void turnOff() {
		// TV�� ������ ���� ���� �ڵ� ��
		onOff = false;
		System.out.println("TV is OFF");
	}

}
