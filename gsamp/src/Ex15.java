import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex15 {
	public static void main(String[] args) {
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(200, 200);
		f.setLayout(new FlowLayout((FlowLayout.LEFT))); // 3��2���� �׸���
		f.add(new Button("1 ��°"));	
		f.add(new Button("2 ��°"));	
		f.add(new Button("3 ��°"));	
		f.add(new Button("4 ��°"));	
		f.add(new Button("5 ��°"));	
		f.add(new Button("6 ��°"));	
		f.add(new Button("7 ��°"));	
		f.add(new Button("8 ��°"));	
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