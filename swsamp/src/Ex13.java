import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class RadioButtonPanel extends JPanel implements ActionListener {
	JLabel jl1 = new JLabel("성별 : ", SwingConstants.CENTER);
	JTextField jtf1 = new JTextField();
	public RadioButtonPanel() {
		ButtonGroup gr = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("남자", true);
		JRadioButton jrb2 = new JRadioButton("여자", false);
		gr.add(jrb1);  	gr.add(jrb2);
		setLayout(new GridLayout(3, 1)); 		add(jl1);
		JPanel jp = new JPanel();
		jp.add(jrb1); 		jp.add(jrb2); 		add(jp); 		add(jtf1);
		jrb1.addActionListener(this);  			jrb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand(); 		jtf1.setText("성별 : " + s);
	}
}
class ComboPanel extends JPanel implements ItemListener {
		JLabel jl2 = new JLabel("혈액형 : ", SwingConstants.CENTER);
		JTextField jtf2 = new JTextField();
		public ComboPanel() {
			JComboBox jcb = new JComboBox();
			jcb.addItem("A형");  jcb.addItem("B형");
			jcb.addItem("AB형");  jcb.addItem("O형");
			setLayout(new GridLayout(3, 1));
			add(jl2); 		add(jcb);		add(jtf2);
			jcb.addItemListener(this);
		}
		public void itemStateChanged(ItemEvent ie) {
			Object s = ie.getItem(); 		jtf2.setText("혈액형 : " + s.toString());
		}
}
class JTabPanelTest extends JFrame {
	public JTabPanelTest() {
		JTabbedPane jtp = new JTabbedPane();
		RadioButtonPanel rbp = new RadioButtonPanel();
		ComboPanel cp = new ComboPanel();
		jtp.addTab("성별", rbp);		jtp.addTab("혈액형", cp);
		add(jtp); 		setSize(200, 200);  	setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class Ex13 {
public static void main(String[] args) {
	JTabPanelTest jtpt = new JTabPanelTest(); 
	} 
}