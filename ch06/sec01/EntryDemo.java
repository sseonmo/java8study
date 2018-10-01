package ch06.sec01;

import ch06.sec06.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EntryDemo {


	public static void main(String[] args) throws Exception {

		Entry<String, String> ent = new Entry<>("aaa", "bbb");

		System.out.println(ent.getKey());
		System.out.println(ent.getValue());

		ArrayList<String> list = Arrays.asList("aaa", "bbb", "ccc");
		Map<String, Integer> map = new HashMap<>();
		map.put("aaa", 10000);
		map.put("bbb", 20000);
		map.put("ccc", 30000);

		Entry<ArrayList<String>, Map<String, Integer>> ent1 = new Entry<>(list, map);

		System.out.println(ent1.getKey());
//		System.out.print(ent1.getValue2("aaa"));

//		list.forEach(item -> ent1.getValue2(item));

		for (String key : list) {
			System.out.println(ent1.getValue2(key));
		}


	}
}
