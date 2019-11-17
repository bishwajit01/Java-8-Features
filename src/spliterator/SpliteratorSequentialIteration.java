package spliterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.List;

/**
 * @author Bishwajit. Spliterator
 *
 */
public class SpliteratorSequentialIteration {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		// Adding Elemets in a list.
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		// Using Spliterator.
		Spliterator<String> itr = list.spliterator();
		itr.forEachRemaining(System.out::print);
	}

}
