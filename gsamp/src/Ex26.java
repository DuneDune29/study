import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex26 extends Frame {
	Image img = null;
	int xPos, yPos, imgW, imgH;

	public Ex26(String title) {
		super(title);
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("java.png");
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				System.out.println("ÀÌ¹ÌÁö X ÁÂÇ¥ : " + xPos + ", ÀÌ¹ÌÁö Y ÁÂÇ¥ : " + yPos);
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (yPos > 0)
						yPos -= 10;
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (yPos < getHeight() - imgH)
						yPos += 10;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (xPos > 0)
						xPos -= 10;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (xPos < getWidth() - imgW)
						xPos += 10;
				}
				repaint();
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}

	public void paint(Graphics g) {
		imgW = img.getWidth(this);
		imgH = img.getHeight(this);
		g.drawImage(img, xPos, yPos, imgW, imgH, this);
	}

	public static void main(String[] args) {
		new Ex26("Image");
	}
}