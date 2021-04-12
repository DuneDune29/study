package Buttontest;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockPaperScissor extends JFrame implements ActionListener {
	static final int ROCK = 0;
	static final int PAPER = 0;
	static final int SCISSOR = 0;

	private JPanel panel;
	private JButton rock;
	private JButton paper;
	private JButton scissor;
	private JTextField information;
	private JTextField output;

	public RockPaperScissor() {
		setTitle("°¡À§, ¹ÙÀ§, º¸");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));

		information = new JTextField("°í¸£¼À");
		output = new JTextField(20);

		rock = new JButton("ROCK");
		paper = new JButton("PAPER");
		scissor = new JButton("SCISSOR");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);

		// panel = new JPanel();
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);

		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		RockPaperScissor gui = new RockPaperScissor();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int SCISSOR=1;
		int ROCK=0;
		int PAPER=2;
				
		Random random = new Random();
		int computer = random.nextInt(3);
		if (e.getSource() == rock) {
			if (computer == SCISSOR)
				output.setText("³Ê ½Â¸®");
			else if (computer == ROCK)
				output.setText("ºñ±è");
			else
				output.setText("³» ½Â¸®");
		}
		if (e.getSource() == paper) {
			if (computer == ROCK)
				output.setText("³Ê ½Â¸®");
			else if (computer == PAPER)
				output.setText("ºñ±è");
			else
				output.setText("³» ½Â¸®");
		}
		if (e.getSource() == scissor) {
			if (computer == PAPER)
				output.setText("³Ê ½Â¸®");
			else if (computer == SCISSOR)
				output.setText("ºñ±è");
			else
				output.setText("³» ½Â¸®");
		}
	}
}