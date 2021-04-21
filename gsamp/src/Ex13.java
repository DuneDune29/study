import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex13 {
	public static void main(String[] args) {
		Frame f = new Frame("BorderLayoutTest");
		f.setSize(300, 200);
		f.setLayout(new BorderLayout());
		// Frame�� BorderLayout�� �⺻ ���̾ƿ�
		Button nort = new Button("���");
		Button sout = new Button("�ϳ�");
		Button east = new Button("�쵿");
		Button west = new Button("�¼�");
		Button cent = new Button("�߾�");
		// frame�� 5�� ������ Button�� �ϳ��� �߰�
		// "North" ��� BorderLayout.NORTH �� ��밡��
		f.add(nort, "North");		f.add(nort, "South");			
		f.add(nort, "Easy"); 		f.add(nort, "West");
		f.add(nort, "Center");		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
}

