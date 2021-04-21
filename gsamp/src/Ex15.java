import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex15 {
	public static void main(String[] args) {
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(200, 200);
		f.setLayout(new FlowLayout((FlowLayout.LEFT))); // 3행2열의 그리드
		f.add(new Button("1 번째"));	
		f.add(new Button("2 번째"));	
		f.add(new Button("3 번째"));	
		f.add(new Button("4 번째"));	
		f.add(new Button("5 번째"));	
		f.add(new Button("6 번째"));	
		f.add(new Button("7 번째"));	
		f.add(new Button("8 번째"));	
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