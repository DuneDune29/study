import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex08 {
	public static void main(String[] args) {
		Frame f = new Frame("Comments");
		f.setSize(400, 220);	
		f.setLayout(new FlowLayout());
		TextArea comments = new TextArea("�ϰ� ���� ���� ��������.", 10, 50);
		f.add(comments);
		comments.selectAll(); // TextArea�� text ��ü����
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { 
				super.windowClosing(e); 	
				System.exit(0); 
			}		
		});
	}
}