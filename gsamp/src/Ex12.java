import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12 {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(200, 200);
		FileDialog fileOpen = new FileDialog(f, "파일열기", FileDialog.LOAD);
		f.setVisible(true);
		fileOpen.setDirectory("C:\\");
		fileOpen.setVisible(true);
		// 파일을 선택한 후, FileDialog의 열기 버튼을 클릭하면
		// 파일이름과 위치한 디렉토리 정보를 어더옴
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