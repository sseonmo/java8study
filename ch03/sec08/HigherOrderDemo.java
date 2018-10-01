package ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

public class HigherOrderDemo {
	public static Comparator<String> compareInDirecton(int direction) {
		return (x, y) -> {
			System.out.printf("[%s] | [%s] ::: value : [%d] \n", x, y, direction * x.compareToIgnoreCase(y));
			return direction * x.compareToIgnoreCase(y);
		};
	}

	public static Comparator<String> reverse(Comparator<String> comp) {
		return (x, y) -> {
			System.out.printf("[%s] | [%s] ::: value : [%d] \n", x, y, -comp.compare(x, y));
			return -comp.compare(x, y);
		} ;
	}

	public static void main(String[] args) {
		String[] words = {"Mary", "had", "a", "little", "lamb"};

		Arrays.sort(words, compareInDirecton(-1));
		System.out.println(Arrays.toString(words));
		System.out.printf("\n\n");

		Arrays.sort(words, reverse(String::compareToIgnoreCase));
		System.out.println(Arrays.toString(words));
		System.out.printf("\n\n");

		Arrays.sort(words, Comparator.reverseOrder());
		System.out.println(Arrays.toString(words));
	}
}
