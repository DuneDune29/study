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
		String[] str = { "등산", "서핑", "독서", "노래", "영화" };
		list = new JList(str);
		add(new Label("취미 선택"), BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		tf = new JTextField(); 		add(tf, BorderLayout.SOUTH);
		list.addListSelectionListener(this);
		setSize(400, 200); 			setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent e) {
		Object[] item; // 선택된 항목들을 저장할 배열
		String total = ""; 			int i;
		JList li = (JList) e.getSource();
		item = li.getSelectedValues(); // 선택된 항목들을 얻어옴
		for (i = 0; i < item.length - 1; i++)
			total = total + item[i] + ", ";
		total = total + item[i];
		// 마지막으로 선택된 항목 다음에는 ,가 연결되지 않도록 하기 위한 처리
		tf.setText(total + "가(이) 선택되었습니다.");
	}
}
public class Ex9 {
	public static void main(String[] args) {
		JListTest jlt = new JListTest(); 
	}
}