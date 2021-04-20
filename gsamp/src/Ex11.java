import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex11 {
	public static void main(String[] args) {
		Frame f = new Frame("ScrollPaneTest");
		f.setSize(200, 200);
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.green); 
		p.add(new Button("1번째"));
		p.add(new Button("2번째"));
		p.add(new Button("3번째"));
		p.add(new Button("4번째"));
		p.add(new Button("5번째"));
		sp.add(p);
		f.add(sp);
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