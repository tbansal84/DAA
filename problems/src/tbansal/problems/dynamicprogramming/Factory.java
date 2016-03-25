package tbansal.problems.dynamicprogramming;

public class Factory {
	static int count = 0;

	public static MyObjectChild getInstance() {
		if (count < 100) {
			count++;
			return new MyObjectChild();
		} else {
			return null;
		}
	}

}
