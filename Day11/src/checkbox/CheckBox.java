package checkbox;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBox extends JPanel implements ItemListener {
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = { "apple", "grape", "orange"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];

	public CheckBox() {
		super(new GridLayout(0, 4));
		
		for(int i = 0; i < 3; i++) { // 체크박스 생성
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i] + ".gif");
			icon[i] = new ImageIcon(fruits[i] + ".gif");
		}
		
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for(int i = 0; i < 3; i++) {
			checkPanel.add(buttons[i]);
			
			add(checkPanel);
			add(pictureLabel[0]);
			add(pictureLabel[1]);
			add(pictureLabel[2]);
		}
	}
	
	public void itemStateChanged(ItemEvent e) {
		ImageIcon image = null;
		
		Object source = e.getItemSelectable();
		for(int i = 0; i < 3; i++) {
			if (source == buttons[i]) {
				
				if(e.getStateChange() == ItemEvent.DESELECTED)
					pictureLabel[i].setIcon(null);
				else
					pictureLabel[i].setIcon(icon[i]);
			}
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBox CB = new CheckBox();
		CB.setOpaque(true);
		frame.add(CB);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}
}