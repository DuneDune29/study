package slider;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame implements ChangeListener {
	static final int INIT_VALUE = 15;
	private JButton buttonOK;
	private JSlider slider;
	private JButton button;

	public SliderFrame() {
		JPanel panel;

		setTitle("슬라이더 테스트"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여보세요", JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(label);

		slider = new JSlider(0, 30, INIT_VALUE);
		slider.setMajorTickSpacing(10); // 큰 눈금 간격
		slider.setMinorTickSpacing(1); // 작은 눈금 간격
		slider.setPaintTicks(true); // 눈금 표시
		slider.setPaintLabels(true); // 값을 레이블로 표시
		slider.addChangeListener(this); // 이벤트 리스너를 붙임
		panel.add(slider);

		button = new JButton("");
		ImageIcon icon = new ImageIcon("dog.gif");
		button.setIcon(icon);
		button.setSize(INIT_VALUE * 10, INIT_VALUE * 10);
		panel.add(button);
		add(panel);

		setSize(400, 400);
		setVisible(true);
	}

	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();
		if (!source.getValueIsAdjusting()) {
			// 앞에 ! 붙이면 조절하면서 따라 바뀜
			// ! 안붙이면 조절이끝나고 바뀜
			int value = (int) source.getValue();
			button.setSize(value * 10, value * 10);
		}
	}

	public static void main(String[] args) {
		new SliderFrame();
	}
}