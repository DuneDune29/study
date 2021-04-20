import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex04 {
	public static void main(String[] args) {
		Frame f = new Frame("List - Select");
		f.setSize(300, 200); 	f.setLayout(null);
		List selectOne = new List(6); // 6�� ����� ������ �� �ִ� ũ���� List�� ����
		selectOne.setLocation(20, 40); 	selectOne.setSize(100, 120);
 		selectOne.add("Student"); 	selectOne.add("Teacher");		
 		selectOne.add("Driver");		selectOne.add("Programmer");
		selectOne.add("Sales Man");		
		// �������� �� ��° ���ڰ��� true�� �����ؼ� List�� ��Ͽ��� ���� ���� ������ �� �ֵ��� ����
		List selectMany = new List(6, true);
		selectMany.setLocation(150, 40); 	selectMany.setSize(100, 120);  
		selectMany.add("Student");			selectMany.add("Teacher");
		selectMany.add("Driver"); 			selectMany.add("Programmer");
		selectMany.add("Sales Man");
		f.add(selectOne); 		f.add(selectMany); 		f.setVisible(true);
		f.addWindowListener(new EventHandler4());
		// EventHandler Ŭ������ ��ü�� �����ؼ� Frame�� WindowListener�� ���
	}
}
class EventHandler4 extends WindowAdapter {
	public void windowClosing(WindowEvent e) { // Frame�� �ݱ� ��ư�� �������� ȣ��
		super.windowClosing(e); 		
		System.exit(0); // ���α׷��� ����
	}
}