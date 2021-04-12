package BasicPaint;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicPaint {
	public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

class MyPanel extends JPanel{
	
	public MyPanel() {
	
		setBorder(BorderFactory.createLineBorder(Color.black));
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 50, 50);
		g.drawOval(200, 50, 50, 50);

		g.setColor(Color.RED);
		g.fillOval(200, 50, 50, 50);
	}
}