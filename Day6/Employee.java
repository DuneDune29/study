package Day6;

public class Employee {
	private String name;
	private double salary;
	
	private int em;
	private static int count = 0; // 정적변수
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		em = ++count;
	}
	
	public static int getCount () {
		return count;
	}
	

}
