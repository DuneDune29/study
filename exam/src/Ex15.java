public class Ex15 {
	public static void main(String[] args) {
		String str = new String("해피");
		System.out.println(str);
		String str1 = str.concat("썬데이"); // 문자열 연결(결합)
		System.out.println(str1);
		str1 = str1.replace("썬데이", "바이러스");
		System.out.println(str1);
		str1 = "  " + str1 + "   "; // 앞에 2개, 뒤에 3개의 공백 추가
		System.out.println("공백 추가된 str1의 길이 : " + str1.length());
		str1 = str1.trim();
		System.out.println("공백 제거된 str1의 길이 : " + str1.length());
		int len = (str1.length() + 1) * 2;
		System.out.println(str1 + "의 메모리 용량 : " + len + "Bytes");
		char ch = str1.charAt(2); // 특정 위치에 있는 문자
		System.out.println(str1 + "의 charAt(2) : " + ch);
		String str2 = str1.substring(3);
		System.out.println(str1 + "의 substring(3) : " + str2);
		String str3 = str1.substring(2, 4);
		System.out.println(str1 + "의 substring(2, 4) : " + str3);
	}

}
