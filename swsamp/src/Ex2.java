import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Test Frame");
		JButton jb = new JButton("�׽�Ʈ ��ư");
		
		Container ct = jf.getContentPane();
		//������ �����ӿ� ������Ʈ�� �߰��ϱ� ���� �ǳڰ�ü ����
		ct.add(jb);
		
		jf.setSize(400, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}