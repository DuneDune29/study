import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JButtonTest extends JFrame implements ActionListener{
	JLabel jla;
	public JButtonTest() {
		jla = new JLabel("");
		ImageIcon ��� = new ImageIcon("���.png");
		ImageIcon �ٳ��� = new ImageIcon("�ٳ���.png");
		ImageIcon �� = new ImageIcon("��.png");
		ImageIcon �� = new ImageIcon("��.png");
		ImageIcon ���� = new ImageIcon("����.png");

		JButton jb1 = new JButton("���", ���); 
		JButton jb2 = new JButton("�ٳ���", �ٳ���); 
		JButton jb3 = new JButton("��", ��); 
		JButton jb4 = new JButton("��", ��); 
		JButton jb5 = new JButton("����", ����);
		setLayout(new GridLayout(3, 2));
		add(jb1);  		add(jb2);  		add(jb3);
		add(jb4);  		add(jb5);  		add(jla);
		jb1.addActionListener(this); 		jb2.addActionListener(this);
		jb3.addActionListener(this); 		jb4.addActionListener(this);
		jb5.addActionListener(this); 	
		setSize(250, 300); 		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		jla.setText(ae.getActionCommand());
		// ��ư�� �̸��� �ؽ�Ʈ �ʵ忡 ��Ÿ����.
	}
}
public class Ex5 {
	public static void main(String[] args) {
		JButtonTest jbt = new JButtonTest();
	}
}