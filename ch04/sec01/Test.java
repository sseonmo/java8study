package ch04.sec01;


import com.sun.xml.internal.ws.util.StringUtils;

import java.time.LocalTime;
import java.util.Objects;

public class Test {

	public static void main(String[] args) {
		Employee empl = new Manager("seonmo", 10000000);
		((Manager) empl).setBonus(10);

		System.out.println(empl.getClass().getSimpleName());
		System.out.println(empl.getClass().getName());
		System.out.println(empl.getClass().getCanonicalName());
		System.out.println(empl.getClass().getTypeName());

		System.out.println((int)empl.getSalary());

//		((Manager)empl).setBonus(123);

	}
}
