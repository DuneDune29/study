import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException{
		File f = new File("D:/jwork/samp3/Ex01.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("��θ� ������ �����̸� - " + f.getName());
		System.out.println("Ȯ���ڸ� ������ �����̸� - " + fileName.substring(0, pos));
		System.out.println("Ȯ���� - " + fileName.substring(pos + 1));
		System.out.println("��θ� ������ �����̸� - " + f.getPath());
		System.out.println("������ ������         - " + f.getAbsolutePath());
		System.out.println("������ ���� �ִ� ���丮 - " + f.getParent());
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println("user.dir=" + System.getProperty("user.dir"));
	}
}