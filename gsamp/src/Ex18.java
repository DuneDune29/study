import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex18 extends Frame {
		Label q1, q2, score;
		Checkbox q1cb1, q1cb2, q1cb3, q1cb4;  
		Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
		CheckboxGroup group;
		Button end;
		EventHandler26 eh;
		Ex18(String title) {
			super(title); // Frame(String) 생성자 호출
			setSize(500, 300);
			setLayout(new GridLayout(13, 1));
			q1 = new Label("1. ActionEvent의 actionPerformed가 호출되는 경우는?");
			q1cb1 = new Checkbox("Button을 클릭했을 때");
			q1cb2 = new Checkbox("TextField에서 Enter 키를 쳤을 때");
			q1cb3 = new Checkbox("MenuItem을 클릭했을 때");
			q1cb4 = new Checkbox("List에서 더블클릭으로 item을 선택했을 때");
			q2 = new Label("1. ActionEvent의 actionPerformed가 호출되는 경우는?");
			group = new CheckboxGroup();
			q2cb1 = new Checkbox("FlowLayout", group, false);
			q2cb2 = new Checkbox("GridLayout", group, false);
			q2cb3 = new Checkbox("BorderLayout", group, false);
			q2cb4 = new Checkbox("CardLayout", group, false);
			score = new Label("* 결과 : ");
			end = new Button("결과 확인");
			end.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					float totalScore = 0;
					if (q1cb1.getState()) 	totalScore += 12.5;
					if (q1cb2.getState()) 	totalScore += 12.5;
					if (q1cb3.getState()) 	totalScore += 12.5;
					if (q1cb4.getState()) 	totalScore += 12.5;
					if (q2cb3.getState()) 	totalScore += 50;
					score.setText("* 결과 : " + totalScore + "점");
				}
			});
			add(q1);		add(q1cb1);		add(q1cb2);		add(q1cb3);		add(q1cb4);
			add(new Label("")); // 문제들 사이에 빈 줄을 하나 삽입하기 위해 사용
			add(q2);		add(q2cb1);		add(q2cb2);		add(q2cb3);		add(q2cb4);
			add(end);		add(score);		setVisible(true);
			eh = new EventHandler26(); 		addWindowListener(eh);
		}
		public static void main(String[] args) { Ex18 exWin = new Ex18("Quiz"); }
}
class EventHandler26 extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) { System.exit(0); }
		}