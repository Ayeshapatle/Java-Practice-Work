package SortingTask;

public class Employee implements Comparable<Employee> {

	private int emid;
	private String emname;
	private double salary;

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEmname() {
		return emname;
	}

	public void setEmname(String emname) {
		this.emname = emname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {

		return this.emid-e.emid;
		//return this.emname.compareTo(e.emname);
		//return (int) (this.salary - e.salary);
	}

}
