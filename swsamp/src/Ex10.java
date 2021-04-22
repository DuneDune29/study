import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JListTest2 extends JFrame implements ListSelectionListener {
	private String[] fruitlist = { "��", "�ٳ���", "���", "����", "�޵�", "��" };
	private JList jlist = new JList(fruitlist);
	private ImageIcon[] fruiticons = { new ImageIcon("��.png"),
			new ImageIcon("�ٳ���.png"), new ImageIcon("���.png"),
			new ImageIcon("����.png"), new ImageIcon("�޵�.png"),
			new ImageIcon("��.png") }; // ImageIcon �迭 ����
	private JLabel[] jlicon = new JLabel[6];
	public JListTest2() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 2, 5, 5));
		for (int i = 0; i < 6; i++) {
			p.add(jlicon[i] = new JLabel());
		}
		getContentPane().add(p, BorderLayout.CENTER);
		getContentPane().add(jlist, BorderLayout.WEST);
		jlist.addListSelectionListener(this);
		setSize(300, 300); 			setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent e) {
		int[] indices = jlist.getSelectedIndices(); // ���� ���õ� �׸��� ���� �迭�� ����
		int i;
		for (i = 0; i < indices.length; i++) {
			jlicon[i].setIcon(fruiticons[indices[i]]); // ���õ� �׸� ������ ����
		}
		for (; i < 6; i++) {
			jlicon[i].setIcon(null); // JLabel �迭 ��ü�� �� �׸��� ������ ������ ����
		}
	}
}
public class Ex10 {
	public static void main(String[] args) {
		JListTest2 jlt2 = new JListTest2(); 
	}
}