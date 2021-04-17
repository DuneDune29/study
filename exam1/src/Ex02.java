class BoxId {
	long idNum;
	static long boxID = 0;
	public BoxId() {
		idNum = boxID++;
	}
}
public class Ex02 {
	public static void main(String[] args) {
		BoxId box1 = new BoxId();
		BoxId box2 = new BoxId();
		BoxId box3 = new BoxId();
		BoxId box4 = new BoxId();
		System.out.println("box1.idNum : " + box1.idNum);
		System.out.println("box2.idNum : " + box2.idNum);
		System.out.println("box3.idNum : " + box3.idNum);
		System.out.println("box4.idNum : " + box4.idNum);
	}
} 