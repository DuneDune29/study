package Animal;

public class Cat extends Animal {
	public static void eat() {
		System.out.println("Cat�� ���� �޼ҵ� eat()");
	}

	public void sound() {
		System.out.println("Cat�� �ν��Ͻ� �޼ҵ� sound()");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat(); // myCat�� Cat�� ��ü
		Animal myAnimal = myCat;
		Animal.eat(); // �����޼ҵ� eat���
		myAnimal.eat();
		myCat.eat();
		myAnimal.sound();
	}
}