package Day6;

public class Box {
	int width, length, height; // 가로 세로 높이 변수 선언
	int volume; // 볼륨 변수 선언

	Box(int w, int l, int h) { // 가로 세로 높이 변수를 이용하여 함수선언
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}

	Box whosLargest(Box box1, Box box2) {
		if (box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}

	boolean isSameBox(Box obj) {// isSameBox 메서드 추가
		if ((obj.width == width) && (obj.length == length) && (obj.height == height))
			return true;
		else
			return false;
	}
	
}
