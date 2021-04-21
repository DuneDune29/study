import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex24 extends Frame implements MouseMotionListener {
	int x = 0, y = 0;
	Image img = null;
	Graphics gImg = null;
	public Ex24(String title) {
		super(title);		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) { System.exit(0); } 
		});
		setBounds(100, 100, 500, 500); 		setVisible(true);
		img = createImage(500, 500); 		gImg = img.getGraphics();
		gImg.drawString("왼쪽버튼을 누른 채로 마우스를 움직여보세요.", 10, 50);
		repaint();
	}
	public void paint(Graphics g) {
		if (img != null) g.drawImage(img, 0, 0, this);
		// 가상화면에 그려진 그림을 Frame에 복사
	}
	public void mouseMoved(MouseEvent me) { }
	public void mouseDragged(MouseEvent me) {
		if (me.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			x = me.getX(); 			y = me.getY();
			gImg.setColor(new Color(255, 130, 0));
			gImg.fillOval(x, y, 10, 10);
			repaint();
		}
	}
	public static void main(String[] args) { new Ex24("Graphics"); }
}	