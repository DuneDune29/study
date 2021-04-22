import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class IconTest extends JFrame {
	public IconTest() {
		ImageIcon cor = new ImageIcon("cor.png");
		ImageIcon ame = new ImageIcon("ame.png");
		ImageIcon eng = new ImageIcon("eng.png");
		// 3������ ���⸦ ImageIcon ��ü�� ����
		JButton nat = new JButton(cor); // �ѱ� ����� JButton ��ü ����
		nat.setPressedIcon(ame); // ���콺�� �������� �̱� ���Ⱑ ��Ÿ���� ����
		nat.setRolloverIcon(eng); // ���콺�� ��ư���� ������ ���� ���Ⱑ ��Ÿ������ ����
		add(nat);
		setSize(300, 250); 		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class Ex4 {
	public static void main(String[] args) {
		IconTest it = new IconTest();
	}
}