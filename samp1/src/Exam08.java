import java.util.ArrayList;

public class Exam08 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("���");			list.add("����");
		list.add("��");			list.add("����");
		list.add("ü��");
		prn(list);
		System.out.println(">> �ε��� 2�� ��ġ�� Ű�� ���� <<");
		list.add(2, "Ű��");
		prn(list);
		System.out.println(">> �ε��� 4�� ��ġ�� �����͸� ������ ���� <<");
		list.set(4, "����");
		prn(list);
		System.out.println(">> �ε��� 1�� ��ġ�� �����͸� ���� <<");
		list.remove(1);
		prn(list);
		System.out.println(">> ��� �����͸� ã�Ƽ� ���� <<");
		list.remove("���");
		prn(list);
	}
	static void prn(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + "\t");
		System.out.println("\n");
	}
}