package ch04.sec04;

public class ClassDemo {
	public static void main(String[] args) throws ReflectiveOperationException {
		Object obj = System.out;
		Class<?> cl = obj.getClass();
		System.out.println("This object is an instance of " + cl.getName());
		System.out.println("This object is an instance of " + System.out.getClass().getSimpleName());

		String className = "java.util.Scanner";
		cl = Class.forName(className);
		System.out.println(cl.getName());

		// An object describing the java.util.Scanner class
		cl = java.util.Scanner.class;
		System.out.println(cl.getName());

		Class<?> cl2 = String[].class; // Describes the array type String[]
		System.out.println(cl2.getName());
		System.out.println(cl2.getCanonicalName());

		Class<?> cl3 = Runnable.class; // Describes the Runnable interface
		System.out.println(cl3.getName());

		Class<?> cl4 = int.class; // Describes the int type
		System.out.println(cl4.getName());

		Class<?> cl5 = void.class; // Describes the void type
		System.out.println(cl5.getName());

	}
}
