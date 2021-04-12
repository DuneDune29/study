package Day7;

public class Player {

	private PlayerLevel level; // Player�� ������ level ���� ����

	public Player() { // ����Ʈ ������
		level = new BeginnerLevel(); // ó�������Ǹ� BeginnerLevel�� �����ϸ�
		level.showLevelMessage(); // ���� �޽��� ���
	}

	public PlayerLevel getLevel() { // level�� �����´�

		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count); // PlayerLevel�� ���ø� �޼ҵ�go() ȣ��
	}
}