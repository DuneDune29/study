import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class OptionPaneTest extends JFrame implements ActionListener {
	JButton btn1, btn2, btn3;
	public OptionPaneTest() {
		setLayout(new FlowLayout());
		btn1 = new JButton("Message");  	btn2 = new JButton("Input");
		btn3 = new JButton("Confirm");
		add(btn1);  		add(btn2);  		add(btn3);
		btn1.addActionListener(this); 		btn2.addActionListener(this);
		btn3.addActionListener(this);
		setBounds(300, 200, 300, 300); 	 	setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			JOptionPane.showMessageDialog(this, "Message ǥ�� ��ȭ����");
		} else if (e.getSource() == btn2) {
			String str = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
			JOptionPane.showMessageDialog(this, str + "�� ȯ���մϴ�.");
		} else if (e.getSource() == btn3) {
			int ans = JOptionPane.showConfirmDialog(this, "��� â�� �����ұ��?");
			if (ans == JOptionPane.YES_OPTION) System.exit(0);
		}
	}
}
public class Ex12 {
	public static void main(String[] args) {
		OptionPaneTest opt = new OptionPaneTest(); 
	} 
}