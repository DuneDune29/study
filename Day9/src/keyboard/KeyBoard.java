package keyboard;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyBoard extends JFrame implements KeyListener {

	private JPanel panel;
	private JTextField field;
	private JTextArea area;

	public KeyBoard() {
		panel = new JPanel(new GridLayout(0, 2));
		panel.add(new JLabel("문자를 입력하시오: "));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		KeyBoard K = new KeyBoard();
	}

	public void keyTyped(KeyEvent e) {
		display(e, "key Typed       ");
	}

	public void keyPressed(KeyEvent e) {
		display(e, "key Pressed   ");
	}

	public void keyReleased(KeyEvent e) {
		display(e, "key Released ");
	}

	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int KeyCode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: " + e.isControlDown() + "Shift: " + e.isShiftDown();
		area.append("" + s + "문자 " + c + "(코드: " + KeyCode + ") " + modifiers + "\n");
	}
}