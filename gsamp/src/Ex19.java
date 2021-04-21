import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex19 extends Frame {
	CheckboxGroup group;
	Checkbox cb1, cb2, cb3;
	Ex19(String title) {
		super(title);
		group = new CheckboxGroup();
		cb1 = new Checkbox("red", group, true);
		cb2 = new Checkbox("green", group, false);
		cb3 = new Checkbox("blue", group, false);
		cb1.addItemListener(new EventHandler27());
		cb2.addItemListener(new EventHandler27());
		cb3.addItemListener(new EventHandler27());
		setLayout(new FlowLayout());
		add(cb1);		add(cb2);		add(cb3);
		setBackground(Color.red);		setSize(300, 200);		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { System.exit(0); }
		});
	}
	public static void main(String[] args) { Ex19 exWin = new Ex19("CheckboxEvent"); }
	class EventHandler27 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox) e.getSource();
			String color = cb.getLabel();
			if (color.equals("red"))				setBackground(Color.red);
			else if (color.equals("green"))			setBackground(Color.green);
			else	setBackground(Color.blue);
		}
	}
}