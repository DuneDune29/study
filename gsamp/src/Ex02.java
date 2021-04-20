import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex02 {
	public static void main(String[] args) {
		Frame f = new Frame("Button");
		f.setSize(300, 200); 
		f.setLayout(null); // 레이아웃 매니저의 설정을 해제
		Button b = new Button("확 인");
		b.setSize(100, 50); // Button의 크기를 설정
		b.setLocation(100, 75); // Frame내에서의 Button 위치를 설정
		f.add(b); // 생성된 Button을 Frame에 추가
		f.setVisible(true);
		f.addWindowListener(new EventHandler2());
		// EventHandler 클래스의 객체를 생성해서 Frame의 WindowListener로 등록
	}
}
class EventHandler2 implements WindowListener {
	@Override
	public void windowClosing(WindowEvent e) { // Frame의 닫기 버튼을 눌렀을때 호출
		e.getWindow().setVisible(false); // Frame을 화면에ㅔ서 보이지 않도록 하고
		e.getWindow().dispose(); // 메모리에서 제거
		System.exit(0); // 프로그램을 종료
	}
	@Override
	public void windowActivated(WindowEvent e) {    }
	@Override
	public void windowClosed(WindowEvent e) {  	 }
	@Override
	public void windowDeactivated(WindowEvent e) {    }
	@Override
	public void windowDeiconified(WindowEvent e) {    }
	@Override
	public void windowIconified(WindowEvent e) {	}
	@Override
	public void windowOpened(WindowEvent e) {    }
}