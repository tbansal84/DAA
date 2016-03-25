package tbansal.problems.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class ObjectControl {

	static int count = 0;

	public ObjectControl() {
		if (count > 1) {
			throw new RuntimeException();
		} else
			count++;
	}

	
}
