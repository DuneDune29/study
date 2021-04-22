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
		jl = new JLabel(new ImageIcon("감.png"));
		JComboBox jc = new JComboBox();
		setLayout(new FlowLayout()); 		add(jl);
		jc.addItem("감"); 			jc.addItem("바나나");
		jc.addItem("배"); 			jc.addItem("사과");
		jc.addItem("앵두"); 			jc.addItem("포도");
		add(jc); 					jc.addItemListener(this);
		setSize(350, 200); 			setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String) ie.getItem();
		// 이벤트를 발생시킨 아이템의 문자열을 가져옴(얻어옴)
		jl.setIcon(new ImageIcon(fruit + ".png"));
		// JLabel 객체를 새로운 아이콘으로 설정
	}
}
public class Ex8 {
	public static void main(String[] args) {
		JComboBoxTest jcbt = new JComboBoxTest(); 
		}
	}