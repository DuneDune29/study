package Animal;

public class Cat extends Animal {
	public static void eat() {
		System.out.println("Cat의 정적 메소드 eat()");
	}

	public void sound() {
		System.out.println("Cat의 인스턴스 메소드 sound()");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat(); // myCat은 Cat의 객체
		Animal myAnimal = myCat;
		Animal.eat(); // 정적메소드 eat사용
		myAnimal.eat();
		myCat.eat();
		myAnimal.sound();
	}
}