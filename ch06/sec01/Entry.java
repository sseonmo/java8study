package ch06.sec01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Entry<K, V> {
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public Object getValue2(String key1) throws Exception{

		Class<?> cls = Class.forName(value.getClass().getName());

		Field[] fields = cls.getFields();
		for( Field field : fields ){
			System.out.println(field.getType().getName()+" "+field.getName());
		}
		for(Method met : cls.getMethods()){
			if ("get".equals(met.getName()) ) {
				return met.invoke(value, key1);
			}
		}
		return null;
	}
}
