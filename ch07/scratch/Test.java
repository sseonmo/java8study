package ch07.scratch;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String, Integer> h = new HashMap<>();
		h.put("a", null);
		System.out.println(h.keySet());
		h.compute("a", (k, v) -> v+123);
		System.out.println(h.keySet());
		System.out.println(h.get("a"));

	}
}
