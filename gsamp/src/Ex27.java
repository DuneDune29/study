import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex27 extends Frame {
	public Ex27(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) { System.exit(0); }
		});
		setBounds(100, 100, 500, 500); 		setVisible(true);
	}
		public void paint(Graphics g) {
			Font f1 = new Font("Serif", Font.PLAIN, 30);
			Font f2 = new Font("Serif", Font.ITALIC, 30);
			Font f3 = new Font("Serif", Font.BOLD, 30);
			Font f4 = new Font("Broadway", Font.BOLD + Font.ITALIC, 30);
			Font f5 = new Font("±¼¸²", Font.BOLD, 30);
			Font f6 = new Font("±¼¸²Ã¼", Font.BOLD, 30);
			g.setFont(f1); 	g.drawString("Font Graphic - Serif", 50, 100);
			g.setFont(f2); 	g.setColor(Color.GREEN);
			g.drawString("Font Graphic - Serif", 50, 150);
			g.setFont(f3); 	g.setColor(new Color(200, 100, 255));
			g.drawString("Font Graphic - Serif", 50, 200);
			g.setFont(f4); 	g.setColor(new Color(100, 255, 200));
			g.drawString("Font Graphic - Broadway", 50, 250);
			g.setFont(f5); 
			g.setColor(new Color(255, 200, 100, 255));
			g.drawString("Font Graphic - ±¼¸²", 50, 300);
			g.setFont(f6); 
			g.setColor(new Color(255, 200, 100, 255));
			g.drawString("Font Graphic - ±¼¸²Ã¼", 50, 350);
		}
	public static void main(String[] args) { new Ex27("Font"); }
}