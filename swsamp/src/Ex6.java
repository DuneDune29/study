import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class JRadioTest extends JFrame implements ItemListener {
	JPanel panel;
	JRadioButton rb1, rb2;
	JCheckBox ch1, ch2, ch3;
	JTextArea ta;
	public JRadioTest() {
		panel = new JPanel(new GridLayout(2, 1));
		JPanel p1 = new JPanel();
		ButtonGroup gr = new ButtonGroup();
		rb1 = new JRadioButton(" �� �� ", true);
		rb2 = new JRadioButton(" �� �� ", false);
		gr.add(rb1);	gr.add(rb2);
		p1.add(new JLabel(" ���� : "));
		p1.add(rb1);	p1.add(rb2); 		panel.add(p1);
		JPanel p2 = new JPanel();
		ch1 = new JCheckBox(" �� ��", true);
		ch2 = new JCheckBox(" �� ��", false);
		ch3 = new JCheckBox(" �� ��", false);
		p2.add(new JLabel(" ��� : "));
		p2.add(ch1);	p2.add(ch2); 		p2.add(ch3);
		panel.add(p2);
		add(panel, BorderLayout.NORTH);  	ta = new JTextArea(10, 20);
		add(new JScrollPane(ta), BorderLayout.CENTER);
		rb1.addItemListener(this); 		rb2.addItemListener(this);
		ch1.addItemListener(this); 		ch2.addItemListener(this);
		ch3.addItemListener(this);
		setSize(250, 300); 		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if ( obj == rb1) ta.append("���� ���� \n");
			else if ( obj == rb2) ta.append("���� ���� \n");
		}
		if ( obj == ch1)
			if (e.getStateChange() == ItemEvent.SELECTED) ta.append("��� ���� \n");
			else ta.append("��� ���� \n");
		if ( obj == ch2)
			if (e.getStateChange() == ItemEvent.SELECTED) ta.append("�ڵ� ���� \n");
			else ta.append("�ڵ� ���� \n");
		if ( obj == ch3)
			if (e.getStateChange() == ItemEvent.SELECTED) ta.append("���� ���� \n");
			else ta.append("���� ���� \n");
	}
}
public class Ex6 {
	public static void main(String[] args) { JRadioTest jrt = new JRadioTest(); }
}