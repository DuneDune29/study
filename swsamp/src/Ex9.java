import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JListTest extends JFrame implements ListSelectionListener {
	JList list;
	JTextField tf;
	public JListTest() {
		String[] str = { "���", "����", "����", "�뷡", "��ȭ" };
		list = new JList(str);
		add(new Label("��� ����"), BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		tf = new JTextField(); 		add(tf, BorderLayout.SOUTH);
		list.addListSelectionListener(this);
		setSize(400, 200); 			setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent e) {
		Object[] item; // ���õ� �׸���� ������ �迭
		String total = ""; 			int i;
		JList li = (JList) e.getSource();
		item = li.getSelectedValues(); // ���õ� �׸���� ����
		for (i = 0; i < item.length - 1; i++)
			total = total + item[i] + ", ";
		total = total + item[i];
		// ���������� ���õ� �׸� �������� ,�� ������� �ʵ��� �ϱ� ���� ó��
		tf.setText(total + "��(��) ���õǾ����ϴ�.");
	}
}
public class Ex9 {
	public static void main(String[] args) {
		JListTest jlt = new JListTest(); 
	}
}