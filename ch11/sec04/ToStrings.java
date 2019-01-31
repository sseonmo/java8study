package ch11.sec04;

import java.lang.reflect.Field;

public class ToStrings {

	public static String toString(Object obj) {
		System.out.println("1");
		if (obj == null) return "null";
		System.out.println("2");
		Class<?> cl = obj.getClass();
		System.out.println("3");
		ToString ts = cl.getAnnotation(ToString.class);
		System.out.println("4");
		if (ts == null) return obj.toString();
		System.out.println("5");
		StringBuilder result = new StringBuilder();
		if (ts.includeName()) result.append(cl.getName());
		result.append("[");
		boolean first = true;
		for (Field f : cl.getDeclaredFields()) {
			ts = f.getAnnotation(ToString.class);
			if (ts != null) {
				if (first) first = false;
				else result.append(",");
				f.setAccessible(true);
				if (ts.includeName()) {
					result.append(f.getName());
					result.append("=");
				}
				try {
					System.out.println("@@@@@@");
					System.out.println( f.get(obj));
					System.out.println( f.getName());
					result.append(ToStrings.toString(f.get(obj)));
					System.out.println(result.toString());
					System.out.println("@@@@@@");
				} catch (ReflectiveOperationException ex) {
					ex.printStackTrace();
				}
			}
		}
		result.append("]");
		return result.toString();
	}
}