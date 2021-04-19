import java.io.FileWriter;

public class WriteDemo1 {
	public static void main(String[] args) throws Exception {
		String source = "비어있어야 비로서 가득해 지는 사랑\n"
				+ " 영원히 사랑한다는 것은\n"
				+ " 평온한 마음으로 아침을 맞는다는 것입니다.\n";
		char intxt[] = new char[source.length()];
		source.getChars(0, source.length(), intxt, 0);
		// 입력 문자열을 intxt 문자 배열에 저장
		FileWriter fw = new FileWriter("data1.txt");
		fw.write(intxt);
		// 문자 배열의 내용을 파일에 출력
		fw.close();
	}
}