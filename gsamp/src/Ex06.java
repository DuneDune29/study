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
		Label lid = new Label("ID :", Label.RIGHT); //오른쪽 정렬(맞춤)
		Label lpwd = new Label("Password :", Label.RIGHT);
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*'); // 입력한 값 대신 '*' 가 표시되도록 설정
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