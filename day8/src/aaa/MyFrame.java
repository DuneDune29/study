package aaa;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame  extends JFrame{
	//JPanel p1;
	
	public MyFrame() {
		setSize(300, 200);
		setTitle("My Frame");
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		//p1.setLayout(new GridLayout(0,3));
		for (int i = 0; i<10; i++)
			p1.add(new JButton("Button"+i));
		add(p1);
		setVisible(true); //프레임을 화면에 표시한다.
	}
}