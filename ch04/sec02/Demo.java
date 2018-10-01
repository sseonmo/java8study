package ch04.sec02;


import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException {
//		Employee emp = new Employee("seonmo", 1111);
//		System.out.println(emp.toString());
//
//		List<String> list = Arrays.asList("1,2,3,4,5");
//		System.out.println(list);
//
//		int[] params = { 1,2,3,4,5,};
//		System.out.println(Arrays.toString(params));

		DiscountedItem disc = new DiscountedItem("seonmo", 20, 0);
		Item item  = new Item("seonmo", 20);
		DiscountedItem disc1  = new DiscountedItem("seonyoung", 20, 11);
//		System.out.println(disc.equals(disc));

		System.out.println(disc instanceof Item);
		System.out.println(item instanceof  DiscountedItem);

//		Class<?> cl = Class.forName("ch04.sec02.Employee");
//
//		for (Method m : cl.getDeclaredMethods()) {
//			System.out.printf("{%s} | {%s} | {%s} | {%s} | {%s}  \n ",
//					Modifier.toString(m.getModifiers())
//					, m.getReturnType()
//					, m.getReturnType().getCanonicalName()
//					, m.getName()
//					, Arrays.toString(m.getParameters()));
//		}


/*		try {
			Object cl2 = Class.forName("ch04.sec02.Employee");

			for (Field f : cl2.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				Object value = f.get(cl2);
				System.out.println(f.getName()+" : "+value);
//				System.out.println(f.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
//	System.out.println(cl.getname());




	}
}
