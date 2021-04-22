import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class JComboTest extends JFrame implements ItemListener {
	JComboBox combo;
	JTextArea ta;
	public JComboTest() {
		String[] str = { "�̸�", "���̵�", "����", "��ȭ��ȣ" };
		combo = new JComboBox(str);
		add(new Label("�˻��ϰ��� �ϴ� �׸��� �����Ͻÿ�."), BorderLayout.NORTH);
		add(combo, BorderLayout.CENTER);
		ta = new JTextArea(10, 20);
		add(new JScrollPane(ta), BorderLayout.SOUTH);
		combo.addItemListener(this);
		pack(); 	setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) 
			ta.append(e.getItem() + "��(��) ���õǾ����ϴ�.\n");
	}
}
public class Ex7 {
	public static void main(String[] args) {
		JComboTest jct = new JComboTest(); 
		}
	}