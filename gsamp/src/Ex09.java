import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex09 {
	public static void main(String[] args) {
		Frame f = new Frame("CanvasTest");
		f.setSize(300, 200);
		f.setLayout(null);
		Canvas c = new Canvas();
		c.setBackground(Color.pink); // Canvas의 배경(면)색을 pink로 설정
		c.setBounds(50, 50, 200, 100);
		f.add(c);
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