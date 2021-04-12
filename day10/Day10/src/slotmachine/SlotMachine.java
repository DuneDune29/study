package slotmachine;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Counter2 extends JFrame implements ActionListener {
	private JLabel[] labels;
	private JLabel label;
	private JButton button;
	private int[] numbers;
	public Counter2() {
		setSize(500, 400);
		JPanel panel = new JPanel();
		panel.setLayout(null);

		labels = new JLabel[3];
		label = new JLabel();
		numbers = new int[3];

		for (int i = 0; i < 3; i++) {
			labels[i] = new JLabel("" + numbers[i]);
			labels[i].setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100 + 100 * i, 20);
			panel.add(labels[i]);
		}
		panel.add(label, BorderLayout.SOUTH);
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		label.setSize(300, 30);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setLocation(100, 250);
		
		panel.add(button);
		button = new JButton("스핀");
		button.setSize(250, 50);
		button.setLocation(100, 150);
		button.addActionListener(this);
		add(panel);
		setTitle("My Game");

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		for (int i = 0; i < 3; i++) {
			numbers[i] = (int) (Math.random() * 10);
			labels[i].setText("" + numbers[i]);
			
		}
			if ((numbers[0] == numbers[1]) && (numbers[0] == numbers[2])) 
				label.setText("상금으로 10만원을 지급합니다.");
			else 
					label.setText("");
			}
		}



public class SlotMachine {
	public static void main(String[] args) {
		new Counter2();
	
	}
}