import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex04 {
	public static void main(String[] args) {
		Frame f = new Frame("List - Select");
		f.setSize(300, 200); 	f.setLayout(null);
		List selectOne = new List(6); // 6개 목록을 보여줄 수 있는 크기의 List를 생성
		selectOne.setLocation(20, 40); 	selectOne.setSize(100, 120);
 		selectOne.add("Student"); 	selectOne.add("Teacher");		
 		selectOne.add("Driver");		selectOne.add("Programmer");
		selectOne.add("Sales Man");		
		// 생성자의 두 번째 인자값을 true로 설정해서 List의 목록에서 여러 개를 선택할 수 있도록 설정
		List selectMany = new List(6, true);
		selectMany.setLocation(150, 40); 	selectMany.setSize(100, 120);  
		selectMany.add("Student");			selectMany.add("Teacher");
		selectMany.add("Driver"); 			selectMany.add("Programmer");
		selectMany.add("Sales Man");
		f.add(selectOne); 		f.add(selectMany); 		f.setVisible(true);
		f.addWindowListener(new EventHandler4());
		// EventHandler 클래스의 객체를 생성해서 Frame의 WindowListener로 등록
	}
}
class EventHandler4 extends WindowAdapter {
	public void windowClosing(WindowEvent e) { // Frame의 닫기 버튼을 눌렀을때 호출
		super.windowClosing(e); 		
		System.exit(0); // 프로그램을 종료
	}
}