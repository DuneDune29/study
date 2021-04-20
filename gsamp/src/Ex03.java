import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03 {
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200); 
		f.setLayout(null);
		Choice day = new Choice(); // Choice 객체를 생성
		day.add("SUN"); // Choice의 목록에 나타날 값들을 추가
		day.add("MON");		day.add("TUE");		day.add("WED");
		day.add("THU");		day.add("FRI");		day.add("SAT");	
		day.setSize(100, 50); 		day.setLocation(100, 70);
		f.add(day); 		f.setVisible(true);
		f.addWindowListener(new EventHandler3());
		// EventHandler 클래스의 객체를 생성해서 Frame의 WindowListener로 등록
	}
}
class EventHandler3 implements WindowListener {
	@Override
	public void windowClosing(WindowEvent e) { // Frame의 닫기 버튼을 눌렀을때 호출
		e.getWindow().setVisible(false); // Frame을 화면에ㅔ서 보이지 않도록 하고
		e.getWindow().dispose(); // 메모리에서 제거
		System.exit(0); // 프로그램을 종료
	}
	public void windowActivated(WindowEvent e) {   
	}
	public void windowClosed(WindowEvent e) {  	 
	}
	public void windowDeactivated(WindowEvent e) {  
	}
	public void windowDeiconified(WindowEvent e) {  
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {   
	}
}