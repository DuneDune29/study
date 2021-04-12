package pizza;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {

	private int sum, temp1, temp2, temp3;
	private JButton order_button, cancle_button;
	private JPanel down_panel;
	private JTextField text;

	WelcomePanel WelcomePanel = new WelcomePanel();
	TypePanel TypePanel = new TypePanel();
	ToppingPanel ToppingPanel = new ToppingPanel();
	SizePanel SizePanel = new SizePanel();

	public MyFrame() {

		this.setTitle("���� �ֹ�"); // ������ ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 200); // �����ӻ�����

		this.order_button = new JButton("�ֹ�"); // �ֹ� ��ư ����
		this.order_button.addActionListener(this);// �̺�Ʈ ó�� ���
		this.cancle_button = new JButton("���"); // ��ҹ�ư ����
		this.cancle_button.addActionListener(this); // �̺�Ʈ ó�� ���

		this.text = new JTextField(); // �ؽ�Ʈ �ʵ� ����
		text.setEditable(false); // ���� �Ұ�
		text.setColumns(6); // ���� 6ĭ

		down_panel = new JPanel(); // �г� ����
		down_panel.add(this.order_button); // �ֹ� ��ư ��� ��ư �߰�
		down_panel.add(this.cancle_button);
		down_panel.add(this.text); // �ؽ�Ʈ �ʵ� �߰�

		this.setLayout(new BorderLayout()); // ������ ��ġ������ ����

		this.add(WelcomePanel, BorderLayout.NORTH); // ���� �г� ��
		this.add(down_panel, BorderLayout.SOUTH); // ��ư �г� ��
		this.add(SizePanel, BorderLayout.EAST); // ������ �г� ��
		this.add(TypePanel, BorderLayout.WEST); // Ÿ�� �г� ��
		this.add(ToppingPanel, BorderLayout.CENTER); // ���� �г� �߾�

		this.setVisible(true); // ������ ȭ�� ǥ��
	}

	public void actionPerformed(ActionEvent e) { // �׼��̺�Ʈ ó��
		if (e.getSource() == this.order_button) { // �׼Ǽҽ� ���� '�ֹ� ��ư��
			this.text.setText("" + 20000); // �ؽ�Ʈ ���
		}
		if (e.getSource() == this.cancle_button) { // �׼Ǽҽ��� ��� ��ư�� ���
			sum = 0;
			this.text.setText("" + sum); // ���� �ʱ�ȭ �� �ʱⰪ ���
		}
	}

	class WelcomePanel extends JPanel { // ���� �г� Ŭ���� ���� JPanel ���
		private JLabel message; // �޼��� �� ���� ����

		public WelcomePanel() { // ������
			message = new JLabel("������ڿ� ���Ű��� ȯ���մϴ�.");
			add(message); // ���� ������ ��ü�� �߰�

		}
	}

	class TypePanel extends JPanel { // Ÿ�� �г� ���� JPanel ���
		private JRadioButton combo, potato, bulgogi; // ���� ��ư ����
		private ButtonGroup bg; // ��ư �׷� ����

		public TypePanel() { // ������
			setLayout(new GridLayout(3, 1)); // ��ġ ������ ����

			combo = new JRadioButton("�޺�", true); // ���� ��ư ����
			potato = new JRadioButton("��������");
			bulgogi = new JRadioButton("�Ұ��");

			bg = new ButtonGroup(); // ��ư �׷� ������ ����
			bg.add(combo);
			bg.add(potato);
			bg.add(bulgogi);

			setBorder(BorderFactory.createTitledBorder("����")); // ��ư �׷� ����

			add(combo); // ��ü�� ���� ��ư �߰�
			add(potato);
			add(bulgogi);
		}
	}

	class ToppingPanel extends JPanel { // ���� �г� ���� JPanel ���
		private JRadioButton fineapple, cheese, peperoni, bacon; // ���� ��ư ��������
		private ButtonGroup bg; // ��ư �׷� ��������

		public ToppingPanel() { // ������
			setLayout(new GridLayout(4, 1)); // ��ġ ������ �Ϸ�

			fineapple = new JRadioButton("���ξ���", true); // ���� ��ư ����
			cheese = new JRadioButton("ġ��");
			peperoni = new JRadioButton("���۷δ�");
			bacon = new JRadioButton("������");

			bg = new ButtonGroup(); // ��ư �׷� ������ ����
			bg.add(fineapple);
			bg.add(cheese);
			bg.add(peperoni);
			bg.add(bacon);
			// ��ư�׷� ����

			setBorder(BorderFactory.createTitledBorder("�߰�����")); // ��ư �׷� ����

			add(fineapple); // ��ü�� ���� ��ư �߰�
			add(cheese);
			add(peperoni);
			add(bacon);
		}
	}

	class SizePanel extends JPanel { // ������ �г� ���� JPanel ���
		private JRadioButton small, medium, large; // ���� ��ư ��������
		private ButtonGroup bg; // ��ư �׷� ��������

		public SizePanel() { // ������
			setLayout(new GridLayout(3, 1)); // ��ġ ������ �Ϸ�

			small = new JRadioButton("small", true); // ���� ��ư ����
			medium = new JRadioButton("medium");
			large = new JRadioButton("large");

			bg = new ButtonGroup(); // ��ư �׷� ������ ����
			bg.add(small);
			bg.add(medium);
			bg.add(large);
			// ��ư�׷� ����

			setBorder(BorderFactory.createTitledBorder("ũ��")); // ��ư �׷� ����

			add(small); // ��ü�� ���� ��ư �߰�
			add(medium);
			add(large);
		}
	}
}

public class PizzaTest { // ����̹� Ŭ����
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}