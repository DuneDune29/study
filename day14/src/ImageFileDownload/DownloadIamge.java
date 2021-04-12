package ImageFileDownload;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadIamge {

	public static void main(String[] args) throws Exception{
		String website = "https://www.oracle.com/a/ocom/img/cb125v1-bgnw-careers-proud.jpg";
		System.out.println("" + website + "사이트에서 이미지를 다운로드합니다..");
		URL url = new URL(website);
		byte[] buffer = new	byte[2048];
		
		try (InputStream in = url.openStream();
			OutputStream out = new FileOutputStream("test.jpg");) {
			int length = 0;
			
			while ((length = in.read(buffer)) != -1) {
				System.out.println("" + length + "바이트만큼 읽었음!");
				out.write(buffer, 0, length);
			}
			
			in.close();
			out.close();
			
		} catch (Exception e) {
			System.out.println("예외: " + e.getMessage());
		}
	}
}