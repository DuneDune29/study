import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex06 {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(400, 65);
		f.setLayout(new FlowLayout());
		Label lid = new Label("ID :", Label.RIGHT); //������ ����(����)
		Label lpwd = new Label("Password :", Label.RIGHT);
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*'); // �Է��� �� ��� '*' �� ǥ�õǵ��� ����
		f.add(lid); 	f.add(id); 	f.add(lpwd);
		f.add(pwd);		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { 
				super.windowClosing(e); 	
				System.exit(0); 
			}		
		});
	}
}