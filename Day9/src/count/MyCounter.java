package count;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Counter extends JFrame implements ActionListener {
	private JLabel label, label1;
	private JButton button, button1, button2;
	private int count = 0;

	public Counter() {
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);

		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));

		panel.add(label1);

		button = new JButton("카운터 증가");
		panel.add(button);
		button.addActionListener(this);

		button1 = new JButton("카운터 감소");
		panel.add(button1);
		button1.addActionListener(this);

		button2 = new JButton("카운터 초기화");
		panel.add(button2);
		button2.addActionListener(this);

		this.add(panel);
		setSize(500, 300);
		setTitle("My Counter");

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == button) {
			count++;
		} else if (event.getSource() == button1) {
			count--;
		} else if (event.getSource() == button2) {
			count = 0;
		} else
			System.out.println("에러 입니다.");

		label1.setText(count + "");
	}
}

public class MyCounter {
	public static void main(String[] args) {
		new Counter();
	}
}