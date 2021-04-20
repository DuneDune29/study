import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 {
	public static void main(String[] args) {
		Frame f = new Frame("Login"); // Frame 객체 생성
		f.setSize(300, 200); // Frame 크기 설정
		
		f.addWindowListener(new EventHandler());
		// EventHandler 클래스의 객체를 생성해서 Frame의 WindowListener로 등록
		f.setVisible(true); // 생성한 Frame을 화면에 표시
	}
}
class EventHandler implements WindowListener {
	@Override
	public void windowClosing(WindowEvent e) { // Frame의 닫기 버튼을 눌렀을때 호출
		e.getWindow().setVisible(false); // Frame을 화면에ㅔ서 보이지 않도록 하고
		e.getWindow().dispose(); // 메모리에서 제거
		System.exit(0); // 프로그램을 종료
	}
	@Override
	public void windowActivated(WindowEvent e) {   }
	@Override
	public void windowClosed(WindowEvent e) {	}
	@Override
	public void windowDeactivated(WindowEvent e) {	}
	@Override
	public void windowDeiconified(WindowEvent e) {    }
	@Override
	public void windowIconified(WindowEvent e) {	}
	@Override
	public void windowOpened(WindowEvent e) {   }
}