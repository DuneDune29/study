import java.io.FileReader;

public class ReadDemo1 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/WriteDemo1.java");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}
}