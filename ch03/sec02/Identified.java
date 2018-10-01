package ch03.sec02;

public interface Identified {
	default int getId() {
		return Math.abs(hashCode());
	}

	default int getId2() {
		return Math.abs(hashCode());
	}
}