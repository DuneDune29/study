import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex21 extends Frame {
	Label location;
	Ex21(String title) {
		super(title);
		location = new Label("Mouse Pointer Location : ");
		location.setSize(195,15);		location.setLocation(10, 30);
		location.setBackground(Color.yellow);		add(location);
		addMouseMotionListener(new EventHandler29());
		// EventHandler의 인스턴스를 Frame의 Listener로 등록
		setSize(300, 200); 		setLayout(null);		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { System.exit(0); }
			});
	}
	public static void main(String[] args) {
		Ex21 exWin = new Ex21("MouseEventTest");
	}
	class EventHandler29 implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) { }
		public void mouseMoved(MouseEvent e) { 
			location.setText("Mouse Pointer Location : ("
					+ e.getX() + ", " + e.getY() + ")");
		}
	}
}