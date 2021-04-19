import java.util.Calendar;

public class Exam01 {
	public static void main(String[] args) {
		String months[] = { "1월", "2월", "3월", "4월", "5월", "6월",
				"7월", "8월", "9월", "10월", "11월", "12월" };
		String week[] = { "", "일요일", "월요일", "화요일", "수요일",
				"목요일", "금요일", "토요일" };
		Calendar calendar = Calendar.getInstance();
		System.out.print("날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR) + "년 " );
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(Calendar.DATE) + "일 ");
		System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)]);
		System.out.print("시간 : ");
		if (calendar.get(Calendar.AM_PM) == 0) System.out.print("오전 ");
		else System.out.print("오후 ");
		System.out.print(calendar.get(Calendar.HOUR) + "시 ");
		System.out.print(calendar.get(Calendar.MINUTE) + "분 ");
		System.out.println(calendar.get(Calendar.SECOND) + "초 ");
	}
}