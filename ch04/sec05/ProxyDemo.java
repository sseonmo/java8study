package ch04.sec05;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class ProxyDemo {
	public static void main(String[] args) {
		Object[] values = new Object[1000];

//		System.out.println(values.length);
		for (int i = 0; i < values.length; i++) {
			Object value = new Integer(i);

			values[i] = Proxy.newProxyInstance(
					null
					, value.getClass().getInterfaces()
					, (Object proxy, Method m, Object[] margs) -> {
//						System.out.println(value + "." + m.getName() + Arrays.toString(margs));

						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("value : "+value);
						System.out.println("m.getName() : "+m.getName());
						System.out.println("Arrays.toString(margs): "+Arrays.toString(margs));
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

						return m.invoke(value, margs);
					});

		}

		int position = Arrays.binarySearch(values, new Integer(500));//
		System.out.println("position : "+ position);
//		System.out.println(values[position]);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		Date now = Calendar.getInstance().getTime();

		System.out.println(sdf.format(now));
	}
}
