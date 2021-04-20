import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex05 {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200); 	f.setLayout(null);
		Label id = new Label("ID :"); // Label을 생성하고 크기와 위치를 지정
		id.setBounds(50, 50, 30, 10); // 50, 50 위치, 30 x 10 크기
		Label pwd = new Label("Password :");
		pwd.setBounds(50, 65, 100, 10);
		f.add(id); 		f.add(pwd);
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