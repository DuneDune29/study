package StaticMethodTest2;
interface Employable{
	
	// String getName();
	
	static boolean isEmpty(String str) {
		if(str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	static void print(String msg) {
		System.out.println(msg + "�Դϴ�.");
	}
}
class Employee implements Employable{
	private String name;
	
	public Employee(String name) {
		if(Employable.isEmpty(name)==true) {
			throw new RuntimeException("�̸��� �ݵ�� �Է��Ͽ��� ��!");
		}
		this.name = name;
	}
		public String getName() {
			return name;
	}
		public void setName(String name) {
		this.name = name;
	}
	//@Override
	//public String getName() {
	//return this.name;
	//}
}
public class StaticMethodTest2 {
	public static void main(String[] args) {
		Employable employee1 = new Employee("ȫ�浿");
		Employee employee2 = new Employee("�̼���");
		//Employable employee2 = new Employee("");
		//Employable.print(Employee.name);
		//Employable.print(Employee.getName());
		Employable.print("ȫ�浿");
		String name=employee2.getName();
		System.out.println(name + "�Դϴ�.");
	}
}