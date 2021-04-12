package RemoteControl;

public class Television implements RemoteControl{
	boolean onOff = false;
	public void turnOn() {
		// TV의 전원을 켜기 위한 코드가 들어감
		onOff = true;
		System.out.println("TV is ON");
	}
	
	public void turnOff() {
		// TV의 전원을 끄기 위한 코드 들어감
		onOff = false;
		System.out.println("TV is OFF");
	}

}
