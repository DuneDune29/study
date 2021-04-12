package Day6;

public class Company {

	private static Company instance = new Company();

	private Company() { // 보통 public 으로 생성하는데 private으로 생성함. 외부에서 사용불가능. 
	}

	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}