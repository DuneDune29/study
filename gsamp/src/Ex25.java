import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex25 extends Frame {
	Image img = null;
	public Ex25(String title) {
		super(title);		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) { System.exit(0); } 
		});
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("java.png");
		setBounds(100, 100, 400, 300); 		setVisible(true);
	}
	public void paint(Graphics g) {
		if (img == null) return; 
		int imgWidth = img.getWidth(this);
		int imgHeight = img.getHeight(this);
		g.drawImage(img, (getWidth() - imgWidth) / 2, (getHeight() - imgHeight) / 2,
				this); // �̹����� Frame�� �߾ӿ� ���
	}
	public static void main(String[] args) { new Ex25("Image"); }
}	