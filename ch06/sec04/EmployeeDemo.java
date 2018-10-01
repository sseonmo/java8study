package ch06.sec04;


import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args ) {

		Employee emp = new Employee("AAA", 1000);
		Employee emp1 = new Employee("BBB", 2000);
		Employee[] empArray = new Employee[2];
		empArray[0] = emp;
		empArray[1] = emp1;

		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(emp);
		emplist.add(emp1);
		Employees.printNames(emplist);

//		Employees.printAll(empArray, e -> e.getSalary() > 900);
		Employees.printAll2(empArray, e -> e.getSalary() > 1000);

		System.out.println(Lists.hasNulls(java.util.Arrays.asList("aaaa","bbb")));



	}
}
