import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex14 {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayoutTest");
		f.setSize(300, 200);
		f.setLayout(new GridLayout(3, 2)); // 3행2열의 그리드
		f.add(new Button("1"));	
		f.add(new Button("2"));	
		f.add(new Button("3"));	
		f.add(new Button("4"));	
		f.add(new Button("5"));	
		f.add(new Button("6"));	
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