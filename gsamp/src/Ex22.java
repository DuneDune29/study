import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex22 extends Frame {
	public Ex22(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { 
				System.exit(0);
			}
		});
		setBounds(100, 100, 500, 500); 		setVisible(true);
	}
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.PLAIN, 20));
		g.drawString("Graphics를 이용해서 그림을 그립니다.", 50, 70);
		g.setColor(Color.red);		g.drawLine(50, 80, 400, 80);
		g.setColor(Color.blue);		g.drawOval(50, 100, 50, 50);
		g.setColor(Color.blue);		g.fillOval(120, 100, 50, 50);
		g.setColor(Color.green);	g.drawRect(200, 100, 80, 80);
		g.setColor(Color.green);	g.fillRect(350, 100, 100, 100);
		g.setColor(Color.gray);		g.drawRoundRect(50, 220, 80, 80, 30, 30);
		g.setColor(Color.gray);		g.fillRoundRect(150, 220, 100, 100, 30, 30);
		g.setColor(Color.cyan);		g.drawArc(250, 220, 80, 80, 0, 120);
		g.setColor(Color.cyan);		g.fillArc(350, 220, 100, 100, 0, 120);
		g.setColor(Color.orange);		
		g.fillPolygon(new int[] { 150, 50, 300, 200 },
					new int[] { 350, 450, 450, 350 }, 4);
		g.setColor(Color.orange);
		int x[] = new int[] { 400, 350, 450 };
		int y[] = new int[] { 350, 450, 450 };
		g.drawPolygon(x, y, x.length);
	}	
	public static void main(String[] args) { new Ex22("Graphics"); }
}	