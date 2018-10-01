package ch04.sec03;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ModifierDemo {
	public static void main(String[] args) {

		for (Modifier m : Modifier.values()) {
			System.out.println(m.name()+" | "+m.getMask());
		}


		Modifier pub = Modifier.valueOf("PUBLIC");
		System.out.println(pub.getMask());


		Modifier pub1 = Modifier.valueOf("PUBLIC");
		System.out.println(pub1.getMask());

		Modifier pub2 = Modifier.PRIVATE;
		System.out.println(pub2.getMask());

		/*

		for(EnumDemo2 ed2 : EnumDemo2.values()) {
			System.out.println(ed2.getCost()+"|"+ed2.getFill());
			System.out.println("cost : "+ed2.eval(30));

			if (ed2.getCost().equals("FREE")) {
				System.out.println("싸구만 ㅋㅋㅋ");
			}

		}

		Class<?> cl = EnumDemo2.class;

		System.out.println(cl.getName());
		System.out.println(cl.getCanonicalName());
		System.out.println(cl.toGenericString());
		System.out.println(cl.getSuperclass().getName());
		System.out.println(cl.isEnum());
		System.out.println(cl.isArray());
		System.out.println(cl.isMemberClass());
		System.out.println(cl.isAnnotation());
		System.out.println(cl.getModifiers());

		System.out.println(" "+ Arrays.toString(cl.getFields()));
		System.out.println(" size "+cl.getFields().length);

		System.out.println(" "+ Arrays.toString(cl.getMethods()));
		System.out.println(" Method "+cl.getMethods().length);

		for (Method meth : cl.getMethods()) {
			System.out.println("method : "+meth.getName());
		}

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		System.out.println(" "+ Arrays.toString(cl.getDeclaredFields()));
		System.out.println(" field "+cl.getDeclaredMethods().length);

		for (Field meth : cl.getDeclaredFields()) {
			System.out.println("field: "+meth.getName());
		}


		System.out.println(" "+ Arrays.toString(cl.getDeclaredMethods()));
		System.out.println(" Method "+cl.getDeclaredMethods().length);

		for (Method meth : cl.getDeclaredMethods()) {
			System.out.println("method : "+meth.getName());
		}


		System.out.println(" "+ Arrays.toString(cl.getDeclaredConstructors()));
		System.out.println(" Constructor "+cl.getDeclaredConstructors().length);

		Arrays.stream(cl.getDeclaredConstructors()).forEach(System.out::println);*/
	}
}
