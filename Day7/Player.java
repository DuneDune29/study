package Day7;

public class Player {

	private PlayerLevel level; // Player가 가지는 level 변수 선언

	public Player() { // 디폴트 생성자
		level = new BeginnerLevel(); // 처음생성되면 BeginnerLevel로 시작하며
		level.showLevelMessage(); // 레벨 메시지 출력
	}

	public PlayerLevel getLevel() { // level을 가져온다

		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count); // PlayerLevel의 템플릿 메소드go() 호출
	}
}