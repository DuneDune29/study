package FrameTest;

import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Frame Test");
		
		f.setSize(500,300); // ȭ�� ũ��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
