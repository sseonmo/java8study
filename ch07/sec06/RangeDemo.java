package ch07.sec06;

import java.util.*;

import ch06.sec06.Arrays;

import static java.util.Collections.singletonMap;

public class RangeDemo {
	public static void main(String[] args) {
		/*List<String> sentence = Arrays.asList("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal, Panama!".split("[ ,]+"));
		System.out.println(sentence);
		List<String> nextFive = sentence.subList(5, 10);
		System.out.println(sentence.get(0));
		System.out.println(nextFive);

		TreeSet<String> words = new TreeSet<>(sentence);
		words.add("zebra");
		System.out.println(words);
		SortedSet<String> ysOnly = words.subSet("y", "z");
		System.out.println(ysOnly);

		SortedSet<String> nAndBeyond = words.tailSet("p");
		System.out.println(nAndBeyond);
*/
		Map<String, String> singletonMap = Collections.singletonMap("AA", "bb");
		System.out.println(singletonMap);
//		singletonMap.put("BB", "cc");
//		System.out.println(singletonMap);

		Map<String, String> emptyMap = Collections.emptyMap();
		emptyMap.put("AA", "bb");
		System.out.println(emptyMap);
	}
}
