import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex17 {
	public static void main(String[] args) {
		final Frame f = new Frame("CardLayoutTest");
		final CardLayout card = new CardLayout(10, 10);
		f.setLayout(card);
		Panel card1 = new Panel();
		card1.setBackground(Color.lightGray);
		card1.add(new Label("Card 1"));
		Panel card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("Card 2"));
		Panel card3 = new Panel();
		card3.setBackground(Color.cyan);
		card3.add(new Label("Card 3"));
		f.add(card1, "1"); // Frame�� card1�� "1"�̶�� �̸� �ٿ� �߰�
		f.add(card2, "2");		
		f.add(card3, "3"); 
		class Handler extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				// ���콺 ������ ��ư Ŭ��������
				if (e.getModifiers() == e.BUTTON3_MASK) {
					card.previous(f);
				} else {
					card.next(f);
				}
			}
		}
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());
		f.setSize(200, 200);		f.setLocation(200, 200);
		f.setVisible(true);
		card.show(f, "1"); // Frame�� �߰��� Component �� �̸��� "1"�� ���� ǥ��
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
}