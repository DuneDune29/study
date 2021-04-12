package textarea;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextArea extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;

	public TextArea() {
		setTitle("Text Area Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField(30);
		textField.addActionListener(this);

		textArea = new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER); // 24, 25 스크롤바 
		textArea.setEditable(false);

		add(textField, BorderLayout.NORTH);
		//add(textArea, BorderLayout.CENTER);

		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	} // 겟랭스를 쓰려면 겟다큐먼트를 같이써야한다.

	public static void main(String[] args) {
		new TextArea();
	}
}