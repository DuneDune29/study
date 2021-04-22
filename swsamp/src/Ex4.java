import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class IconTest extends JFrame {
	public IconTest() {
		ImageIcon cor = new ImageIcon("cor.png");
		ImageIcon ame = new ImageIcon("ame.png");
		ImageIcon eng = new ImageIcon("eng.png");
		// 3나라의 국기를 ImageIcon 객체로 생성
		JButton nat = new JButton(cor); // 한국 국기로 JButton 객체 생성
		nat.setPressedIcon(ame); // 마우스를 눌렀을때 미국 국기가 나타나게 설정
		nat.setRolloverIcon(eng); // 마우스를 버튼위에 있을때 영국 국기가 나타나도록 설정
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