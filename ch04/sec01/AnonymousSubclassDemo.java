package ch04.sec01;

import java.util.ArrayList;
import java.util.Arrays;

public class AnonymousSubclassDemo {
	public static void main(String[] args) {
		//디버깅 용으로 괜찮아 보임..
		ArrayList<String> names = new ArrayList<String>(100) {
			public void add(int index, String element) {
				super.add(index, element);
				System.out.printf("Adding %s at %d\n", element, index);
			}
		};

		names.add(0, "Peter");
		names.add(1, "Paul");
		names.add(0, "Mary");
		System.out.println(names);

		// List 초기값 지정할때 괜찮아보임.
		invite(new ArrayList<String>() {{
			add("Harry");
			add("Sally");
		}});

		invite(new ArrayList<String>(Arrays.asList("Harry", "Sally")));
	}

	public static void invite(ArrayList<String> friends) {
		System.out.println("Guest list: " + friends);
	}
}
