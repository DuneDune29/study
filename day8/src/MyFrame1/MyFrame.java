package MyFrame1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[30];
	
	public MyFrame() {
		p.setLayout(null);
		p.setBackground(Color.yellow);
		for(int i = 0; i<30; i++) {
			labels[i] = new JLabel(""+i);
			int x=(int) (500 * Math.random());
			int y=(int) (200 * Math.random());
			labels[i].setForeground(Color.magenta);
			labels[i].setLocation(x,y);
			labels[i].setSize(20, 20);
			p.add(labels[i]);
		}
		setSize(500, 300);
		add(p);
		setVisible(true); // 프레임을 화면에 표시한다.
	}

}
