package Day7;

import java.util.ArrayList;

public class AnimalTest2 {

	ArrayList<Animal1>aniList = new ArrayList<Animal1>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal1();
		System.out.println("원래 타입으로 다운 캐스팅");
		aTest.testCasting();

	}

	public void addAnimal1() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal1 ani : aniList) {
			ani.move();
		}
	}
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) { // ArrayList에 추가되면서 Animal형으로
			
			Animal1 ani = aniList.get(i); // 일단 Animal 형으로
			if(ani instanceof Human) { // Human이면
				Human h = (Human)ani;  // Human형으로 다운 캐스팅
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
}
