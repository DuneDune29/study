import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBoxTest extends JFrame implements ItemListener {
	JLabel jl;
	public JComboBoxTest() {
		jl = new JLabel(new ImageIcon("��.png"));
		JComboBox jc = new JComboBox();
		setLayout(new FlowLayout()); 		add(jl);
		jc.addItem("��"); 			jc.addItem("�ٳ���");
		jc.addItem("��"); 			jc.addItem("���");
		jc.addItem("�޵�"); 			jc.addItem("����");
		add(jc); 					jc.addItemListener(this);
		setSize(350, 200); 			setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String) ie.getItem();
		// �̺�Ʈ�� �߻���Ų �������� ���ڿ��� ������(����)
		jl.setIcon(new ImageIcon(fruit + ".png"));
		// JLabel ��ü�� ���ο� ���������� ����
	}
}
public class Ex8 {
	public static void main(String[] args) {
		JComboBoxTest jcbt = new JComboBoxTest(); 
		}
	}