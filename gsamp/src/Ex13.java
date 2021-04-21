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
		// Frame은 BorderLayout이 기본 레이아웃
		Button nort = new Button("상북");
		Button sout = new Button("하남");
		Button east = new Button("우동");
		Button west = new Button("좌서");
		Button cent = new Button("중앙");
		// frame의 5개 영역에 Button을 하나씩 추가
		// "North" 대신 BorderLayout.NORTH 도 사용가능
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

