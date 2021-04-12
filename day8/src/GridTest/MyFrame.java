package GridTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {

		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//setLayout(new GridLayout(5, 3));
		setLayout(new FlowLayout());
		
		add(new JButton("Button1"));
		add(new JButton("Buttot2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));

		pack();
		setVisible(true);
	}

}
