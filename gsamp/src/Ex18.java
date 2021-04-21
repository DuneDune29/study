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
			super(title); // Frame(String) ������ ȣ��
			setSize(500, 300);
			setLayout(new GridLayout(13, 1));
			q1 = new Label("1. ActionEvent�� actionPerformed�� ȣ��Ǵ� ����?");
			q1cb1 = new Checkbox("Button�� Ŭ������ ��");
			q1cb2 = new Checkbox("TextField���� Enter Ű�� ���� ��");
			q1cb3 = new Checkbox("MenuItem�� Ŭ������ ��");
			q1cb4 = new Checkbox("List���� ����Ŭ������ item�� �������� ��");
			q2 = new Label("1. ActionEvent�� actionPerformed�� ȣ��Ǵ� ����?");
			group = new CheckboxGroup();
			q2cb1 = new Checkbox("FlowLayout", group, false);
			q2cb2 = new Checkbox("GridLayout", group, false);
			q2cb3 = new Checkbox("BorderLayout", group, false);
			q2cb4 = new Checkbox("CardLayout", group, false);
			score = new Label("* ��� : ");
			end = new Button("��� Ȯ��");
			end.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					float totalScore = 0;
					if (q1cb1.getState()) 	totalScore += 12.5;
					if (q1cb2.getState()) 	totalScore += 12.5;
					if (q1cb3.getState()) 	totalScore += 12.5;
					if (q1cb4.getState()) 	totalScore += 12.5;
					if (q2cb3.getState()) 	totalScore += 50;
					score.setText("* ��� : " + totalScore + "��");
				}
			});
			add(q1);		add(q1cb1);		add(q1cb2);		add(q1cb3);		add(q1cb4);
			add(new Label("")); // ������ ���̿� �� ���� �ϳ� �����ϱ� ���� ���
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