import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03 {
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200); 
		f.setLayout(null);
		Choice day = new Choice(); // Choice ��ü�� ����
		day.add("SUN"); // Choice�� ��Ͽ� ��Ÿ�� ������ �߰�
		day.add("MON");		day.add("TUE");		day.add("WED");
		day.add("THU");		day.add("FRI");		day.add("SAT");	
		day.setSize(100, 50); 		day.setLocation(100, 70);
		f.add(day); 		f.setVisible(true);
		f.addWindowListener(new EventHandler3());
		// EventHandler Ŭ������ ��ü�� �����ؼ� Frame�� WindowListener�� ���
	}
}
class EventHandler3 implements WindowListener {
	@Override
	public void windowClosing(WindowEvent e) { // Frame�� �ݱ� ��ư�� �������� ȣ��
		e.getWindow().setVisible(false); // Frame�� ȭ�鿡�ļ� ������ �ʵ��� �ϰ�
		e.getWindow().dispose(); // �޸𸮿��� ����
		System.exit(0); // ���α׷��� ����
	}
	public void windowActivated(WindowEvent e) {   
	}
	public void windowClosed(WindowEvent e) {  	 
	}
	public void windowDeactivated(WindowEvent e) {  
	}
	public void windowDeiconified(WindowEvent e) {  
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {   
	}
}