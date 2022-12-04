package SortingTask;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Set<Employee> s = new TreeSet<>();

		Employee e1 = new Employee();
		e1.setEmid(22);
		e1.setEmname("Ankit");
		e1.setSalary(1000.00);

		Employee e2 = new Employee();
		e2.setEmid(24);
		e2.setEmname("Sheela");
		e2.setSalary(7000.00);

		Employee e3 = new Employee();
		e3.setEmid(23);
		e3.setEmname("Bunty");
		e3.setSalary(8000.00);

		s.add(e1);
		s.add(e2);
		s.add(e3);

		for (Employee emp : s) {
			System.out.println(emp.getEmid());
			System.out.println(emp.getEmname());
			System.out.println(emp.getSalary());

		}

	}

}
