import java.io.File;

public class Ex04 {
	public static void main(String[] args) {
		try {
			boolean result = new File("D:/jwork/samp3/temp").mkdir();
			String[] listing = new File("D:/jwork/samp3").list();
			
			for (String x : listing) {
				System.out.println("폴더 내용 : " + x);
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
}