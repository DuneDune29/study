package Day7;

public class Car2 {
	private String model;

	public Car2(String model) {
		this.model = model;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Car2)
			return model.equals(((Car2) obj).model);
		else
			return false;
	}
}