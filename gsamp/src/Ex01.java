import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 {
	public static void main(String[] args) {
		Frame f = new Frame("Login"); // Frame ��ü ����
		f.setSize(300, 200); // Frame ũ�� ����
		
		f.addWindowListener(new EventHandler());
		// EventHandler Ŭ������ ��ü�� �����ؼ� Frame�� WindowListener�� ���
		f.setVisible(true); // ������ Frame�� ȭ�鿡 ǥ��
	}
}
class EventHandler implements WindowListener {
	@Override
	public void windowClosing(WindowEvent e) { // Frame�� �ݱ� ��ư�� �������� ȣ��
		e.getWindow().setVisible(false); // Frame�� ȭ�鿡�ļ� ������ �ʵ��� �ϰ�
		e.getWindow().dispose(); // �޸𸮿��� ����
		System.exit(0); // ���α׷��� ����
	}
	@Override
	public void windowActivated(WindowEvent e) {   }
	@Override
	public void windowClosed(WindowEvent e) {	}
	@Override
	public void windowDeactivated(WindowEvent e) {	}
	@Override
	public void windowDeiconified(WindowEvent e) {    }
	@Override
	public void windowIconified(WindowEvent e) {	}
	@Override
	public void windowOpened(WindowEvent e) {   }
}