package ch04.sec03;

public class EnumDemo {
	public static void main(String[] args) {
		Size notMySize = Size.valueOf("SMALL");
		System.out.println(notMySize);

		System.out.println(Size.MEDIUM.getAbbreviation());

		for (Size s : Size.values()) {
			System.out.println(s);
		}

		System.out.println(Size.MEDIUM.ordinal());

		System.out.println(Size.valueOf("MEDIUM").name());

		int x = 10, y = 20;
		for(Operation op : Operation.values()){

			System.out.println("enum name : "+op.name()+" / value : "+op.eval(x, y));
		}

	}
}
