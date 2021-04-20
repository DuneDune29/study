import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12 {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(200, 200);
		FileDialog fileOpen = new FileDialog(f, "���Ͽ���", FileDialog.LOAD);
		f.setVisible(true);
		fileOpen.setDirectory("C:\\");
		fileOpen.setVisible(true);
		// ������ ������ ��, FileDialog�� ���� ��ư�� Ŭ���ϸ�
		// �����̸��� ��ġ�� ���丮 ������ �����
		System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
}