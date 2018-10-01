package ch04.sec05;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class MethodPrinter {
	public static void main(String[] args) throws ReflectiveOperationException {
//		System.out.print("Class name: ");
//		Scanner in = new Scanner(System.in);
//
//		String className = in.nextLine();
//		Class<?> cl = Class.forName(className);
		Class<?> cl = Class.forName("ch04.sec02.Employee");


		while (cl != null) {
			for (Method m : cl.getDeclaredMethods()) {
//				System.out.println(
//						Modifier.toString(m.getModifiers()) + " @" +
//								m.getReturnType().getCanonicalName() + "@" +
//								m.getName()  + "@" +
//								Arrays.toString(m.getParameters()));

				System.out.println(m.getModifiers());
				System.out.println(m.getReturnType().getCanonicalName());
				System.out.println(m.getName());
				System.out.println(Arrays.toString(m.getParameters()));
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			}
			cl = cl.getSuperclass();
		}

//		System.out.println(Arrays.toString(Class.forName("ch04.sec02.Employee").getDeclaredMethods()));
	}
}
