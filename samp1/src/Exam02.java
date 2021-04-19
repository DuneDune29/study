import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
				cal.get(Calendar.DATE));
		Date day = cal.getTime();
		SimpleDateFormat sdf1, sdf2, sdf3;
		sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
	}
}