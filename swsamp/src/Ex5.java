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
		ImageIcon 사과 = new ImageIcon("사과.png");
		ImageIcon 바나나 = new ImageIcon("바나나.png");
		ImageIcon 감 = new ImageIcon("감.png");
		ImageIcon 배 = new ImageIcon("배.png");
		ImageIcon 포도 = new ImageIcon("포도.png");

		JButton jb1 = new JButton("사과", 사과); 
		JButton jb2 = new JButton("바나나", 바나나); 
		JButton jb3 = new JButton("감", 감); 
		JButton jb4 = new JButton("배", 배); 
		JButton jb5 = new JButton("포도", 포도);
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
		// 버튼의 이름을 텍스트 필드에 나타낸다.
	}
}
public class Ex5 {
	public static void main(String[] args) {
		JButtonTest jbt = new JButtonTest();
	}
}