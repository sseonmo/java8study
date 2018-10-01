package ch04.sec03;

import java.util.Random;

public enum EnumDemo2 {

	ORACLE("비싸다", "UP"){
		public int eval(int i) {
			return i * 100 * (new Random()).nextInt(100);
		}
	}
	, MYSQL("FREE", "DOWN"){
		public int eval(int i) {
			return i * 100 * (new Random()).nextInt(10);
		}
	}
	, NOSQL("FREE", "GOOD"){
		public int eval(int i) {
			return i * 100 * (new Random()).nextInt(10);
		}
	}
	;

	String cost, fill;

	EnumDemo2(String cs, String fi) {
		this.cost = cs;
		this.fill = fi;
	}


	public String getCost() {
		return cost;
	}

	public String getFill() {
		return fill;
	}

	public abstract int eval(int i);
}
