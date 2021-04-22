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
	private String[] fruitlist = { "감", "바나나", "사과", "포도", "앵두", "배" };
	private JList jlist = new JList(fruitlist);
	private ImageIcon[] fruiticons = { new ImageIcon("감.png"),
			new ImageIcon("바나나.png"), new ImageIcon("사과.png"),
			new ImageIcon("포도.png"), new ImageIcon("앵두.png"),
			new ImageIcon("배.png") }; // ImageIcon 배열 생성
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
		int[] indices = jlist.getSelectedIndices(); // 다중 선택된 항목을 정수 배열로 저장
		int i;
		for (i = 0; i < indices.length; i++) {
			jlicon[i].setIcon(fruiticons[indices[i]]); // 선택된 항목만 아이콘 설정
		}
		for (; i < 6; i++) {
			jlicon[i].setIcon(null); // JLabel 배열 객체의 각 항목의 아이콘 설정을 해제
		}
	}
}
public class Ex10 {
	public static void main(String[] args) {
		JListTest2 jlt2 = new JListTest2(); 
	}
}