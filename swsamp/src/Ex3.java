import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3 extends JFrame {
	public Ex3() {
	Container ct = getContentPane();
		ct.setLayout(new BorderLayout(10, 10));
		ct.add(new JButton("�����ʹ�ư"), BorderLayout.EAST);
		ct.add(new JButton("���ʹ�ư"), BorderLayout.WEST);
		ct.add(new JButton("���ʹ�ư"), BorderLayout.NORTH);
		ct.add(new JButton("�Ʒ��ʹ�ư"), BorderLayout.SOUTH);
		ct.add(new JButton("�߾ӹ�ư"), "Center");
	}
	public static void main(String[] args) {
		Ex3 bld = new Ex3();
		bld.setTitle("BorderLayout Test");
		bld.setSize(400, 300);
		bld.setVisible(true);
		bld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}