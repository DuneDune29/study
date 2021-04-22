import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Test Frame");
		JButton jb = new JButton("테스트 버튼");
		
		Container ct = jf.getContentPane();
		//생성된 프레임에 컴포넌트를 추가하기 위해 판넬객체 생성
		ct.add(jb);
		
		jf.setSize(400, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}