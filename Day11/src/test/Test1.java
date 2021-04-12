package test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import combobox.ComboBoxTest;

public class Test1 extends JFrame implements ActionListener {

	private JButton button;
	private JLabel label;
	private JTextArea text;
	private String t;

	public Test1() {
		super("TESTING");
		label = new JLabel("Hello!!!!");
		button = new JButton("Color Change");
		text = new JTextArea("Test");
		setLayout(new FlowLayout());
		label.setOpaque(true);
		add(button);
		add(label);
		add(text);

		LabelHandler labelHandler = new LabelHandler();

		button.addActionListener(this);
		label.addMouseListener(labelHandler);

		setSize(300, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label.setBackground(Color.red);
		}
		if (e.getSource() == text) {
			if (t == "\n") {
				setTitle(t);
				label.getText();
			}
		}
	}

	class LabelHandler extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			label.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
	}
}
