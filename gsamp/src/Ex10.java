import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex10 {
	public static void main(String[] args) {
		Frame f = new Frame("Panel");
		f.setSize(300, 200);
		f.setLayout(null);
		Panel p = new Panel();
		p.setBackground(Color.green); 
		p.setSize(200, 100);
		p.setLocation(50, 50);
		Button ok = new Button("OK");
		p.add(ok); // Button을 Panel에 추가
		f.add(p); // Panel을 Frame에 추가
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