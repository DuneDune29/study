import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
class FrameExam extends JFrame {
	MainPanel mainPan;
	public FrameExam() {
		mainPan = new MainPanel();
		add(mainPan, BorderLayout.CENTER);
		pack(); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MainPanel extends JPanel implements ActionListener {
	JTextField txtName, txtID, txtPwd, txtAge;
	JButton btnAdd, btnCancel;
	public MainPanel() {
		setLayout(new GridLayout(6, 1));
		add(new JLabel("���� �Է�...", SwingConstants.CENTER));
		JPanel p1 = new JPanel();
		p1.add(new JLabel("��  ��: ", JLabel.RIGHT));
		p1.add(txtName = new JTextField(20)); 		add(p1);
		JPanel p2 = new JPanel();
		p2.add(new JLabel("�� �� ��: ", JLabel.RIGHT));
		p2.add(txtID = new JTextField(20)); 		add(p2);
		JPanel p3 = new JPanel();
		p3.add(new JLabel("�н�����: ", JLabel.RIGHT));
		p3.add(txtPwd = new JTextField(20)); 		add(p3);
		JPanel p4 = new JPanel();
		p4.add(btnAdd = new JButton("�����ϱ�"));
		p4.add(btnCancel = new JButton("�ٽþ���")); 	add(p4);
		btnAdd.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String msg = "";
		if (e.getSource() == btnAdd) {
			msg += " �̸� : " + txtName.getText(); 
			msg += "\n ���̵� : " + txtID.getText(); 
			msg += "\n �н����� : " + txtPwd.getText(); 
		} else if (e.getSource() == btnCancel) {
			msg = "�Է��� ������ ����մϴ�. �ٽ� �Է��ϼ���!";
		}
		JOptionPane.showMessageDialog(this, msg);
		txtName.setText("");    	txtID.setText("");
		txtPwd.setText("");
	}
}
public class Ex11 {
	public static void main(String[] args) { FrameExam f = new FrameExam(); } 
}