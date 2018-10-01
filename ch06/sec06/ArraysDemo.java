package ch06.sec06;

public class ArraysDemo {

	public static void main(String[] args) throws Exception {

		String[] aa = Arrays.repeat(10, "Hi", String[]::new );
		System.out.println(java.util.Arrays.toString(aa));

		int[] bb = Arrays.repeat(10, 11, int[]::new);
		System.out.println(java.util.Arrays.toString(bb));

		System.out.println(Arrays.repeat(10, e -> String.valueOf(e*10)));


	}
}
