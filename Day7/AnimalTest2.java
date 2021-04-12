package Day7;

import java.util.ArrayList;

public class AnimalTest2 {

	ArrayList<Animal1>aniList = new ArrayList<Animal1>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal1();
		System.out.println("���� Ÿ������ �ٿ� ĳ����");
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
		for(int i=0; i<aniList.size(); i++) { // ArrayList�� �߰��Ǹ鼭 Animal������
			
			Animal1 ani = aniList.get(i); // �ϴ� Animal ������
			if(ani instanceof Human) { // Human�̸�
				Human h = (Human)ani;  // Human������ �ٿ� ĳ����
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
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			}
		}
	}
}
