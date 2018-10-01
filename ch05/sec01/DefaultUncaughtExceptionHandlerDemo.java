package ch05.sec01;

import java.util.Objects;

public class DefaultUncaughtExceptionHandlerDemo {
	public static void main(String[] args) {
	/*	Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
			System.err.println(ex.getMessage());
			System.err.println("Goodbye, cruel world!");
		});
		System.out.println(1 / 0);*/
		String aa = null;
		Objects.requireNonNull(aa, "널이여!!");
	}
}
