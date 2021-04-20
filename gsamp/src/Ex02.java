import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex02 {
	public static void main(String[] args) {
		Frame f = new Frame("Button");
		f.setSize(300, 200); 
		f.setLayout(null); // ���̾ƿ� �Ŵ����� ������ ����
		Button b = new Button("Ȯ ��");
		b.setSize(100, 50); // Button�� ũ�⸦ ����
		b.setLocation(100, 75); // Frame�������� Button ��ġ�� ����
		f.add(b); // ������ Button�� Frame�� �߰�
		f.setVisible(true);
		f.addWindowListener(new EventHandler2());
		// EventHandler Ŭ������ ��ü�� �����ؼ� Frame�� WindowListener�� ���
	}
}
class EventHandler2 implements WindowListener {
	@Override
	public void windowClosing(WindowEvent e) { // Frame�� �ݱ� ��ư�� �������� ȣ��
		e.getWindow().setVisible(false); // Frame�� ȭ�鿡�ļ� ������ �ʵ��� �ϰ�
		e.getWindow().dispose(); // �޸𸮿��� ����
		System.exit(0); // ���α׷��� ����
	}
	@Override
	public void windowActivated(WindowEvent e) {    }
	@Override
	public void windowClosed(WindowEvent e) {  	 }
	@Override
	public void windowDeactivated(WindowEvent e) {    }
	@Override
	public void windowDeiconified(WindowEvent e) {    }
	@Override
	public void windowIconified(WindowEvent e) {	}
	@Override
	public void windowOpened(WindowEvent e) {    }
}