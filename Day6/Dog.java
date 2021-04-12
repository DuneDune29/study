package Day6;

public class Dog extends Animal1 {
	int a;
	
	//@Override
	public void eat(int amount){
	//public void eat() {
		a=amount;
		
		//int a = amount;
		System.out.println("강아지가"+a+" 먹고 있습니다.");
		//System.out.println("강아지가 먹고 있습니다.");
	}
};