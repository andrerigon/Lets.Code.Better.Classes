package examples.goodpractices.staticmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SmartOne {
	public static void main(String[] args) {
		final List<String> list1 = Arrays.asList("a", "b");
		final List<String> list2 = new LinkedList<String>();

		System.out.println(Collections.unmodifiableList(list1).getClass()
				.getName());
		System.out.println(Collections.unmodifiableList(list2).getClass()
				.getName());
	}
}
