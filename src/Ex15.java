interface Color {
	int RED = 1; // public static final �����Ȱ��̹Ƿ� ���
	int GREEN = 2;
	int BLUE = 3;
	void setColor(int c); // public abstract ������ ���̹Ƿ� �߻�޼���
	int getColor();
}
class Triangle implements Color {
	int color = 0;
	public int getColor() { // �ݵ�� ������
		return color;
	}
	public void setColor(int c) { // �ݵ�� ������
		color = c;
	}
}
public class Ex15 {
	public static void main(String[] args) {
		Triangle ref = new Triangle();
		ref.setColor(Color.RED);
		switch (ref.getColor()) {
		case 1: System.out.print("  ������");	break;
		case 2: System.out.print("  �ʷϻ�");	break;
		case 3: System.out.print("  �Ķ���");	break;
		}
		System.out.println(" �ﰢ���̴�.");
	}
}