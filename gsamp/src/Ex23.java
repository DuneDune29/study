import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex23 extends Frame implements MouseMotionListener {
	int x = 0, y = 0;
	public Ex23(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) { System.exit(0); } 
			});
		setBounds(100, 100, 500, 500); 		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawString("마우스를 움직여보세요.", 10, 50);
		g.drawString("*", x, y);
	}
	public void update(Graphics g) { paint(g); }
	public void mouseMoved(MouseEvent me) {
		x = me.getX(); 		y = me.getY();		repaint();
	}
	public void mouseDragged(MouseEvent me) { }
	public static void main(String[] args) { new Ex23("Graphics"); }
}	