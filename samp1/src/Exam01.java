import java.util.Calendar;

public class Exam01 {
	public static void main(String[] args) {
		String months[] = { "1��", "2��", "3��", "4��", "5��", "6��",
				"7��", "8��", "9��", "10��", "11��", "12��" };
		String week[] = { "", "�Ͽ���", "������", "ȭ����", "������",
				"�����", "�ݿ���", "�����" };
		Calendar calendar = Calendar.getInstance();
		System.out.print("��¥ : ");
		System.out.print(calendar.get(Calendar.YEAR) + "�� " );
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(Calendar.DATE) + "�� ");
		System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)]);
		System.out.print("�ð� : ");
		if (calendar.get(Calendar.AM_PM) == 0) System.out.print("���� ");
		else System.out.print("���� ");
		System.out.print(calendar.get(Calendar.HOUR) + "�� ");
		System.out.print(calendar.get(Calendar.MINUTE) + "�� ");
		System.out.println(calendar.get(Calendar.SECOND) + "�� ");
	}
}