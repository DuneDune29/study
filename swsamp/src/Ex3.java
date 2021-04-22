import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3 extends JFrame {
	public Ex3() {
	Container ct = getContentPane();
		ct.setLayout(new BorderLayout(10, 10));
		ct.add(new JButton("오른쪽버튼"), BorderLayout.EAST);
		ct.add(new JButton("왼쪽버튼"), BorderLayout.WEST);
		ct.add(new JButton("위쪽버튼"), BorderLayout.NORTH);
		ct.add(new JButton("아래쪽버튼"), BorderLayout.SOUTH);
		ct.add(new JButton("중앙버튼"), "Center");
	}
	public static void main(String[] args) {
		Ex3 bld = new Ex3();
		bld.setTitle("BorderLayout Test");
		bld.setSize(400, 300);
		bld.setVisible(true);
		bld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}