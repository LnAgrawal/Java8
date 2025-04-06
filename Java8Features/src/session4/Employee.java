package session4;

public class Employee {
	int eno;
	String name;
	public Employee(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Id: " +this.eno+ " Name: "+this.name;
	}
}
