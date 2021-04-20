import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex07 {
	public static void main(String[] args) {
		Frame f = new Frame("Questions");
		f.setSize(500, 150);	f.setLayout(new FlowLayout());
		Label q1 = new Label("1. 당신의 관심 분야는?");
		Checkbox news = new Checkbox("news", true); // 선택된 상태로 생성
		Checkbox sports = new Checkbox("sports");
		Checkbox movies = new Checkbox("movies");
		Checkbox music = new Checkbox("music"); 
		f.add(q1);
		f.add(news); 		f.add(sports);
		f.add(movies);		f.add(music);
		Label q2 = new Label("2. 복습 정리하는 횟수는?");
		CheckboxGroup group1 = new CheckboxGroup(); // 단일 선택
		Checkbox movie1 = new Checkbox("한 달에 1번", group1, true);
		Checkbox movie2 = new Checkbox("일주일에 1번", group1, false);
		Checkbox movie3 = new Checkbox("일주일에 2번", group1, false);
		f.add(q2);
		f.add(movie1); 		f.add(movie2);		f.add(movie3);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { 
				super.windowClosing(e); 	
				System.exit(0); 
			}		
		});
	}
}