package Day6;

public class Employee1 {
	public String name; // �̸�: public ���
	String address; // �ּ�: package ���
	protected int salary; // ����: protected ���
	private int rrn; // �ֹε�Ϲ�ȣ: private ���

	public Employee1(String name, String address, int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}