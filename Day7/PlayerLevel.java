package Day7;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) { // 재정의되면 안되므로 final로 선언
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}