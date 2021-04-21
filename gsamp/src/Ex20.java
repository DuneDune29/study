
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex20 extends Frame {
	TextField tf = new TextField();
	TextArea ta = new TextArea();
	Ex20(String title){
		super(title);
		tf = new TextField();		ta = new TextArea();
		add(tf, "South");			add(ta, "Center");	
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TextField���� ������ �Է��ϰ� Enter ������
				// �Էµ� text�� TextArea�� �߰�
				ta.append(tf.getText() + "\n");
				tf.setText("");
				tf.requestFocus();
			}
		});
		ta.setEditable(false);
		setSize(300, 200); 		setVisible(true);
		tf.requestFocus(); // focus�� TextField�� ��ġ�ϵ��� ����
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { System.exit(0); }
			});
		}
	public static void main(String[] args) {
		Ex20 exWin = new Ex20("TextComponentEvent");
	}
}