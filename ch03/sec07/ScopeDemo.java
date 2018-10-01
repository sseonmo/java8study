package ch03.sec07;

import ch06.sec06.Arrays;

import java.util.List;

public class ScopeDemo {
	public static void main(String[] args) {
		repeatMessage("Hello", 10);

		List<String> arrayList = Arrays.asList("A", "B", "C");


		for (String a : arrayList)
			new Thread(() -> System.out.println(a)).start();
	}


	public static void repeatMessage(String text, int count) {
		Runnable r = () -> {
			for (int i = 0; i < count; i++) {
				System.out.println(text);
			}
		};
		new Thread(r).start();
	}
}
